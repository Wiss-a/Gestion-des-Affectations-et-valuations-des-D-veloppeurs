package ma.ac.uir.tp7_project.service;

import ma.ac.uir.tp7_project.dao.ProjectRepository;
import ma.ac.uir.tp7_project.entity.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ProjectServiceImpl implements ProjectService {
    private ProjectRepository projectRepository;
    @Autowired
    public ProjectServiceImpl(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @Override
    public List<Project> findAllProject() {
        return projectRepository.findAll();
    }

    @Override
    public Project findProjectById(int theId) {
        Optional<Project> result = projectRepository.findById(theId);

        Project theProject = null;

        if (result.isPresent()) {
            theProject = result.get();
        }
        else {
            throw new RuntimeException("!find Project id - " + theId);
        }
        return theProject;
    }

    @Override
    public Project saveProject(Project theProject) {
        return projectRepository.save(theProject);
    }

    @Override
    public Project updateProject(Project theProject) {
        return projectRepository.save(theProject);
    }

    @Override
    public void deleteProjectById(int theId) {
    projectRepository.deleteById(theId);
    }
}
