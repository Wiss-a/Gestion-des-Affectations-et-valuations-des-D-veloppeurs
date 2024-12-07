package ma.ac.uir.tp7_project.dao;

import ma.ac.uir.tp7_project.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ProjectRepository extends JpaRepository<Project, Long> {
    List<Project> findByRequiredSkillsContaining(String skill);
    List<Project> findByAssignedDevelopersId(Long developerId);
}