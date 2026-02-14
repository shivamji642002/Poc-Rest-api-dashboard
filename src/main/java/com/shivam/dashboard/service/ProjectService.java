package com.shivam.dashboard.service;
import com.shivam.dashboard.entity.Project;
import com.shivam.dashboard.repository.ProjectRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {

    private final ProjectRepository repository;

    public ProjectService(ProjectRepository repository) {
        this.repository = repository;
    }

    public Project create(Project project) {
        return repository.save(project);
    }

    public List<Project> getAll() {
        return repository.findAll();
    }

    public Project update(Long id, Project project) {
        Project existing = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Project not found"));
        existing.setName(project.getName());
        existing.setStatus(project.getStatus());
        existing.setBudget(project.getBudget());
        existing.setClientName(project.getClientName());
        return repository.save(existing);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
