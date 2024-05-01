package udit.dev.schooltimetablemanagementsystem.controllers;

import org.springframework.web.bind.annotation.*;
import udit.dev.schooltimetablemanagementsystem.dtos.SubjectCreateDTO;
import udit.dev.schooltimetablemanagementsystem.models.Subject;
import udit.dev.schooltimetablemanagementsystem.models.TimeTableEntry;
import udit.dev.schooltimetablemanagementsystem.services.subjectServices.SubjectServiceImp;
import udit.dev.schooltimetablemanagementsystem.services.timeTableEntryServices.TimeTableEntryServiceImp;

import java.util.List;

@RestController
@RequestMapping("/subject")
public class SubjectController {
    private SubjectServiceImp subjectServiceImp;
    private TimeTableEntryServiceImp timeTableEntryServiceImp;

    public SubjectController(SubjectServiceImp subjectServiceImp, TimeTableEntryServiceImp timeTableEntryServiceImp) {
        this.subjectServiceImp = subjectServiceImp;
        this.timeTableEntryServiceImp = timeTableEntryServiceImp;
    }

    @PostMapping("/create")
    public Subject createSubject(@RequestBody SubjectCreateDTO subject) {
        System.out.println(subject.getTeacherId());
        return subjectServiceImp.createSubject(subject);
    }

    @PostMapping("/timetables/{id}")
    public List<TimeTableEntry> getTimeTableEntryByClassroomId(@PathVariable Long id){
        return timeTableEntryServiceImp.getAllTimeTableEntriesByClassroom(id);
    }
}
