package com.company.practice15.src.main.java.ru.mirea.dto;

import com.sun.istack.NotNull;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Setter
public class StudentResponse {
    @NotNull
    private Long id;
    @NotBlank
    private String firstName;
    @NotBlank
    private String lastName;
    private String middleName;
}
