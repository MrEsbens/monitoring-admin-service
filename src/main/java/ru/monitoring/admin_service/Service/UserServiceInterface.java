package ru.monitoring.admin_service.Service;

import java.util.List;
import ru.monitoring.admin_service.Models.User;

public interface UserServiceInterface {
    List<User> getAllUsers();
    User getUserById(String id);
    void createUser(User user);
    void updateUser(User user);
    void deleteUser(String id);
}
