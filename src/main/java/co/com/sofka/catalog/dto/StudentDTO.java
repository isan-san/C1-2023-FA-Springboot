package co.com.sofka.catalog.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDTO {
    private String studentId;

    private String name;

    private String idNum;

    private Integer age;

    private String mail;

    private Integer numCourses;

    private List<CourseDTO> courseListDTO = new ArrayList<>();
}
