package com.hackathon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hackathon.dto.ModelDto;
import com.hackathon.model.Model;
import com.hackathon.repository.ModelRepository;

@Service
public class ModelServiceImpl implements ModelService{
	
	@Autowired
	private ModelRepository repo;
	

	@Override
	public Model save(ModelDto dto) {
		return repo.save(dto.toModel());
	}

}
