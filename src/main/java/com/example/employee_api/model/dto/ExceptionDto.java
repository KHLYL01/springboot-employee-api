package com.example.employee_api.model.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@Builder
public class ExceptionDto {

    private Date timestamp;
    private int statusCode;
    private String message;

}
