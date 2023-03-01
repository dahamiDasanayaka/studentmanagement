package com.eyerax.studentmanagement.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "student_details")

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student {

    @Id
    @Column(name = "student_id", length = 40)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int sid;

    @Column(name = "student_name", length = 120, nullable = false)
    private String name;

    @Column(name = "student_age", length = 12, nullable = false)
    private String age;

    @Column(name = "student_dob", length = 20, nullable = false)
    private String dob;
}
