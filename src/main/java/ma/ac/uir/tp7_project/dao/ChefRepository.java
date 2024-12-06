package ma.ac.uir.tp7_project.dao;

import ma.ac.uir.tp7_project.entity.Chef;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChefRepository extends JpaRepository<Chef, Integer> {
}
