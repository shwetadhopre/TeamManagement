package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Team;

public interface ServiceI {

	Team saveTeamDetails(Team team);


	List<Team> getAll();

	Team getSinglename(String tname);


	Team getSingleData(int id);


	Team updateData(Team team, int id);

}
