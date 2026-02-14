package com.shivam.dashboard.controller;
import com.shivam.dashboard.dto.DashboardDTO;
import com.shivam.dashboard.service.DashboardService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/dashboard")
public class DashboardController {

    private final DashboardService service;

    public DashboardController(DashboardService service) {
        this.service = service;
    }

    @GetMapping
    public DashboardDTO getDashboard() {
        return service.getDashboardData();
    }
}
