package com.eyerax.studentmanagement.controller;

import com.eyerax.studentmanagement.dto.StudentDTO;
import com.eyerax.studentmanagement.dto.request.*;
import com.eyerax.studentmanagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    // http://localhost:8081/student/save

    @PostMapping(path = "/save")
    public String saveStudent(@RequestBody StudentSaveRequestDTO studentSaveRequestDTO){
        studentService.saveStudent(studentSaveRequestDTO);
        return "Student Saved";
    }

    // http://localhost:8081/student/all

    @GetMapping(path = "/all")
    public List<StudentDTO> getAllStudent(){
        List<StudentDTO> studentDTO = studentService.getAllStudents();
        return studentDTO;
    }

    // http://localhost:8081/student/get-by-id

    @GetMapping(path = "/get-by-id", params = "id")
    public StudentDTO getStudentByID(@RequestParam (value = "id") int id){

        StudentDTO studentDTOS = studentService.getStudentById(id);
        return studentDTOS;
    }

    // http://localhost:8081/student/delete/{id}

    @DeleteMapping(path = "/delete/{id}")
    public String deleteStudent(@PathVariable("id") int id){
        studentService.deleteStudent(id);
        return "Student Deleted";
    }

    // http://localhost:8081/student/update-all

    @PutMapping(path = "/update-all/{id}")
    public String updateStudent(@RequestBody StudentUpdateRequestDTO studentUpdateRequestDTO,
                                @PathVariable(value = "id") int id){
        String updateStudent = studentService.updateStudent(studentUpdateRequestDTO, id);
        return updateStudent;
    }

    // http://localhost:8081/student/update-name/{id}

    @PutMapping(path = "/update-name/{id}")
    public String updateStudentName(@RequestBody StudentUpdateNameRequestDTO studentUpdateNameRequestDTO,
                                     @PathVariable(value = "id") int id){
        String updateStudentName = studentService.updateStudentName(studentUpdateNameRequestDTO, id);
        return updateStudentName;
    }

    // http://localhost:8081/student/update-age/{id}

    @PutMapping(path = "/update-age/{id}")
    public String updateStudentAge(@RequestBody StudentUpdateAgeRequestDTO studentUpdateAgeRequestDTO,
                                    @PathVariable(value = "id") int id){
        String updateStudentAge = studentService.updateStudentAge(studentUpdateAgeRequestDTO, id);
        return updateStudentAge;
    }

    // http://localhost:8081/student/update-dob/{id}

    @PutMapping(path = "/update-dob/{id}")
    public String updateStudentDob(@RequestBody StudentUpdateDobRequestDTO studentUpdateDobRequestDTO,
                                   @PathVariable(value = "id") int id){
        String updateStudentDob = studentService.updateStudentDob(studentUpdateDobRequestDTO, id);
        return updateStudentDob;
    }
}
