package com.ironhack.w4d2.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
//@Table(name = "Teacher")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
    private Integer id;
    private String teacher;

    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;

//    Use only if we want a bidirectional relationship
//    If used, we must be careful not to create a stackOverflow Error (infinite loop)
//    @OneToMany(mappedBy = "teacher", fetch = FetchType.LAZY)
//    List<Course> courses;

    public Teacher(String teacher, Address address) {
        this.teacher = teacher;
        this.address = address;
    }



//    public List<Course> getCourses() {
//        return courses;
//    }
//
//    public void setCourses(List<Course> courses) {
//        this.courses = courses;
//    }
}
