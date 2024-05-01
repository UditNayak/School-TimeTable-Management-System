package udit.dev.schooltimetablemanagementsystem.services.timeTableEntryServices;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import udit.dev.schooltimetablemanagementsystem.dtos.TimeTableEntryCreateDTO;
import udit.dev.schooltimetablemanagementsystem.models.*;
import udit.dev.schooltimetablemanagementsystem.repositories.ClassroomRepository;
import udit.dev.schooltimetablemanagementsystem.repositories.SubjectRepository;
import udit.dev.schooltimetablemanagementsystem.repositories.TeacherRepository;
import udit.dev.schooltimetablemanagementsystem.repositories.TimeTableEntryRepository;
import udit.dev.schooltimetablemanagementsystem.services.classroomServices.ClassroomServiceImp;
import udit.dev.schooltimetablemanagementsystem.services.subjectServices.SubjectServiceImp;
import udit.dev.schooltimetablemanagementsystem.services.teacherServices.TeacherServiceImp;

import java.sql.Time;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

@Service
@AllArgsConstructor
public class TimeTableEntryServiceImp implements TimeTableEntryService{
    private final TimeTableEntryRepository timeTableEntryRepository;
    private final ClassroomServiceImp classroomServiceImp;
    private final SubjectServiceImp subjectServiceImp;
    private final TeacherServiceImp teacherServiceImp;

    @Override
    public TimeTableEntry createTimeTableEntry(TimeTableEntryCreateDTO timeTableEntryDto){
        TimeTableEntry timeTableEntry = new TimeTableEntry();
        timeTableEntry.setStartTime(LocalDateTime.parse(timeTableEntryDto.getStartTime()));
        timeTableEntry.setEndTime(LocalDateTime.parse(timeTableEntryDto.getEndTime()));
        timeTableEntry.setDayOfWeek(DOW.valueOf(timeTableEntryDto.getDayOfWeek()));
        timeTableEntry.setClassroom(classroomServiceImp.getClassroomById(timeTableEntryDto.getClassroomId()));
        timeTableEntry.setSubject(subjectServiceImp.getSubjectById(timeTableEntryDto.getSubjectId()));
        return timeTableEntryRepository.save(timeTableEntry);
    }

    @Override
    public TimeTableEntry getTimeTableEntryById(Long id){
        return timeTableEntryRepository.findById(id).get();
    }
}
