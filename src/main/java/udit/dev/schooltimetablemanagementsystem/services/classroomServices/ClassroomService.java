package udit.dev.schooltimetablemanagementsystem.services.classroomServices;
import udit.dev.schooltimetablemanagementsystem.dtos.ClassroomCreateDTO;
import udit.dev.schooltimetablemanagementsystem.models.Classroom;

import java.util.List;

public interface ClassroomService {
    Classroom createClassroom(ClassroomCreateDTO classroom);

    Classroom getClassroomById(Long id);
}
