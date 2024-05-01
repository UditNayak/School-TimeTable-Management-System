package udit.dev.schooltimetablemanagementsystem.services.subjectServices;

import org.springframework.stereotype.Service;
import udit.dev.schooltimetablemanagementsystem.dtos.SubjectCreateDTO;
import udit.dev.schooltimetablemanagementsystem.models.Classroom;
import udit.dev.schooltimetablemanagementsystem.models.Subject;
import udit.dev.schooltimetablemanagementsystem.repositories.SubjectRepository;
import udit.dev.schooltimetablemanagementsystem.services.teacherServices.TeacherService;
import udit.dev.schooltimetablemanagementsystem.services.teacherServices.TeacherServiceImp;

import java.util.Optional;

@Service
public class SubjectServiceImp implements SubjectService {
    SubjectRepository subjectRepository;
    TeacherService teacherService;

    SubjectServiceImp(SubjectRepository subjectRepository, TeacherService teacherService){
        this.subjectRepository = subjectRepository;
        this.teacherService = teacherService;
    }
    @Override
    public Subject createSubject(SubjectCreateDTO subjectDTO){
        Subject subject = new Subject();
        subject.setName(subjectDTO.getName());
        subject.setTeacher(teacherService.getTeacherById(subjectDTO.getTeacherId()));
        return subjectRepository.save(subject);
    }

    @Override
    public Subject getSubjectById(Long id){
        return subjectRepository.findById(id).get();

    }
}
