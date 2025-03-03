package com.ironhack.w4d1.controller.impl;

import com.ironhack.w4d1.controller.interfaces.ITeacherController;
import com.ironhack.w4d1.model.Teacher;
import com.ironhack.w4d1.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/teachers")
public class TeacherController implements ITeacherController {

    @Autowired
    TeacherRepository teacherRepository;

    @GetMapping("")
    @ResponseStatus(HttpStatus.OK)
    public List<Teacher> getAllTeachers(){
        return teacherRepository.findAll();
    }

    @GetMapping("/{id}")
    public Teacher getTeacherById(@PathVariable(name = "id") Integer id){
        Optional<Teacher> teacherOptional = teacherRepository.findById(id);
        if(teacherOptional.isEmpty()) return null;
        return teacherOptional.get();
    }
}
