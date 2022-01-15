package com.amd.project.exception;

import com.amd.project.config.Constrain;

public enum ErrorCode {
    AR_0000(Constrain.APPROVAL_REQUEST_NOT_FOUND);

    private String message;

    ErrorCode(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}
