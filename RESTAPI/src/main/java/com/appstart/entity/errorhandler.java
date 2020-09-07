package com.appstart.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.TypeMismatchException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingPathVariableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import org.springframework.web.servlet.mvc.multiaction.NoSuchRequestHandlingMethodException;
@ControllerAdvice
public class errorhandler extends ResponseEntityExceptionHandler {

	@Override
	protected ResponseEntity<Object> handleHttpRequestMethodNotSupported(HttpRequestMethodNotSupportedException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		String message =ex.getMessage();
		List<String>details=new ArrayList<>();
		details.add("wrong HTTP call");
		ApiErrors api=new ApiErrors(message,details,status,LocalDateTime.now());
		return ResponseEntity.status(status).body(api);
	}

	@Override
	protected ResponseEntity<Object> handleHttpMediaTypeNotSupported(HttpMediaTypeNotSupportedException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		String message =ex.getMessage();
		List<String>details=new ArrayList<>();
		details.add("IT SUPPORTS ONLY XML FORMAT ");
		ApiErrors api=new ApiErrors(message,details,status,LocalDateTime.now());
		return ResponseEntity.status(status).body(api);
	}

	@Override
	protected ResponseEntity<Object> handleTypeMismatch(TypeMismatchException ex, HttpHeaders headers,
			HttpStatus status, WebRequest request) {
		String message =ex.getMessage();
		List<String>details=new ArrayList<>();
		details.add("id is not in number format");
		ApiErrors api=new ApiErrors(message,details,status,LocalDateTime.now());
		return ResponseEntity.status(status).body(api);
	}





}
