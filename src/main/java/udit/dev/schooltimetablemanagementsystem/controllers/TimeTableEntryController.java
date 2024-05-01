package udit.dev.schooltimetablemanagementsystem.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import udit.dev.schooltimetablemanagementsystem.dtos.TimeTableEntryCreateDTO;
import udit.dev.schooltimetablemanagementsystem.models.TimeTableEntry;
import udit.dev.schooltimetablemanagementsystem.services.timeTableEntryServices.TimeTableEntryService;

import java.util.Optional;

@RestController
@RequestMapping("/timetableEntry")
public class TimeTableEntryController {

    private TimeTableEntryService timeTableEntryService;
    TimeTableEntryController(TimeTableEntryService timeTableEntryService) {
        this.timeTableEntryService = timeTableEntryService;
    }
    private Logger logger = LoggerFactory.getLogger(ClassroomController.class);


    @PostMapping("/create")
    public TimeTableEntry createTimeTableEntry(@RequestBody TimeTableEntryCreateDTO timeTableEntry) {
        logger.warn("Updated table Entry: {}", timeTableEntry);
        return timeTableEntryService.createTimeTableEntry(timeTableEntry);
    }
}
