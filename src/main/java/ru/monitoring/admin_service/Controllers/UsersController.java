package ru.monitoring.admin_service.Controllers;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import lombok.AllArgsConstructor;
import ru.monitoring.admin_service.Service.UserServiceInterface;

@Controller
@AllArgsConstructor
public class UsersController {

    private UserServiceInterface userService;
    
    @MessageMapping("/users/create")
    @SendTo("/users/create")
    public void create() {
        
    }

    @MessageMapping("/users/update")
    @SendTo("/users/update")
    public void update() {

    }

    @MessageMapping("/users/delete")
    @SendTo("/users/delete")
    public void delete() {

    }
}
