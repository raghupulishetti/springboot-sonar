package com.raghu.sprigboot.sonar.service;

import com.raghu.sprigboot.sonar.model.User;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @InjectMocks
    private UserService userService;


    @Test
    public void shouldFinAll(){
       List<User> users =  userService.findAll();
        assertTrue(!users.isEmpty());
    }
}
