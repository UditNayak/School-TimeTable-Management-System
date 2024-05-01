package udit.dev.schooltimetablemanagementsystem.controllers;

import org.springframework.web.bind.annotation.*;
import udit.dev.schooltimetablemanagementsystem.dtos.ClassroomCreateDTO;
import udit.dev.schooltimetablemanagementsystem.models.Classroom;
import udit.dev.schooltimetablemanagementsystem.services.classroomServices.ClassroomServiceImp;

import java.sql.SQLOutput;

@RestController
@RequestMapping("/classroom")
public class ClassroomController {
    private ClassroomServiceImp classroomServiceImp;

    ClassroomController(ClassroomServiceImp classroomServiceImp) {
        this.classroomServiceImp = classroomServiceImp;
    }

    @GetMapping("/")
    public String hello() {
        return "Hello from classroom controller using GET method.";
    }

    @PostMapping("/create")
    public Classroom createClassroom(@RequestBody ClassroomCreateDTO classroom){
        return classroomServiceImp.createClassroom(classroom);
    }
}
