package be.intecbrussel.taskmanager.service;

import be.intecbrussel.taskmanager.model.entity.UserEntity;
import org.springframework.stereotype.Service;
import java.util.Collection;

@Service
public interface UserService  {
    UserEntity getUserById (Long id);
    UserEntity saveUser (UserEntity userEntity);
    UserEntity updateUser(UserEntity userEntity);
    void deleteUser(UserEntity userEntity);
    Collection<UserEntity> getAllUserEntities();
}
