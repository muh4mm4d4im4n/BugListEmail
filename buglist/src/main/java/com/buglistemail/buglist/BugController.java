// package com.buglistemail.buglist;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;

// import java.util.List;

// @RestController
// @RequestMapping("/bugs")
// public class BugController {

//     @Autowired
//     private BugService bugService;

//     @Autowired
//     private EmailService emailService;

//     @GetMapping("/sendEmailForOpenBugs")
//     public ResponseEntity<String> sendEmailForOpenBugs() {
//         List<Bug> openBugs = bugService.findBugsWithOpenStatus();

//         if (openBugs.isEmpty()) {
//             return ResponseEntity.ok("No open bugs found.");
//         }

//         for (Bug bug : openBugs) {
//             String emailSubject = "Bug Notification: Bug ID " + bug.getBugId();
//             String emailBody = "Dear " + bug.getCustomerName() + ",\n\n"
//                     + "This is to inform you that the bug with ID " + bug.getBugId()
//                     + " in project " + bug.getProjectName() + " is still open.\n\n"
//                     + "Reported Date: " + bug.getReportedDate() + "\n"
//                     + "Summary: " + bug.getSummary() + "\n\n"
//                     + "Please take necessary actions to resolve it.";
//             emailService.sendEmail(bug.getAssigneeTo(), emailSubject, emailBody);
//         }

//         return ResponseEntity.ok("Email notifications sent for open bugs.");
//     }
// }

