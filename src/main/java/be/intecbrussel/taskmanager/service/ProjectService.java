package be.intecbrussel.taskmanager.service;

import be.intecbrussel.taskmanager.model.entity.ProjectEntity;

import java.util.Collection;

public interface ProjectService {

    ProjectEntity  getProjectEntityById(Long id);
    Collection<ProjectEntity> getAllProjectEntities();
    ProjectEntity  save(ProjectEntity projectEntity);
    ProjectEntity  update(ProjectEntity projectEntity);
    void delete(ProjectEntity projectEntity);

}
