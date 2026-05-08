# 🏥 Hospital Management System

A **Java console-based application** designed to manage basic hospital operations.  
This project demonstrates object-oriented programming concepts while providing functionality for patient management, doctor records, room allocation, billing, and appointments.

---

## ✨ Features
- Add and manage patient details  
- Add and manage doctor details  
- View patient information  
- Display doctor information  
- Allocate rooms to patients  
- Generate billing information  
- Schedule appointment placeholders  
- Vacate assigned rooms  

---

## 📂 Project Structure
- **`Main.java`** – Entry point; controls program flow and menu options  
- **`Patient.java`** – Stores patient information and assigns doctors based on patient problems  
- **`Doctors.java`** – Stores doctor information and availability  
- **`Room.java`** – Handles room allocation and vacancy  
- **`Billing.java`** – Calculates and displays billing details  

---

## ⚙️ Requirements
- Java JDK (latest version recommended)  
- Command Prompt, PowerShell, or any Java-supported IDE  

---

## ▶️ How to Compile
Open the project folder in terminal and run:
```bash
javac *.java
```

---

## ▶️ How to Run
After compiling, run:
```bash
java Main
```

---

## 📋 Menu Options
```text
1. Add Patient
2. Add Doctor
3. View Patient Details
4. Display Doctor Details
5. Allocate Room for Patient
6. Billing
7. Fix an Appointment
8. Vacate Room
9. Exit
```

---

## 📝 Notes
- Doctor IDs start from `101`  
- Patient IDs start from `1`  
- Room IDs start from `201`  
- If no suitable doctor is available, the patient’s doctor ID will be shown as **Not Assigned**  

---

## 👩‍💻 Author  

Navatha K  
**Hospital Management System – Java Project**  
Developed as a learning project to practice **object-oriented programming** and **console-based application design**.