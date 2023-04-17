package com.onetomany.bi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onetomany.bi.entity.Project;

public interface ProjectRepository extends JpaRepository<Project, String> {

}
