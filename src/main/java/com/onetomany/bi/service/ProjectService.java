package com.onetomany.bi.service;

import java.util.List;

import com.onetomany.bi.entity.Project;

public interface ProjectService {

	public List<Project> getAllProjects();

	public Project createProject(Project project);

	public Project getProjectbyId(String projectId);

	public Project getProjectbyName(String projectName);
}
