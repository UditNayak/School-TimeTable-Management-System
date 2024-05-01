package udit.dev.schooltimetablemanagementsystem.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TimeTableEntryCreateDTO {
    private Long classroomId;
    private Long subjectId;
    private String startTime;
    private String endTime;
    private String dayOfWeek;
}
