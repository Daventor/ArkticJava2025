package com.ironahck.w3d4.repository;

import com.ironahck.w3d4.model.Address;
import com.ironahck.w3d4.model.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TeacherRepositoryTest {

    @Autowired
    TeacherRepository teacherRepository;

    @Autowired
    AddressRepository addressRepository;

    @Test
    public void findAll_teachers_teacherList(){
        Address address = new Address("Fake Street", "123");
        addressRepository.save(address);
        Teacher teacher = new Teacher("John Doe", address);
        teacherRepository.save(teacher);

        List<Teacher> teacherList = teacherRepository.findAll();
        System.out.println(teacherList);

        assertEquals(3, teacherList.size());
    }

    @Test
    public void findById_validId_correctTeacher(){
        Optional<Teacher> teacherOptional = teacherRepository.findById(1);
        assertTrue(teacherOptional.isPresent());

        System.out.println(teacherOptional.get());
        assertEquals("Alberto García", teacherOptional.get().getTeacher());
    }

    @Test
    public void findById_invalidId_teacherNotPresent(){
        Optional<Teacher> teacherOptional = teacherRepository.findById(999);
        assertTrue(teacherOptional.isEmpty());
    }
}