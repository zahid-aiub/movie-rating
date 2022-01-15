package com.amd.project.exception;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@Getter
@Setter
@NoArgsConstructor
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ResourceNotFoundException extends RuntimeException {
    private String id;
    private ErrorCode code;

    public ResourceNotFoundException(Object id, ErrorCode codes) {
        super(String.format(codes.getMessage(), id));
        this.id = (String) id;
        this.code = codes;
    }
}
