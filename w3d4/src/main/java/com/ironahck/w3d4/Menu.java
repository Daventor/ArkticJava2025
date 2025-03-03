package com.ironahck.w3d4;

import com.ironahck.w3d4.model.Teacher;
import com.ironahck.w3d4.repository.TeacherRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
public class Menu {
    @Autowired
    private TeacherRepository teacherRepository;

    public void menuCommands(){
        System.out.println("Show commands ... \n1. Add a book\n2....");
        List<Teacher> teacherList = teacherRepository.findAll();
        System.out.println(teacherList);

        log.info("This is a log");
    }
}
