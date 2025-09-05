# Volt Eligibility Automation Framework  

## 📌 Overview  
This project automates the **Volt Money Mutual Fund Loan Eligibility Page** → [Check Loan Eligibility](https://voltmoney.in/check-loan-eligibility-against-mutual-funds).  

The goal is to validate:  
- Functional scenarios  
- UI/UX flows  
- Validation & error handling  
- Edge/boundary conditions  


## 🛠️ Tech Stack  
- **Language:** Java  
- **Automation Tool:** Appium  
- **Test Runner:** TestNG  
- **Design Pattern:** Page Object Model (POM)  
- **Reports:** Extent Reports  
- **Build Tool:** Maven  

## 📂 Project Structure  

VoltEligibilityAutomation
├── src
│ ├── main/java
│ │ ├── pages/ # Page Objects
│ │ └── utils/ # DriverFactory, ExtentManager, TestListener
│ └── test/java/tests/ # Test Classes
├── config.properties # Device & platform configs
├── pom.xml # Maven dependencies
├── testng.xml # TestNG suite
└── README.md # Project documentation


## ⚙️ Setup Instructions  

### 1️⃣ Prerequisites  
- Install **Java 11+**  
- Install **Maven**  
- Install **Appium Server**  
- Install **Android SDK / Emulator** OR connect a real device
  
- Install project dependencies:  
  mvn clean install
  
2️⃣ Configuration

Update config.properties with your environment details:

properties
Copy code
platform=Android
deviceName=emulator-5554
appiumServer=http://127.0.0.1:4723/wd/hub

3️⃣ Run Tests
Run all tests:

mvn clean test
Run specific suite:

mvn clean test -DsuiteXmlFile=testng.xml
📊 Reports
After execution, Extent Reports will be available at:

/test-output/ExtentReports.html

✅ Test Coverage
Functional
Valid & invalid PAN inputs

Valid & invalid mobile numbers

Empty fields & boundary conditions

Form submission flow

UI/UX
Page load validation

Button enable/disable states

Placeholder texts

Error message styles

Validation & Error Handling
Invalid formats

Missing fields

Cross-field checks

Edge/Boundary
PAN length (10 chars)

Mobile number length (10 digits)

Special characters & whitespace


👩‍💻 Author

Sunidhi Dubey

QA Automation Engineer
