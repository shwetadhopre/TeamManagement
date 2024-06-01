package com.example.demo.service;

import com.example.demo.model.Team;

public interface ServiceI {

	Team saveTeamDetails(Team team);

	Team updateData(Team team, int id);

}
