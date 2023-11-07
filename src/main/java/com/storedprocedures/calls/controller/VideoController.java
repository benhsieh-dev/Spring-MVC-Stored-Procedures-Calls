package com.storedprocedures.calls.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.storedprocedures.calls.dao.VideoDao;
import com.storedprocedures.calls.model.Video;

@RestController
public class VideoController {
	
	@Autowired
	private VideoDao dao; 
	
	public List<Video> findVideos() {
		return dao.getVideoInfo(); 
	}

}
