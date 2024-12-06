package ma.ac.uir.tp7_project.service;

import ma.ac.uir.tp7_project.entity.Employee;
import ma.ac.uir.tp7_project.entity.Project;

import java.util.List;

public interface ProjectService {
    List<Project> findAllProject();
    Project findProjectById(int theId);
    Project saveProject(Project theProject);
    Project updateProject(Project theProject);
    void deleteProjectById(int theId);

}
