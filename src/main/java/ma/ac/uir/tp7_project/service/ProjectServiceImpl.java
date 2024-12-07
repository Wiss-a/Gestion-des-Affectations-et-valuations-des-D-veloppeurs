package ma.ac.uir.tp7_project.service;

import ma.ac.uir.tp7_project.entity.Project;
import ma.ac.uir.tp7_project.dao.ProjectRepository;
import ma.ac.uir.tp7_project.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    @Override
    public Project createProject(Project project) {
        return projectRepository.save(project);
    }

    @Override
    public Project getProjectById(Long id) {
        Optional<Project> project = projectRepository.findById(id);
        return project.orElse(null);
    }

    @Override
    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    @Override
    public Project updateProject(Long id, Project project) {
        if (projectRepository.existsById(id)) {
            project.setId(id);
            return projectRepository.save(project);
        }
        return null;
    }

    @Override
    public void deleteProject(Long id) {
        projectRepository.deleteById(id);
    }

    @Override
    public List<Project> findProjectsBySkill(String skill) {
        return projectRepository.findByRequiredSkillsContaining(skill);
    }

    @Override
    public List<Project> getProjectsByDeveloperId(Long developerId) {
        return projectRepository.findByAssignedDevelopersId(developerId);
    }
}