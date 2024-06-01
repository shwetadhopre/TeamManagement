package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Team {
	@Id
	private int id;
	private String tname;
	private String tcompany;
	private String addr;

}
