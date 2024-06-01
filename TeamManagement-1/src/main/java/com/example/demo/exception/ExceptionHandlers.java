package com.example.demo.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.demo.dto.Responsedto;

@RestControllerAdvice
public class ExceptionHandlers {

	
	@ExceptionHandler(NameIsNotFoundException.class)
	public ResponseEntity<Responsedto> handlerexception(NameIsNotFoundException tname) {
		Responsedto repo = new Responsedto();
		repo.setMessage("name is not valid");
		repo.setTimestamp(new Date());
		return new ResponseEntity<Responsedto>(repo, HttpStatus.BAD_REQUEST);
	}


	@ExceptionHandler(TeamIDNotFoundException.class)
	public ResponseEntity<Responsedto> handlerException(TeamIDNotFoundException tid){
		Responsedto repo=new Responsedto();
		repo.setMessage("Team ID Not valid..");
		repo.setTimestamp(new Date());
		return new ResponseEntity<Responsedto>(repo,HttpStatus.BAD_REQUEST);
		
	}
	

}
