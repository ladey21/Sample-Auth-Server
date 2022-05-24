package com.dev.sampleauthserver.model;

import com.dev.sampleauthserver.common.BaseClass;
import com.dev.sampleauthserver.enums.Gender;
import com.dev.sampleauthserver.enums.Role;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.Collection;
import java.util.List;

@Getter
@Setter
@Entity
@ToString
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
public class User extends BaseClass {

    @Column(name = "username")
    private String username;

    @Column(nullable = false)
    private String fullName;

    @Email(message = "email is not properly formatted")
    @NotEmpty
    @Column(unique = true,nullable = false,name = "email")
    private String email;

    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private LocalDate dateOfBirth;

    @NotNull
    @Column(length = 15)
    private String phone;

    @Column(length = 512)
    private String password;

    @ElementCollection(targetClass = Role.class, fetch = FetchType.EAGER)
    @CollectionTable(name = "user_role")
    @Column(name = "role",nullable = false)
    @Enumerated(EnumType.STRING)
    private List<Role> roles;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private String passwordToken;

    @ManyToOne(cascade = CascadeType.ALL)
    private Organization organization;

    private String avatarUrl;

    private boolean accountNonExpired;

    private boolean accountNonLocked;

    private boolean credentialNonExpired;

    private boolean enabled;

    private boolean isAccountNonExpired(){return true;}

    private boolean isAccountNonLocked(){return true;}

    private boolean isCredentialNonExpired(){return true;}

    private boolean isEnabled(){return true;}

    public User(Long id, String username){
        this.setId(id);
        this.username = username;
    }

    public User(String name, String email, String phoneNo, String password, Role role){
        this.username = name;
        this.email = email;
        this.phone = phoneNo;
        this.password = password;
        this.roles = roles;
    }

//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities(){
//
//    }
}
