package com.solution.loginSolution.JWT.DTO;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ValidateAccessTokenRequestDTO {
    @NotBlank
    private String accessToken;
}
