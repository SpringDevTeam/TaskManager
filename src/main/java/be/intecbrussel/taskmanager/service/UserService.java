package be.intecbrussel.taskmanager.service;

import be.intecbrussel.taskmanager.model.JobTitle;
import be.intecbrussel.taskmanager.model.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface UserService extends CrudRepository {
    Set<UserEntity> findByFirstName (String firstName);
    Set<UserEntity> findByLastName (String lastName);
    Set<UserEntity> findByJobTitle (JobTitle jobTitle);
}
