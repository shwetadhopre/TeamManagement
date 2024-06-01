package com.example.demo.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Team;

@Repository
public interface TeamRepository extends CrudRepository<Team, Integer>
{

	Optional<Team> findByTname(String tname);

	

}
