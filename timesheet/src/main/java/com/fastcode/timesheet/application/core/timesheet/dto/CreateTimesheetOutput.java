package com.fastcode.timesheet.application.core.timesheet.dto;

import java.time.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateTimesheetOutput {

    private Long id;
    private String notes;
    private LocalDate periodendingdate;
    private LocalDate periodstartingdate;
    private Long timesheetstatusid;
    private Long timesheetstatusDescriptiveField;
    private Long userid;
    private Long usersDescriptiveField;
}
