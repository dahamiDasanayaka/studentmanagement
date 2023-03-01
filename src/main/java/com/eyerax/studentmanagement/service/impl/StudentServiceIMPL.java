package com.eyerax.studentmanagement.service.impl;

import com.eyerax.studentmanagement.dto.StudentDTO;
import com.eyerax.studentmanagement.dto.request.*;
import com.eyerax.studentmanagement.model.Student;
import com.eyerax.studentmanagement.repo.StudentRepo;
import com.eyerax.studentmanagement.service.StudentService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceIMPL implements StudentService {

    @Autowired
    private StudentRepo studentRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public String saveStudent(StudentSaveRequestDTO studentSaveRequestDTO) {

        studentRepo.save(modelMapper.map(studentSaveRequestDTO, Student.class));
        return "Student Saved";
    }

    @Override
    public List<StudentDTO> getAllStudents() {
        List<Student> students = studentRepo.findAll();
        List<StudentDTO> studentDTOS = modelMapper.map(students, new TypeToken<List<StudentDTO>>() {
        }.getType());
        return studentDTOS;
    }

    @Override
    public StudentDTO getStudentById(int id) {

        Optional<Student> student = studentRepo.findById(id);
        if (student.isPresent()) {
            StudentDTO studentDTO = modelMapper.map(student.get(), StudentDTO.class);
            return studentDTO;
        } else {
            return null;
        }


//        @Override
//        public String deleteStudent(int id){
//            boolean exist = studentRepo.existsById(id);
//            if (exist) {
//                studentRepo.deleteById(id);
//                return "Student Deleted";
//            } else {
//                return "Student Not Found";
//            }
//        }
//
//
//        @Override
//        public String updateStudent (StudentUpdateRequestDTO studentUpdateRequestDTO,int id){
//            if (studentRepo.existsById(id)) {
//                studentRepo.updateStudentQuery(studentUpdateRequestDTO.getName(), studentUpdateRequestDTO.getAge(), studentUpdateRequestDTO.getDob(), id);
//                return "Student updated! ";
//            } else {
//                return "No Student Found!";
//            }
//        }
//
//        @Override
//        public String updateStudentName (StudentUpdateNameRequestDTO studentUpdateNameRequestDTO,int id){
//            if (studentRepo.existsById(id)) {
//                studentRepo.updateStudentNameQuery(studentUpdateNameRequestDTO.getName(), id);
//                return "Student Name updated! ";
//            } else {
//                return "No Student Found!";
//            }
//        }
//
//        @Override
//        public String updateStudentAge (StudentUpdateAgeRequestDTO studentUpdateAgeRequestDTO,int id){
//            if (studentRepo.existsById(id)) {
//                studentRepo.updateStudentAgeQuery(studentUpdateAgeRequestDTO.getAge(), id);
//                return "Student Age updated! ";
//            } else {
//                return "No Student Found!";
//            }
//        }
//
//        @Override
//        public String updateStudentDob (StudentUpdateDobRequestDTO studentUpdateDobRequestDTO,int id){
//            if (studentRepo.existsById(id)) {
//                studentRepo.updateStudentDobQuery(studentUpdateDobRequestDTO.getDob(), id);
//                return "Student DOB updated! ";
//            } else {
//                return "No Student Found!";
//            }
//        }
    }

    @Override
    public String deleteStudent(int id) {
        return null;
    }

    @Override
    public String updateStudent(StudentUpdateRequestDTO studentUpdateRequestDTO, int id) {
        return null;
    }

    @Override
    public String updateStudentName(StudentUpdateNameRequestDTO studentUpdateNameRequestDTO, int id) {
        return null;
    }

    @Override
    public String updateStudentAge(StudentUpdateAgeRequestDTO studentUpdateAgeRequestDTO, int id) {
        return null;
    }

    @Override
    public String updateStudentDob(StudentUpdateDobRequestDTO studentUpdateDobRequestDTO, int id) {
        return null;
    }
}
