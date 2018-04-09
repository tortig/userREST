package com.egs.trainings.service;

import com.egs.trainings.entity.User;
import java.util.List;

public interface UserService {

    List<User> getAll();
    User getByID(long id);
    User save(User user);
    void remove(long id);
    void update(long id, User user);
}
