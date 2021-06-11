package be.intecbrussel.taskmanager.service.impl;

import be.intecbrussel.taskmanager.model.entity.UserEntity;
import be.intecbrussel.taskmanager.repository.UserRepository;
import be.intecbrussel.taskmanager.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public UserEntity getUserById(Long id) {
        return userRepository.getById(id);
    }

    @Override
    public UserEntity saveUser(UserEntity userEntity) {
        return userRepository.save(userEntity);
    }

    @Override
    public UserEntity updateUser(UserEntity userEntity) {
        return userRepository.save(userEntity);
    }

    @Override
    public void deleteUser(UserEntity userEntity) {
        userRepository.deleteById(userEntity.getId());
    }

    @Override
    public Collection<UserEntity> getAllUserEntities() {
        return userRepository.findAll();
    }
}
