package com.eyerax.studentmanagement.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class StudentUpdateRequestDTO {

    private String name;
    private String age;
    private String dob;
}
