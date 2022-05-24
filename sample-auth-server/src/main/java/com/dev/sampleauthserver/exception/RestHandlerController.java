package com.dev.sampleauthserver.exception;

import com.dev.sampleauthserver.payload.ApiResponse;
import com.dev.sampleauthserver.payload.ApiSubError;
import com.dev.sampleauthserver.payload.ApiValidationError;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@ControllerAdvice
public class RestHandlerController extends ResponseEntityExceptionHandler {

    private ResponseEntity<Object> buildResponseEntity(ApiError apiError){
        return new ResponseEntity<>(apiError,apiError.getStatus());
    }

    private ResponseEntity<Object> buildResponseEntity(ApiResponse apiResponse){
        return new ResponseEntity<>(apiResponse, apiResponse.getStatus());
    }

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        List<ApiSubError> collect = ex.getBindingResult().getFieldErrors().stream()
                .map(error -> ApiValidationError.builder()
                .object(error.getObjectName())
                .field(error.getField())
                .rejectedValue(error.getRejectedValue())
                .message(error.getDefaultMessage())
                .build()).collect(Collectors.toList());

        var build = ApiResponse.builder()
                .error("Invalid Argument")
                .status(HttpStatus.BAD_REQUEST)
                .success(false)
                .subErrors(collect)
                .debugMessage("invalid Argument")
                .build();

        return buildResponseEntity(build);
    }

    @ExceptionHandler(NotVerifiedException.class)
    protected ResponseEntity<Object> handleNotVerifiedException(NotVerifiedException ex){
        ApiError apiError = ApiError.builder().status(HttpStatus.FORBIDDEN)
                .message(ex.getMessage()).debugMessage(ex.debugMessage).build();
        return buildResponseEntity(apiError);
    }


    @ExceptionHandler(InvalidAuthDetailsException.class)
    protected ResponseEntity<Object> handleInvalidationAuthDetailsException(InvalidAuthDetailsException ex){
        ApiError apiError = ApiError.builder().status(HttpStatus.valueOf(401))
                .message(ex.getMessage())
                .debugMessage("Enter correct password or reset your password")
                .timestamp(LocalDateTime.now())
                .build();
        return buildResponseEntity(apiError);
    }

    @ExceptionHandler(NotFoundException.class)
    protected ResponseEntity<Object> handleNotFoundException(NotFoundException ex){
        ApiError apiError = ApiError.builder().status(HttpStatus.NOT_FOUND)
                .message(ex.getMessage()).debugMessage(ex.debugMessage).build();
        return buildResponseEntity(apiError);
    }

    @ExceptionHandler(AlreadyExistException.class)
    protected ResponseEntity<Object> handleAlreadyExistException(AlreadyExistException ex){
        ApiError apiError = ApiError.builder().status(HttpStatus.BAD_REQUEST)
                .message(ex.getMessage()).debugMessage(ex.debugMessage).build();
        return buildResponseEntity(apiError);
    }

    @ExceptionHandler(InvalidResourceException.class)
    protected ResponseEntity<Object> handleInvalidResourceException(InvalidResourceException ex){
        ApiError apiError = ApiError.builder().status(HttpStatus.NOT_FOUND)
                .message(ex.getMessage()).debugMessage(ex.debugMessage).build();
        return buildResponseEntity(apiError);
    }

    @ExceptionHandler(LimitExceededException.class)
    protected ResponseEntity<Object> handleLimitExceededException(LimitExceededException ex){
        ApiError apiError = ApiError.builder().status(HttpStatus.BAD_REQUEST)
                .message(ex.getMessage()).debugMessage(ex.debugMessage).build();
        return buildResponseEntity(apiError);
    }

    @ExceptionHandler(IllegalArgumentException.class)
    protected ResponseEntity<Object> handleIllegalArgumentsException(IllegalAccessException ex){
        ApiError apiError = ApiError.builder().status(HttpStatus.BAD_REQUEST)
                .message(ex.getMessage()).build();
        return buildResponseEntity(apiError);
    }

    @ExceptionHandler(NotLoggedInException.class)
    protected ResponseEntity<Object> handleNotLoggedInException(NotLoggedInException ex){
        ApiError apiError = ApiError.builder().status(HttpStatus.UNAUTHORIZED)
                .message(ex.getMessage()).debugMessage(ex.debugMessage).build();
        return buildResponseEntity(apiError);
    }

    protected ResponseEntity<?> handleGenericException(GenericException ex){
        ApiError apiError = ApiError.builder()
                .status(HttpStatus.BAD_REQUEST)
                .message(ex.getMessage())
                .debugMessage(ex.getDebugMessage())
                .build();
        return buildResponseEntity(apiError);
    }
}
