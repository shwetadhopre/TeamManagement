package com.example.demo.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.exception.TeamIDNotFoundException;
import com.example.demo.model.Team;
import com.example.demo.repo.TeamRepository;
import com.example.demo.service.ServiceI;

@Service
public class Serviceimpl implements ServiceI {
	@Autowired
	TeamRepository tr;

	@Override
	public Team saveTeamDetails(Team team) {

		return tr.save(team);
	}

@Override

public Team updateData(Team team, int id) {
	
	Optional<Team> op=tr.findById(id);
	
	if(op.isPresent()) {
		
		return tr.save(team);
	}
	else {
	    throw new TeamIDNotFoundException("Team ID Not Found..");
	}
}

	public List<Team> getAll() {

		return (List<Team>) tr.findAll();
	}

	@Override
	public Team getSingleData(int id) {

		Optional<Team> optional = tr.findById(id);

		if (optional.isPresent()) {

			Team team = optional.get();

			return team;

		} else {

			throw new TeamIDNotFoundException("team id not match");
		}

	}

}
