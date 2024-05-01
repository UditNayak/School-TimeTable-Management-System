package udit.dev.schooltimetablemanagementsystem.services.timeTableEntryServices;

import org.springframework.stereotype.Service;
import udit.dev.schooltimetablemanagementsystem.dtos.TimeTableEntryCreateDTO;
import udit.dev.schooltimetablemanagementsystem.models.TimeTableEntry;

import java.util.Optional;

@Service
public interface TimeTableEntryService {
    TimeTableEntry createTimeTableEntry(TimeTableEntryCreateDTO timeTableEntryDto);

    TimeTableEntry getTimeTableEntryById(Long id);

    TimeTableEntry updateTimeTableEntry(TimeTableEntry timeTableEntry);
}
