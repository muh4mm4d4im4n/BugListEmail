package com.buglistemail.buglist;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table (name = "bug_list")
public class Bug {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long bugListId;
    
    private String srNo;
    private String customerName;
    private String projectName;
    private String bugId;
    private String environment;
    private String summary;
    private String incidentType;
    private Date reportedDate;
    private Date dateFixed;
    private int daysToFix;
    private int aging;
    private String assigneeTo;
    private String status;
    private String assignedBy;
    private String remarks;
}