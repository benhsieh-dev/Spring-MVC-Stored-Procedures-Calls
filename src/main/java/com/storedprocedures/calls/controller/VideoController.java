package com.storedprocedures.calls.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.storedprocedures.calls.dao.VideoDao;

@RestController
public class VideoController {
	
	@Autowired
	private VideoDao dao; 

}
