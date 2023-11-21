package com.buglistemail.buglist;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BugEmailScheduler {

    private final BugRepository bugRepository;
    private final EmailService emailService;

    public BugEmailScheduler(BugRepository bugRepository, EmailService emailService) {
        this.bugRepository = bugRepository;
        this.emailService = emailService;
    }

    public void sendBugStatusEmailsOnce() {
        List<Bug> openBugs = bugRepository.findByStatusNotIgnoreCase("Closed");

        for (Bug bug : openBugs) {
            String emailText = "Bug ID: " + bug.getBugId() + "\nSummary: " + bug.getSummary();
            emailService.sendSimpleMessage("aiman.alias@beans.com.my", "Open Bug Alert Notified!", emailText);
        }
    }
}