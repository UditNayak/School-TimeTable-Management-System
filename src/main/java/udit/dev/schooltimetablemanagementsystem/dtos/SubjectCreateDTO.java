package udit.dev.schooltimetablemanagementsystem.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SubjectCreateDTO {
    private String name;
    private Long teacherId;

}
