package com.shivam.dashboard.service;
import com.shivam.dashboard.dto.DashboardDTO;
import com.shivam.dashboard.repository.ProjectRepository;
import org.springframework.stereotype.Service;

@Service
public class DashboardService {

    private final ProjectRepository repository;

    public DashboardService(ProjectRepository repository) {
        this.repository = repository;
    }

    public DashboardDTO getDashboardData() {
        long total = repository.count();
        long completed = repository.countByStatus("Completed");
        long inProgress = repository.countByStatus("In Progress");

        return new DashboardDTO(total, completed, inProgress);
    }
}
