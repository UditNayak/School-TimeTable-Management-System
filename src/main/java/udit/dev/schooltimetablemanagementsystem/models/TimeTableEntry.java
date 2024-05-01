package udit.dev.schooltimetablemanagementsystem.models;

import java.time.LocalDateTime;

public class TimeTableEntry {

    private long id;
    private Classroom classroom;
    private Subject subject;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private DOW dayOfWeek;
}