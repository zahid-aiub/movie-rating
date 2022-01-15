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
public class InvalidActionException extends RuntimeException {
	ErrorCode errorCode;

	public InvalidActionException(ErrorCode codes) {
		super(codes.getMessage());
		this.errorCode = codes;
	}

	public InvalidActionException(ErrorCode codes, Object... args) {
		super(String.format(codes.getMessage(), args));
		this.errorCode = codes;
	}
}
