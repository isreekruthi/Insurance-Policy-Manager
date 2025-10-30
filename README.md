# PolicyReportGenerator

The **PolicyReportGenerator** project is a Java application that manages and analyzes insurance policy data. It reads policyholder information from a file, creates objects to represent policies and policyholders, calculates insurance-related metrics, and generates a summary report.

---

## Features

- Reads insurance policy data from a text file (`PolicyInformation.txt`)
- Creates **Policy** and **PolicyHolder** objects from the input
- Calculates each policyholder’s **BMI** and insurance price
- Counts and displays the number of **smokers** and **non-smokers**
- Provides a formatted summary report for all policies
- Tracks the total number of Policy objects created

---

## PolicyHolder.java

- Represents an individual policyholder.
- Stores personal information: first name, last name, age, height, weight, and smoking status.
- Provides getter and setter methods for all attributes.
- Calculates the policyholder's BMI.
- Includes a `toString()` method to display policyholder information.

---

## Policy.java

- Represents an insurance policy.
- Contains policy information: policy number, provider name, and a reference to a `PolicyHolder`.
- Provides getter and setter methods for policy attributes.
- Calculates the insurance price based on policyholder attributes (age, BMI, smoking status).
- Tracks the total number of `Policy` objects created.
- Includes a `toString()` method to display policy information along with the associated policyholder.

---

## ReportGenerator.java

- Main program to run the application.
- Reads policy data from `PolicyInformation.txt`.
- Creates `PolicyHolder` and `Policy` objects for each policy in the file.
- Tracks the number of smokers and non-smokers.
- Prints a formatted report showing all policy details.
- Displays summary statistics, including total policies, smokers, and non-smokers.

---

## PolicyInformation.txt

- Text file containing policyholder and policy information.
- Each policy is represented in **8 lines** in the following order:
  1. Policy Number
  2. Provider Name
  3. First Name
  4. Last Name
  5. Age
  6. Smoking Status (smoker / non-smoker)
  7. Height (in inches)
  8. Weight (in pounds)
- This file is read by `ReportGenerator.java` to populate the program's objects.

---
