package udit.dev.schooltimetablemanagementsystem.services.classroomServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import udit.dev.schooltimetablemanagementsystem.dtos.ClassroomCreateDTO;
import udit.dev.schooltimetablemanagementsystem.models.Classroom;
import udit.dev.schooltimetablemanagementsystem.repositories.ClassroomRepository;
@Service
@Primary
public class ClassroomServiceImp implements ClassroomService {
    private ClassroomRepository classroomRepository;

    ClassroomServiceImp(ClassroomRepository classroomRepository) {
        this.classroomRepository = classroomRepository;
    }

    @Override
    public Classroom createClassroom(ClassroomCreateDTO classroom) {
        Classroom classroom1 = new Classroom();
        classroom1.setName(classroom.getName());
        classroom1.setLocation(classroom.getLocation());
        return classroomRepository.save(classroom1);
    }

    @Override
    public Classroom getClassroomById(Long id){
        return classroomRepository.findById(id).get();
    }

    @Override
    public Classroom updateClassroom(Classroom classroom){
        return classroomRepository.save(classroom);
    }

    @Override
    public void deleteClassroom(Long id){
        classroomRepository.deleteById(id);
    }
}
