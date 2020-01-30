package com.wipcamp.userservice.requests;

import lombok.Data;

import lombok.NoArgsConstructor;

import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.constraints.Pattern;

@Data
@NoArgsConstructor
public class UpdateUserStatusRequest {
	@Pattern(regexp = "(accept,register,general,answer,submit)",message = "status must only in pattern")
	private String status;
	private boolean value;
}
