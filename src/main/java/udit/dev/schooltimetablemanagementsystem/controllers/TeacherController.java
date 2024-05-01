package udit.dev.schooltimetablemanagementsystem.controllers;

//import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import udit.dev.schooltimetablemanagementsystem.models.Teacher;
import udit.dev.schooltimetablemanagementsystem.services.teacherServices.TeacherServiceImp;

import java.util.*;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
    private TeacherServiceImp teacherServiceImp;

    TeacherController(TeacherServiceImp teacherServiceImp) {
        this.teacherServiceImp = teacherServiceImp;
    }
    private Logger logger = LoggerFactory.getLogger(TeacherController.class);

    @PostMapping("/create")
    public Teacher createTeacher(@RequestBody Teacher teacher) {
        logger.warn("Teacher added: {}", teacher);
        return teacherServiceImp.createTeacher(teacher);
    }

}
