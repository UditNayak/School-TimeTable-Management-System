package udit.dev.schooltimetablemanagementsystem.controllers;

import org.springframework.web.bind.annotation.*;
import udit.dev.schooltimetablemanagementsystem.dtos.ClassroomCreateDTO;
import udit.dev.schooltimetablemanagementsystem.models.Classroom;
import udit.dev.schooltimetablemanagementsystem.models.TimeTableEntry;
import udit.dev.schooltimetablemanagementsystem.services.classroomServices.ClassroomServiceImp;
import udit.dev.schooltimetablemanagementsystem.services.timeTableEntryServices.TimeTableEntryServiceImp;

import java.sql.SQLOutput;
import java.util.List;

@RestController
@RequestMapping("/classroom")
public class ClassroomController {
    private ClassroomServiceImp classroomServiceImp;
    private TimeTableEntryServiceImp timeTableEntryServiceImp;

    public ClassroomController(ClassroomServiceImp classroomServiceImp, TimeTableEntryServiceImp timeTableEntryServiceImp) {
        this.classroomServiceImp = classroomServiceImp;
        this.timeTableEntryServiceImp = timeTableEntryServiceImp;
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

    // Provide a feature to list all timetable entries for a specific classroom.
    @GetMapping("/timetables/{id}")
    public List<TimeTableEntry> getTimeTableEntryByClassroomId(@PathVariable Long id){
        return timeTableEntryServiceImp.getAllTimeTableEntriesByClassroom(id);
    }
}
