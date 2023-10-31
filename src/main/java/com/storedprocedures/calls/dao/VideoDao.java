package com.storedprocedures.calls.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;

@Repository
public class VideoDao {
	
	@Autowired
	private EntityManager em; 

}
