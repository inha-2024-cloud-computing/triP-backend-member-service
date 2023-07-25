package com.solution.loginSolution.User.General.DTO;

import com.solution.loginSolution.User.General.Entity.Role;
import com.solution.loginSolution.User.General.Entity.GeneralUser;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.solution.loginSolution.User.Common.enums.UserType.NORMAL;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRegisterRequestDTO {
    @NotBlank
    @Email
    private String userEmail;

    @NotBlank
    private String userName;

    @NotBlank
    private String password;

    public GeneralUser toEntity(String encodedPassword) {
        return GeneralUser.builder()
                .userType(NORMAL)
                .userName(userName)
                .userEmail(userEmail)
                .userPassword(encodedPassword)
                .role(Role.ROLE_MEMBER)
                .build();
    }
}