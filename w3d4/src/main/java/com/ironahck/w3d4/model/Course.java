package com.ironahck.w3d4.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Course {
    @Id
    private String course;
    private Integer hours;
    private String classroom;
    private String vacations;

    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;

//    @ManyToMany(mappedBy = "courses")
//    List<Student> students;

    public Course() {
    }

    public Course(String course, Integer hours, String classroom, String vacations, Teacher teacher) {
        this.course = course;
        this.hours = hours;
        this.classroom = classroom;
        this.vacations = vacations;
        this.teacher = teacher;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getVacations() {
        return vacations;
    }

    public void setVacations(String vacations) {
        this.vacations = vacations;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "Course{" +
                "course='" + course + '\'' +
                ", hours=" + hours +
                ", classroom='" + classroom + '\'' +
                ", vacations='" + vacations + '\'' +
                ", teacherId=" + teacher +
                '}';
    }
}
