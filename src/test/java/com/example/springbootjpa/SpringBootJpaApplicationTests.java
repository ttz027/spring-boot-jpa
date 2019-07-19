package com.example.springbootjpa;

import com.example.springbootjpa.dao.SchoolRepository;
import com.example.springbootjpa.entity.Schools;
import com.example.springbootjpa.entity.Teacher;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootJpaApplicationTests {

    @Autowired
    SchoolRepository schoolRepository;
    @Test
    public void contextLoads() {
        List<Schools> all = schoolRepository.findAll();
        for (Schools s:all) {
            for(Teacher t :s.getTeachers()){
                System.out.println(t.getName()+"===");
            }

        }
    }

}
