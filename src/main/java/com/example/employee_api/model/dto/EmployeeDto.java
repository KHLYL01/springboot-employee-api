package com.example.employee_api.model.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class EmployeeDto {

    private String fullname;
    private String birthdate;
    private String job;
    private int salary;

}
