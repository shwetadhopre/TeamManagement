package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Team;

public interface ServiceI {

	Team saveTeamDetails(Team team);

	List<Team> getAll();

	Team getSingleData(int id);

}
