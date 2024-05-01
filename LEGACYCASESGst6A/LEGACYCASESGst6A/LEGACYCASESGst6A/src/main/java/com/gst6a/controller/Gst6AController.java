package com.gst6a.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gst6a.entity.Gst6A;
import com.gst6a.repository.Gst6ARepository;

@RestController
public class Gst6AController {
	@Autowired
	private Gst6ARepository gst6aRepository;
	@GetMapping("/getgst6A")
	public List<Gst6A> findGst6A(){
		return gst6aRepository.getGst6Ainfo();
	}

}
