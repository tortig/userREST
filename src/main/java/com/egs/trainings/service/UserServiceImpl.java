package com.egs.trainings.service;

import com.egs.trainings.entity.User;
import com.egs.trainings.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    public List<User> getAll() {
        return repository.findAll();
    }

    public User getByID(long id) {
        return repository.findOne(id);
    }

    public User save(User user) {
        return repository.saveAndFlush(user);
    }

    public void remove(long id) {
        repository.delete(id);
    }

    @Override
    public void update(long id, User user) {

        user.setId(id);
        repository.saveAndFlush(user);
    }
}
