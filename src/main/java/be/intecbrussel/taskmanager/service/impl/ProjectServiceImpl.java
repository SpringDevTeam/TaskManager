package be.intecbrussel.taskmanager.service.impl;

import be.intecbrussel.taskmanager.model.entity.ProjectEntity;
import be.intecbrussel.taskmanager.repository.ProjectRepository;
import be.intecbrussel.taskmanager.service.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@RequiredArgsConstructor
public class ProjectServiceImpl implements ProjectService {

    private final ProjectRepository projectRepository;

    @Override
    public ProjectEntity getProjectEntityById(Long id) {
        return projectRepository.getById(id);
    }

    @Override
    public Collection<ProjectEntity> getAllProjectEntities() {
        return projectRepository.findAll();
    }

    @Override
    public ProjectEntity save(ProjectEntity projectEntity) {
        return projectRepository.save(projectEntity);
    }

    @Override
    public ProjectEntity update(ProjectEntity projectEntity) {
        return projectRepository.save(projectEntity);
    }

    @Override
    public void delete(ProjectEntity projectEntity) {
        projectRepository.delete(projectEntity);
    }
}
