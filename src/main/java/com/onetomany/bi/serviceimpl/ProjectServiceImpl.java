package com.onetomany.bi.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onetomany.bi.entity.Project;
import com.onetomany.bi.repository.ProjectRepository;
import com.onetomany.bi.service.ProjectService;

@Service
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	private ProjectRepository projectRepository;

	@Override
	public List<Project> getAllProjects() {
		List<Project> projects = projectRepository.findAll();
		if (projects.size() > 0)
			return projects;
		else
			return null;
	}

	@Override
	public Project createProject(Project project) {
		Project createProject = projectRepository.save(project);
		return createProject;
	}

	@Override
	public Project getProjectbyId(String projectId) {
		Project project = projectRepository.findById(projectId).orElse(null);
		return project;
	}

	@Override
	public Optional<Project> getProjectbyName(String projectName) {
		Optional<Project> projects = projectRepository.findById(projectName);
		return projects;
	}

}
