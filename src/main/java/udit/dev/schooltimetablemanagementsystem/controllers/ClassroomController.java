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

    @GetMapping("/{id}")
    public Classroom getClassroomById(@PathVariable Long id){
        return classroomServiceImp.getClassroomById(id);
    }

    @PutMapping("update")
    public Classroom updateClassroom(@RequestBody Classroom classroom){
        return classroomServiceImp.updateClassroom(classroom);
    }

    @PostMapping("/create")
    public Classroom createClassroom(@RequestBody ClassroomCreateDTO classroom){
        return classroomServiceImp.createClassroom(classroom);
    }

    @DeleteMapping("/{id}")
    public String deleteClassroom(@PathVariable Long id){
        classroomServiceImp.deleteClassroom(id);
        return "Classroom deleted successfully";
    }
}
