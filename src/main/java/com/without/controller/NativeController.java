package com.without.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.without.service.NativeService;
@RestController
public class NativeController {
	
	@Autowired
	private NativeService nativeService;
	
	@GetMapping("/get")
	public List<Object[]> getResult(){
		
		return nativeService.getResult();
	}

}
