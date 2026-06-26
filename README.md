# IT Support Bot

## Overview

The **IT Support Bot** is a Java Swing desktop application that simulates an IT Help Desk Ticket Management System. It enables users to report technical issues, generate support tickets, monitor ticket progress, and allows the IT department to manage all submitted reports.

The project was developed using core Java concepts and demonstrates the practical implementation of Object-Oriented Programming (OOP), Java Collections, Swing GUI components, and basic ticket management logic.

---

## Features

- Report different IT issues
  - Computer Problems
  - Network Problems
  - Software Problems
  - Printer Problems
  - Other System Issues

- Automatically generates unique ticket numbers

- Allows users to:
  - Enter their name
  - Department
  - Issue description
  - Select issue priority

- Ticket tracking system

- Simulates the IT support workflow:
  - Ticket Submitted
  - Ticket Found
  - Technician Assigned
  - Issue Under Investigation
  - Repair In Progress
  - Testing Solution
  - Issue Resolved

- Stores all reports using Java ArrayList

- View all submitted reports

- Displays report information in a scrollable window

---

## Technologies Used

- Java
- Java Swing
- JOptionPane
- JTextArea
- JScrollPane
- ArrayList
- Random Class

---

## Object-Oriented Programming Concepts

### Encapsulation

The `IssueReport` class stores ticket information using private variables and public getter/update methods.

### Abstraction

Each class performs a specific responsibility:

- IssueReport → Stores ticket information
- ITTeam → Manages support tickets
- ITSupportBot → Handles user interaction

### Composition

The ITTeam class contains an ArrayList of IssueReport objects.

### Object Interaction

Objects communicate together to create, process, search, and display support tickets.

---

## Project Structure

```
ITSupportBot
│
├── IssueReport
│     ├── Stores ticket information
│     ├── Updates ticket status
│     └── Displays report details
│
├── ITTeam
│     ├── Receives reports
│     ├── Stores reports
│     ├── Finds tickets
│     ├── Processes tickets
│     └── Displays all reports
│
└── ITSupportBot
      ├── Displays menu
      ├── Creates reports
      ├── Tracks tickets
      └── Controls program flow
```

---

## Menu Options

```
1. Report Computer Problem
2. Report Network Problem
3. Report Software Problem
4. Report Printer Problem
5. Report Other System Issue
6. Track Ticket Status
7. View All Reports
8. Exit System
```

---

## Ticket Workflow

```
Ticket Submitted
        ↓
IT Team Found Your Ticket
        ↓
Technician Assigned
        ↓
Issue Under Investigation
        ↓
Repair In Progress
        ↓
Testing Solution
        ↓
Resolved
```

---

## How the Program Works

### Step 1

The user selects the type of issue.

### Step 2

The user enters:

- Name
- Department
- Problem description
- Priority

### Step 3

The system generates a random ticket number between **1000 and 9999**.

Example:

```
Ticket Number: 5478
```

### Step 4

The IT Team receives the report.

### Step 5

Users can track the ticket using the generated ticket number.

### Step 6

The system simulates the complete IT support process until the issue is resolved.

### Step 7

The IT department can view every submitted report.

---

## Example Report

```
====================================
          IT SUPPORT TICKET
====================================
Ticket Number : 4582
User Name     : John Smith
Department    : Finance
Issue Type    : Network Problem
Issue Details : Unable to access Wi-Fi
Priority      : High
Current Status: Resolved
Resolution    : Issue resolved successfully to user satisfaction.
====================================
```

---

## Requirements

- Java JDK 8 or higher

---

## How to Compile

```bash
javac ITSupportBot.java
```

---

## How to Run

```bash
java ITSupportBot
```

---

## Future Improvements

Some possible enhancements include:

- Database integration (MySQL/PostgreSQL)
- Login system for users and IT staff
- Ticket search by username
- Ticket deletion
- Ticket editing
- Export reports to PDF
- Email notifications
- Dashboard with ticket statistics
- Technician assignment
- Due dates
- Persistent data storage
- JavaFX user interface
- REST API integration
- Web-based version

---

## Learning Objectives

This project demonstrates:

- Java Classes and Objects
- Constructors
- Methods
- Encapsulation
- Object-Oriented Programming
- Java Collections (ArrayList)
- Random Number Generation
- Java Swing GUI
- JOptionPane Dialogs
- JScrollPane
- JTextArea
- Conditional Statements
- Loops
- Method Calls
- Program Design

## License

This project is intended for educational purposes and may be freely modified for learning, academic, and personal use.
