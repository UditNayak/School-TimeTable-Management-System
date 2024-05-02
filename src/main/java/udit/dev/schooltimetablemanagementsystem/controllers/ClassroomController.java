package udit.dev.schooltimetablemanagementsystem.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
    private Logger logger = LoggerFactory.getLogger(ClassroomController.class);
    public ClassroomController(ClassroomServiceImp classroomServiceImp, TimeTableEntryServiceImp timeTableEntryServiceImp) {
        this.classroomServiceImp = classroomServiceImp;
        this.timeTableEntryServiceImp = timeTableEntryServiceImp;
    }

    @GetMapping("/{id}")
    public Classroom getClassroomById(@PathVariable Long id){
        logger.warn("Getting classroom by id: {}", id);
        return classroomServiceImp.getClassroomById(id);
    }

    @PutMapping("update")
    public Classroom updateClassroom(@RequestBody Classroom classroom){
        logger.warn("Updating classroom: {}", classroom);

        return classroomServiceImp.updateClassroom(classroom);
    }

    @PostMapping("/create")
    public Classroom createClassroom(@RequestBody ClassroomCreateDTO classroom){
        logger.warn("Creating classroom: {}", classroom);

        return classroomServiceImp.createClassroom(classroom);
    }

    @DeleteMapping("/{id}")
    public String deleteClassroom(@PathVariable Long id){
        logger.warn("Deleting classroom by id: {}", id);
        classroomServiceImp.deleteClassroom(id);
        return "Classroom deleted successfully";
    }

    // Provide a feature to list all timetable entries for a specific classroom.
    @GetMapping("/timetables/{id}")
    public List<TimeTableEntry> getTimeTableEntryByClassroomId(@PathVariable Long id){
        logger.warn("Fetching all  classroom by id: {}", id);
        return timeTableEntryServiceImp.getAllTimeTableEntriesByClassroom(id);
    }
}
