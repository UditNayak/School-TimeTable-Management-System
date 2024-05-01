package udit.dev.schooltimetablemanagementsystem.services.teacherServices;

import org.springframework.stereotype.Service;
import udit.dev.schooltimetablemanagementsystem.models.Teacher;
import udit.dev.schooltimetablemanagementsystem.repositories.TeacherRepository;

@Service
public class TeacherServiceImp implements TeacherService{
    TeacherRepository teacherRepository;
    TeacherServiceImp(TeacherRepository teacherRepository){
        this.teacherRepository = teacherRepository;
    }

    @Override
    public Teacher createTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    @Override
    public Teacher getTeacherById(Long id){
        return teacherRepository.findById(id).get();
    }

}
