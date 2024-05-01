package udit.dev.schooltimetablemanagementsystem.controllers;

import org.springframework.web.bind.annotation.*;
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

    @PostMapping("/create")
    public TimeTableEntry createTimeTableEntry(@RequestBody TimeTableEntryCreateDTO timeTableEntry) {
        return timeTableEntryService.createTimeTableEntry(timeTableEntry);
    }

    @GetMapping("/{id}")
    public TimeTableEntry getTimeTableEntryById(@PathVariable Long id){
        return timeTableEntryService.getTimeTableEntryById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteTimeTableEntry(@PathVariable Long id){
        timeTableEntryService.deleteTimeTableEntry(id);
        return "TimeTableEntry deleted successfully";
    }
}
