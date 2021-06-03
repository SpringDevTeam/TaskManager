package be.intecbrussel.taskmanager.repository;

import be.intecbrussel.taskmanager.model.entity.ProjectEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository  extends JpaRepository<ProjectEntity,Long> {
}
