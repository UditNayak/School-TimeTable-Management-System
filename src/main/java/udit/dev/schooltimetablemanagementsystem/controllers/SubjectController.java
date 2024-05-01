package udit.dev.schooltimetablemanagementsystem.controllers;

import org.springframework.web.bind.annotation.*;
import udit.dev.schooltimetablemanagementsystem.dtos.SubjectCreateDTO;
import udit.dev.schooltimetablemanagementsystem.models.Subject;
import udit.dev.schooltimetablemanagementsystem.models.TimeTableEntry;
import udit.dev.schooltimetablemanagementsystem.services.subjectServices.SubjectServiceImp;
import udit.dev.schooltimetablemanagementsystem.services.subjectServices.SubjectService;
import udit.dev.schooltimetablemanagementsystem.services.subjectServices.SubjectServiceImp;
import udit.dev.schooltimetablemanagementsystem.services.timeTableEntryServices.TimeTableEntryService;
import udit.dev.schooltimetablemanagementsystem.services.timeTableEntryServices.TimeTableEntryServiceImp;

import java.util.List;

@RestController
@RequestMapping("/subject")
public class SubjectController {
    private SubjectServiceImp subjectServiceImp;
    private TimeTableEntryService timeTableEntryServiceImp;

    SubjectController(SubjectServiceImp subjectServiceImp, TimeTableEntryServiceImp timeTableEntryServiceImp) {
        this.subjectServiceImp = subjectServiceImp;
        this.timeTableEntryServiceImp = timeTableEntryServiceImp;
    }

    @PostMapping("/create")
    public Subject createSubject(@RequestBody SubjectCreateDTO subject) {
        System.out.println(subject.getTeacherId());
        return subjectServiceImp.createSubject(subject);
    }

    @GetMapping("/timetables/{id}")
    public List<TimeTableEntry> getTimeTableEntriesBySubjectId(@PathVariable Long id) {
        return timeTableEntryServiceImp.getAllTimeTableEntriesBySubject(id);
    }
}
