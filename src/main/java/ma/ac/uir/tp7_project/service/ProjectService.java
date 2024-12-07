package ma.ac.uir.tp7_project.service;

import ma.ac.uir.tp7_project.entity.Project;
import java.util.List;

public interface ProjectService {

    Project createProject(Project project);

    Project getProjectById(Long id);

    List<Project> getAllProjects();

    Project updateProject(Long id, Project project);

    void deleteProject(Long id);

    List<Project> findProjectsBySkill(String skill);

    List<Project> getProjectsByDeveloperId(Long developerId);
}