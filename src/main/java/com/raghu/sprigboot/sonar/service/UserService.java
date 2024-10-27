package com.raghu.sprigboot.sonar.service;

import com.raghu.sprigboot.sonar.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserService {

    private Map<Long,User> users = new HashMap<>();

    public List<User> findAll(){
        users.put(1L, User.builder().id(1L).username("raghu").firstName("Raghu").lastName("P").build());

        users.put(2L, User.builder().id(2L).username("vedha").firstName("Vedha").lastName("Viraagh").build());
        users.put(3L, User.builder().id(3L).username("hanshu").firstName("Hanshith").lastName("P").build());
        List<User> list = new ArrayList<>(users.values());
        System.out.println("Users List is"+list);
        
        return list;
        
    }
}
