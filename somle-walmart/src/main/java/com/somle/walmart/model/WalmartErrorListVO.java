package com.somle.walmart.model;

import lombok.Data;

import java.util.List;

@Data
public class WalmartErrorListVO {
    private List<ErrorDetail> errors;

    @Data
    public class ErrorDetail {
        private String code;
        private String message;
        private String details;
    }
}


