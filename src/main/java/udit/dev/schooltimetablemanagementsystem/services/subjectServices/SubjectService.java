package udit.dev.schooltimetablemanagementsystem.services.subjectServices;

import udit.dev.schooltimetablemanagementsystem.dtos.SubjectCreateDTO;
import udit.dev.schooltimetablemanagementsystem.models.Subject;

public interface SubjectService {
    Subject createSubject(SubjectCreateDTO subjectDTO);

    Subject getSubjectById(Long id);
}
