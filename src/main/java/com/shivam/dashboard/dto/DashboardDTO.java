package com.shivam.dashboard.dto;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DashboardDTO {

    private long totalProjects;
    private long completedProjects;
    private long inProgressProjects;
}
