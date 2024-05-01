package udit.dev.schooltimetablemanagementsystem.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import udit.dev.schooltimetablemanagementsystem.dtos.SubjectCreateDTO;
import udit.dev.schooltimetablemanagementsystem.models.Subject;
import udit.dev.schooltimetablemanagementsystem.services.subjectServices.SubjectServiceImp;

@RestController
@RequestMapping("/subject")
public class SubjectController {
    private SubjectServiceImp subjectServiceImp;

    SubjectController(SubjectServiceImp subjectServiceImp) {
        this.subjectServiceImp = subjectServiceImp;
    }

    @PostMapping("/create")
    public Subject createSubject(@RequestBody SubjectCreateDTO subject) {
        System.out.println(subject.getTeacherId());
        return subjectServiceImp.createSubject(subject);
    }
}
