package com.dev.sampleauthserver.model;

import com.dev.sampleauthserver.common.BaseClass;
import com.dev.sampleauthserver.enums.MonthlyPaymentStatus;
import com.dev.sampleauthserver.enums.PaymentType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Builder
@Setter
@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "monthly_summary")
public class MonthlySummary extends BaseClass implements Comparable<MonthlySummary> {

    private int month;

    private int year;

    private MonthlyPaymentStatus status = MonthlyPaymentStatus.PENDING;

    private BigDecimal totalPaid;

    private BigDecimal amountDue;

    private BigDecimal amountBroughtForward;

    private BigDecimal loanBalance;

    private LocalDate dueDate;

    private BigDecimal amountPaidForThisMonth = BigDecimal.ZERO;

    @JsonIgnore
    @ManyToOne
    @Cascade(CascadeType.SAVE_UPDATE)
    private Loan loan;

    @Enumerated
    private PaymentType paymentType = PaymentType.RENTAL;

    @OneToMany(fetch = FetchType.EAGER, cascade = javax.persistence.CascadeType.ALL)
    private List<Transaction> currentMonthRepayments;

    @Override
    public int compareTo(MonthlySummary o) {
        if(this.getYear() > o.getYear()){
            return 1;
        } else if (this.getYear() < o.getYear()){
            return -1;
        } else {
            return Integer.compare(this.getMonth(),o.getMonth());
        }
    }

    @Override
    public String toString() {
        return "MonthlySummary{" +
                "month=" + month +
                ", year=" + year +
                ", status=" + status +
                ", totalPaid=" + totalPaid +
                ", amountDue=" + amountDue +
                ", amountBroughtForward=" + amountBroughtForward +
                ", loanBalance=" + loanBalance +
                ", dueDate=" + dueDate +
                ", amountPaidForThisMonth=" + amountPaidForThisMonth +
                ", loan=" + loan +
                ", paymentType=" + paymentType +
                '}';
    }
}
