package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Team;
import com.example.demo.repo.TeamRepository;
import com.example.demo.service.ServiceI;
@Service
public class Serviceimpl implements ServiceI
{
  @Autowired
  TeamRepository tr;

@Override
public Team saveTeamDetails(Team team) {
	
	return tr.save(team);
}

@Override
public List<Team> getAll() {
	
	
	return (List<Team>) tr.findAll();
}
  
	
	
}
