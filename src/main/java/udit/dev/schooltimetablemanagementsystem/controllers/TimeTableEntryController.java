package udit.dev.schooltimetablemanagementsystem.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import udit.dev.schooltimetablemanagementsystem.dtos.TimeTableEntryCreateDTO;
import udit.dev.schooltimetablemanagementsystem.models.TimeTableEntry;
import udit.dev.schooltimetablemanagementsystem.services.timeTableEntryServices.TimeTableEntryService;

import java.sql.Time;
import java.util.Optional;

@RestController
@RequestMapping("/timetableEntry")
public class TimeTableEntryController {

    private TimeTableEntryService timeTableEntryService;


    private Logger logger = LoggerFactory.getLogger(TimeTableEntryController.class);
    TimeTableEntryController(TimeTableEntryService timeTableEntryService) {
        this.timeTableEntryService = timeTableEntryService;
    }

    @PostMapping("/create")
    public TimeTableEntry createTimeTableEntry(@RequestBody TimeTableEntryCreateDTO timeTableEntry) {
        logger.warn("timetable entry created.");
        return timeTableEntryService.createTimeTableEntry(timeTableEntry);
    }

    @PutMapping("/update")
    public TimeTableEntry updateTimeTableEntry(@RequestBody TimeTableEntry timeTableEntry) {
        logger.warn("Updated time table entry.");
        return timeTableEntryService.updateTimeTableEntry(timeTableEntry);
    }
  
    @GetMapping("/{id}")
    public TimeTableEntry getTimeTableEntryById(@PathVariable Long id){
        logger.warn("Fetched Time table entry by id {}:",id);
        return timeTableEntryService.getTimeTableEntryById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteTimeTableEntry(@PathVariable Long id){
        logger.warn("Deleted Time Table Entry by id {}:",id);
        timeTableEntryService.deleteTimeTableEntry(id);
        return "TimeTableEntry deleted successfully";
    }

    @PutMapping("/assignSubjectToTimeSlot/{timeTableEntryId}/{subjectId}")
    public TimeTableEntry assignSubjectToTimeSlot(@PathVariable Long timeTableEntryId, @PathVariable Long subjectId){
        logger.warn("Assigned time table entry of id ",timeTableEntryId," to subject id ",subjectId);
        return timeTableEntryService.assignSubjectToTimeSlot(timeTableEntryId, subjectId);
    }
}
