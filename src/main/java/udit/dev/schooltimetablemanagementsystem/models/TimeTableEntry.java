package udit.dev.schooltimetablemanagementsystem.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class TimeTableEntry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(cascade = CascadeType.ALL)
    private Classroom classroom;
    @ManyToOne(cascade = CascadeType.ALL)
    private Subject subject;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private DOW dayOfWeek;

}
