package udit.dev.schooltimetablemanagementsystem.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import udit.dev.schooltimetablemanagementsystem.models.Teacher;
import udit.dev.schooltimetablemanagementsystem.services.teacherServices.TeacherServiceImp;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
    private TeacherServiceImp teacherServiceImp;

    TeacherController(TeacherServiceImp teacherServiceImp) {
        this.teacherServiceImp = teacherServiceImp;
    }

    @PostMapping("/create")
    public Teacher createTeacher(@RequestBody Teacher teacher) {
        return teacherServiceImp.createTeacher(teacher);
    }

}
