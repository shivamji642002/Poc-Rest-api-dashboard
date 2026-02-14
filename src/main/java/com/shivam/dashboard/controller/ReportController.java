package com.shivam.dashboard.controller;

import com.shivam.dashboard.entity.Project;
import com.shivam.dashboard.repository.ProjectRepository;
import org.springframework.web.bind.annotation.*;

        import java.util.List;

@RestController
@RequestMapping("/api/report")
public class ReportController {

    private final ProjectRepository repository;

    public ReportController(ProjectRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/budget")
    public Double totalBudget() {
        return repository.findAll()
                .stream()
                .mapToDouble(Project::getBudget)
                .sum();
    }
}
