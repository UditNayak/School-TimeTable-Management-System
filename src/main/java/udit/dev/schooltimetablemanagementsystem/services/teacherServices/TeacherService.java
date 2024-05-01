package udit.dev.schooltimetablemanagementsystem.services.teacherServices;

import udit.dev.schooltimetablemanagementsystem.models.Teacher;

public interface TeacherService {
    Teacher createTeacher(Teacher teacher);

    Teacher getTeacherById(Long id);
}
