package com.storedprocedures.calls.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
public class Video {
	@Id
	private int id;
	private String title;
	private String url;
	private String username; 
	private String country;
	

}
