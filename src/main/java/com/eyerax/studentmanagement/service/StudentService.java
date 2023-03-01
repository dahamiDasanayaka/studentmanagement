package com.eyerax.studentmanagement.service;

import com.eyerax.studentmanagement.dto.StudentDTO;
import com.eyerax.studentmanagement.dto.request.*;

import java.util.List;

public interface StudentService {
    String saveStudent(StudentSaveRequestDTO studentSaveRequestDTO);

    List<StudentDTO> getAllStudents();

    Object getStudentById(int id);

    String deleteStudent(int id);

    String updateStudent(StudentUpdateRequestDTO studentUpdateRequestDTO, int id);

    String updateStudentName(StudentUpdateNameRequestDTO studentUpdateNameRequestDTO, int id);

    String updateStudentAge(StudentUpdateAgeRequestDTO studentUpdateAgeRequestDTO, int id);

    String updateStudentDob(StudentUpdateDobRequestDTO studentUpdateDobRequestDTO, int id);
}
