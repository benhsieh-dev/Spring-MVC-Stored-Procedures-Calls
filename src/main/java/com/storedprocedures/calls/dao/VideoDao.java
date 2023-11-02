package com.storedprocedures.calls.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.storedprocedures.calls.model.Video;

import jakarta.persistence.EntityManager;

@Repository
public class VideoDao {
	
	@Autowired
	private EntityManager em; 
	
	@SuppressWarnings("unchecked")
	public List<Video> getVideoInfo() {
		return em.createStoredProcedureQuery("firstProcedure").getResultList();
	}

}
