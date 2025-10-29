package com.hackathon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon.dto.ModelDto;
import com.hackathon.model.Model;
import com.hackathon.service.ModelService;

import jakarta.transaction.Transactional;

@RestController
@RequestMapping("/model")
public class ModelController {

	@Autowired
	private ModelService service;
	
	@Transactional
	@PostMapping(path = "/save")
	public ResponseEntity<Model> listarDocumentosAlx005(@RequestBody ModelDto dto) {
		return ResponseEntity.ok(service.save(dto));
	}
	
}
