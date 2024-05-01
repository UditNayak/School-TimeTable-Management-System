package udit.dev.schooltimetablemanagementsystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import udit.dev.schooltimetablemanagementsystem.models.TimeTableEntry;

import java.util.Optional;

@Repository
public interface TimeTableEntryRepository extends JpaRepository<TimeTableEntry, Long> {
}
