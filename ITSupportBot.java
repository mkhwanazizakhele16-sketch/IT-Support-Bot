import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;

class IssueReport {

    private int ticketNumber;
    private String userName;
    private String department;
    private String issueType;
    private String issueDescription;
    private String priority;
    private String status;
    private String resolution;

    public IssueReport(int ticketNumber,
                       String userName,
                       String department,
                       String issueType,
                       String issueDescription,
                       String priority) {

        this.ticketNumber = ticketNumber;
        this.userName = userName;
        this.department = department;
        this.issueType = issueType;
        this.issueDescription = issueDescription;
        this.priority = priority;

        this.status = "Ticket Submitted";
        this.resolution = "Pending";
    }

    public void updateStatus(String status) {
        this.status = status;
    }

    public void updateResolution(String resolution) {
        this.resolution = resolution;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public String getReportDetails() {

        return "====================================\n" +
               "          IT SUPPORT TICKET\n" +
               "====================================\n" +
               "Ticket Number : " + ticketNumber + "\n" +
               "User Name     : " + userName + "\n" +
               "Department    : " + department + "\n" +
               "Issue Type    : " + issueType + "\n" +
               "Issue Details : " + issueDescription + "\n" +
               "Priority      : " + priority + "\n" +
               "Current Status: " + status + "\n" +
               "Resolution    : " + resolution + "\n" +
               "====================================";
    }
}

class ITTeam {

    private ArrayList<IssueReport> reports;

    public ITTeam() {
        reports = new ArrayList<>();
    }

    public void receiveReport(IssueReport report) {

        reports.add(report);

        JOptionPane.showMessageDialog(null,
                "====================================\n" +
                "     TICKET SUCCESSFULLY CREATED\n" +
                "====================================\n" +
                "Ticket Number: " + report.getTicketNumber() + "\n" +
                "Status: Ticket Submitted\n\n" +
                "The IT Team has received your issue.");
    }

    public IssueReport findReport(int ticketNumber) {

        for (IssueReport report : reports) {

            if (report.getTicketNumber() == ticketNumber) {
                return report;
            }
        }

        return null;
    }

    public void processTicket(IssueReport report) {

        report.updateStatus("IT Team Found Your Ticket");

        JOptionPane.showMessageDialog(null,
                "STATUS UPDATE\n\n" +
                "Ticket #" + report.getTicketNumber() + "\n" +
                "The IT Team has found your ticket.");

        report.updateStatus("Technician Assigned");

        JOptionPane.showMessageDialog(null,
                "1 HOUR LATER...\n\n" +
                "STATUS UPDATE\n" +
                "A technician has been assigned to your issue.");

        report.updateStatus("Issue Under Investigation");

        JOptionPane.showMessageDialog(null,
                "2 HOURS LATER...\n\n" +
                "STATUS UPDATE\n" +
                "Your issue is currently under investigation.");

        report.updateStatus("Repair In Progress");

        JOptionPane.showMessageDialog(null,
                "3 HOURS LATER...\n\n" +
                "STATUS UPDATE\n" +
                "The IT Team is working on resolving your issue.");

        report.updateStatus("Testing Solution");

        JOptionPane.showMessageDialog(null,
                "4 HOURS LATER...\n\n" +
                "STATUS UPDATE\n" +
                "The IT Team is testing the solution.");

        report.updateStatus("Resolved");

        report.updateResolution(
                "Issue resolved successfully to user satisfaction.");

        JOptionPane.showMessageDialog(null,
                "FINAL STATUS UPDATE\n\n" +
                "Ticket #" + report.getTicketNumber() + "\n" +
                "Your issue has been fully resolved.\n\n" +
                "Thank you for contacting the IT Support Team.");
    }

    public void viewReports() {

        if (reports.isEmpty()) {

            JOptionPane.showMessageDialog(null,
                    "No Reports Available.");

            return;
        }

        String allReports = "";

        for (IssueReport report : reports) {

            allReports += report.getReportDetails() + "\n\n";
        }

        JTextArea textArea = new JTextArea(allReports);

        textArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(textArea);

        scrollPane.setVerticalScrollBarPolicy(
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        scrollPane.setPreferredSize(
                new java.awt.Dimension(800, 600));

        JOptionPane.showMessageDialog(null,
                scrollPane,
                "IT TEAM REPORTS",
                JOptionPane.INFORMATION_MESSAGE);
    }
}

public class ITSupportBot {

    public static void main(String[] args) {

        ITTeam itTeam = new ITTeam();

        int option;

        do {

            String menu =
                    "====================================\n" +
                    "         IT SUPPORT BOT\n" +
                    "====================================\n" +
                    "1. Report Computer Problem\n" +
                    "2. Report Network Problem\n" +
                    "3. Report Software Problem\n" +
                    "4. Report Printer Problem\n" +
                    "5. Report Other System Issue\n" +
                    "6. Track Ticket Status\n" +
                    "7. View All Reports (IT Team)\n" +
                    "8. Exit System\n" +
                    "====================================\n" +
                    "Choose Option:";

            option = Integer.parseInt(
                    JOptionPane.showInputDialog(menu));

            switch (option) {

                case 1:

                    createReport(itTeam,
                            "Computer Problem");
                    break;

                case 2:

                    createReport(itTeam,
                            "Network Problem");
                    break;

                case 3:

                    createReport(itTeam,
                            "Software Problem");
                    break;

                case 4:

                    createReport(itTeam,
                            "Printer Problem");
                    break;

                case 5:

                    createReport(itTeam,
                            "Other System Issue");
                    break;

                case 6:

                    int ticketNumber =
                            Integer.parseInt(
                            JOptionPane.showInputDialog(
                                    "Enter Ticket Number:"));

                    IssueReport report =
                            itTeam.findReport(ticketNumber);

                    if (report == null) {

                        JOptionPane.showMessageDialog(null,
                                "Ticket Not Found!");

                    } else {

                        itTeam.processTicket(report);
                    }

                    break;

                case 7:

                    itTeam.viewReports();
                    break;

                case 8:

                    JOptionPane.showMessageDialog(null,
                            "System Closed Successfully.");

                    break;

                default:

                    JOptionPane.showMessageDialog(null,
                            "Invalid Option!");
            }

        } while (option != 8);
    }

    public static void createReport(ITTeam itTeam,
                                    String issueType) {

        String userName = JOptionPane.showInputDialog(
                "Enter Your Name:");

        String department = JOptionPane.showInputDialog(
                "Enter Department:");

        String issueDescription = JOptionPane.showInputDialog(
                "Describe the Problem:");

        String[] priorities = {
                "Low",
                "Medium",
                "High",
                "Critical"
        };

        String priority = (String)
                JOptionPane.showInputDialog(
                        null,
                        "Select Priority Level:",
                        "Priority",
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        priorities,
                        priorities[0]);

        Random random = new Random();

        int ticketNumber =
                1000 + random.nextInt(9000);

        IssueReport report =
                new IssueReport(
                        ticketNumber,
                        userName,
                        department,
                        issueType,
                        issueDescription,
                        priority);

        itTeam.receiveReport(report);

        JOptionPane.showMessageDialog(null,
                "IT Support Ticket Submitted Successfully!\n\n" +
                "Your Ticket Number Is: " + ticketNumber);
    }
}