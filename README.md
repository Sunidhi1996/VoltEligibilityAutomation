Volt Eligibility Automation Framework
📌 Overview

This project automates the Volt Money Mutual Fund Loan Eligibility Page → Check Loan Eligibility.

The goal is to validate the core functional, UI/UX, validation, and boundary scenarios for the eligibility form and ensure a stable automation suite.

🛠️ Tech Stack

Language: Java

Automation: Appium

Test Runner: TestNG

Design Pattern: Page Object Model (POM)

Reports: Extent Reports

Build Tool: Maven

📂 Project Structure

VoltEligibilityAutomation
 ├── src
 │   ├── main/java
 │   │   ├── pages/             # Page Objects
 │   │   └── utils/             # Driver, ExtentManager, TestListener
 │   └── test/java/tests/       # Test Classes
 ├── config.properties          # Config (platform, device, etc.)
 ├── pom.xml                    # Maven dependencies
 ├── testng.xml                 # TestNG suite
 └── README.md                  # Project documentation

⚙️ Setup Instructions

1️⃣ Prerequisites

Install Java 11+

Install Maven

Install Appium Server

Install [Android SDK / Emulator] or connect a real device

Install dependencies:

mvn clean install

2️⃣ Configuration

Edit config.properties to match your device/emulator:

platform=Android
deviceName=emulator-5554
appiumServer=http://127.0.0.1:4723/wd/hub

3️⃣ Run Tests

Run all tests:

mvn clean test


Run specific suite:

mvn clean test -DsuiteXmlFile=testng.xml

📊 Reports

After execution, Extent Reports will be generated at:

/test-output/ExtentReports.html

✅ Test Coverage

Functional-

Valid & invalid PAN inputs

Valid & invalid Mobile numbers

Empty fields & boundary conditions

Form submission flow

UI/UX-

Page load validation

Button enable/disable states

Placeholder texts

Error message styles

Validation/Error Handling-

Invalid formats

Missing fields

Cross-field checks

Edge/Boundary-

PAN length (10 chars)

Mobile number length (10 digits)

Special characters & whitespace

🚀 CI/CD (Optional)

GitHub Actions can be integrated to run tests on every push/PR.
Example workflow: .github/workflows/maven.yml.

👩‍💻 Author

Sunidhi Dubey
QA Automation Engineer
