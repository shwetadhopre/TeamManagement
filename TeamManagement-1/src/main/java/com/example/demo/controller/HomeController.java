package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.model.Team;
import com.example.demo.service.ServiceI;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class HomeController 
{
   @Autowired
   ServiceI si;
   
   
   @PostMapping("/team")
	public ResponseEntity<Team> createTeam(@RequestBody Team team) {
	   
		Team savedTeam = si.saveTeamDetails(team);

		return new ResponseEntity<Team>(savedTeam, HttpStatus.CREATED);
	}

	 @PutMapping("teamupdate/{id}")
	 public ResponseEntity<Team> putMethodName(@PathVariable int id, @RequestBody Team team) {
	 	
		 Team updateTeam=si.updateData(team,id);
	 	
	 	return new ResponseEntity<Team>(updateTeam,HttpStatus.OK);
	 }
   
    
   
   
	
	
}
