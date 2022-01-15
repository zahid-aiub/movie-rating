package com.amd.project.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@Data
@NoArgsConstructor
@ResponseStatus(HttpStatus.BAD_REQUEST)
@EqualsAndHashCode(callSuper = false)
public class BadRequestException extends RuntimeException {
    ErrorCode errorCode;

    public BadRequestException(ErrorCode codes) {
        super(codes.getMessage());
        this.errorCode = codes;
    }
}
