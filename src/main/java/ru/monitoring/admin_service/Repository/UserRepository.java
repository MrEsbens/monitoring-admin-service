package ru.monitoring.admin_service.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.monitoring.admin_service.Models.User;

public interface UserRepository extends JpaRepository <User, String> {
    
}
