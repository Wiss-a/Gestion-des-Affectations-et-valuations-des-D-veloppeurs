package ma.ac.uir.tp7_project.dao;
import ma.ac.uir.tp7_project.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
