package ru.monitoring.admin_service.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue
    private String id;
    @Column(unique = true)
    private String login;
    @Column(unique = true)
    private String email;
    private String password_hash;
    private String farm_id;
    private String role;
}
