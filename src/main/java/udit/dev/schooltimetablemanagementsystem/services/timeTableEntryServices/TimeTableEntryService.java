package udit.dev.schooltimetablemanagementsystem.services.timeTableEntryServices;

import org.springframework.stereotype.Service;
import udit.dev.schooltimetablemanagementsystem.dtos.TimeTableEntryCreateDTO;
import udit.dev.schooltimetablemanagementsystem.models.Classroom;
import udit.dev.schooltimetablemanagementsystem.models.TimeTableEntry;

import java.util.List;
import java.util.Optional;

@Service
public interface TimeTableEntryService {
    TimeTableEntry createTimeTableEntry(TimeTableEntryCreateDTO timeTableEntryDto);

    TimeTableEntry getTimeTableEntryById(Long id);

    TimeTableEntry updateTimeTableEntry(TimeTableEntry timeTableEntry);
    // Provide a feature to list all timetable entries for a specific classroom.
    List<TimeTableEntry> getAllTimeTableEntriesByClassroom(Long classroomId);

    void deleteTimeTableEntry(Long id);
    List<TimeTableEntry> getAllTimeTableEntriesBySubject(Long classroomId);

    public TimeTableEntry assignSubjectToTimeSlot(Long timeTableEntryId, Long subjectId);
}
