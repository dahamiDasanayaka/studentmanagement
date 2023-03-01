package com.eyerax.studentmanagement.repo;

import com.eyerax.studentmanagement.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@EnableJpaRepositories
@Repository
@Transactional
public interface StudentRepo extends JpaRepository<Student, Integer> {

    @Modifying
    @Query(value = "UPDATE student_details set student_name=?1, student_age=?2, student_dob=?3 where student_id=?4", nativeQuery = true)
    void updateStudentQuery(String name, String age, String dob, int id);

    @Modifying
    @Query(value = "UPDATE student_details set student_name=?1 where student_id=?2", nativeQuery = true)
    void updateStudentNameQuery(String name, int id);

    @Modifying
    @Query(value = "UPDATE student_details set student_age=?1 where student_id=?2", nativeQuery = true)
    void updateStudentAgeQuery(String age, int id);

    @Modifying
    @Query(value = "UPDATE student_details set student_dob=?1 where student_id=?2", nativeQuery = true)
    void updateStudentDobQuery(String dob, int id);

}
