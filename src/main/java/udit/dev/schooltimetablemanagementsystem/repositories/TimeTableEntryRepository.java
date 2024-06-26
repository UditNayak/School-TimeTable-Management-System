package udit.dev.schooltimetablemanagementsystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import udit.dev.schooltimetablemanagementsystem.models.Classroom;
import udit.dev.schooltimetablemanagementsystem.models.Subject;
import udit.dev.schooltimetablemanagementsystem.models.TimeTableEntry;

import java.util.List;
import java.util.Optional;

@Repository
public interface TimeTableEntryRepository extends JpaRepository<TimeTableEntry, Long> {
    List<TimeTableEntry> getTimeTableEntriesByClassroom(Classroom classroom);
    List<TimeTableEntry> getTimeTableEntriesBySubject(Subject subject);
}
