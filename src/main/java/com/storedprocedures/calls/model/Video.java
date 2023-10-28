package com.storedprocedures.calls.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedStoredProcedureQueries;
import jakarta.persistence.NamedStoredProcedureQuery;
import jakarta.persistence.StoredProcedureParameter;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
@NamedStoredProcedureQueries({ @NamedStoredProcedureQuery(name = "firstProcedure", procedureName = "getVideos"),
		@NamedStoredProcedureQuery(name = "secondProcedure", procedureName = "getVideosByUsername", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "tusername", type = String.class) }) })
public class Video {
	@Id
	private int id;
	private String title;
	private String url;
	private String username;
	private String country;

}
