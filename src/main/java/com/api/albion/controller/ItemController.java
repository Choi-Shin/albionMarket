package com.api.albion.controller;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ItemController {

	@GetMapping("/get/item")
	public ResponseEntity<Map<String,Object>> getItem() {
		
		return new ResponseEntity<>(null,HttpStatus.OK);
		
	}
}
