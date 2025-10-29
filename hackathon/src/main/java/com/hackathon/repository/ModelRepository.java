package com.hackathon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hackathon.model.Model;

public interface ModelRepository extends JpaRepository<Model, Long>{

}
