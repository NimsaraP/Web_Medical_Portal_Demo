# 🏥 Web Medical Portal

A comprehensive **Hospital Management System** built with **Spring Boot**, **Java 21**, **MySQL**, and **JSP**. This full-stack web application provides a multi-role medical portal with modules for patients, doctors, pharmacists, lab technicians, and administrators — featuring an AI-powered medical assistant integrated with Google Gemini.

> 📚 Developed as part of the **Software Engineering** module (Y2S1) at **Sri Lanka Institute of Information Technology (SLIIT)**.

---

## ✨ Features

### 🧑‍⚕️ Patient Module
- Patient registration & authentication
- Interactive patient dashboard
- Appointment booking with real-time doctor availability
- View medical history & health records

### 👨‍⚕️ Doctor / Clinical Operations
- Doctor dashboard with appointment management
- Electronic Health Records (EHR) creation & management
- EHR viewer with detailed patient history
- Treatment plans & consultation management

### 💊 Pharmacy Module
- Pharmacist dashboard
- Prescription management & dispensing
- Pharmacy inventory tracking (CRUD operations)

### 🔬 Lab Module
- Lab technician dashboard
- Lab report generation & management
- Test result tracking

### 🚨 Emergency Module
- Emergency request submission with priority triage
- Emergency dashboard for staff
- Real-time polling for new emergency alerts

### 🔧 Admin Module
- Hospital admin dashboard with analytics
- Employee registry management
- Staff management
- Feedback management with admin modals

### ⚙️ System Admin Module
- System-level administration dashboard
- Audit log tracking
- Database backup management

### 🤖 AI Medical Assistant
- AI-powered chat interface using **Google Gemini** (via Spring AI)
- Symptom checker
- Session-based conversation history

---

## 🏗️ Architecture & Design Patterns

```
src/main/java/com/webmedicalportaldemo/
├── controller/        # MVC Controllers (14 controllers)
├── model/             # Domain models (19 entities)
│   └── strategy/      # Strategy Pattern implementations
├── dao/               # Data Access Objects (14 DAOs)
├── dto/               # Data Transfer Objects (6 DTOs)
├── service/           # Business logic layer (20 services)
└── util/              # Utility classes
```

| Pattern | Implementation |
|---|---|
| **MVC** | Controllers → Services → DAOs → MySQL |
| **DAO Pattern** | `AppointmentDAO`, `PatientDAO`, `DoctorDAO`, etc. |
| **Strategy Pattern** | `FeeCalculationStrategy` interface with `ConsultationFeeStrategy` & `SurgeryFeeStrategy` |
| **DTO Pattern** | `AppointmentDTO`, `RegistrationRequestDTO`, `PrescriptionRequestDTO`, etc. |
| **Service Layer** | `EHRService`, `MedicalAIService`, `LabReportService`, etc. |

---

## 🛠️ Tech Stack

| Layer | Technology |
|---|---|
| **Backend** | Java 21, Spring Boot 3.3.0 |
| **Frontend** | JSP, JSTL, HTML5, CSS3, JavaScript |
| **Database** | MySQL 8.x |
| **AI Integration** | Spring AI + Google Gemini (OpenAI-compatible endpoint) |
| **Build Tool** | Apache Maven |
| **Server** | Apache Tomcat (embedded) |
| **JSON Processing** | Gson 2.10.1 |
| **Validation** | Spring Boot Starter Validation |

---

## 🚀 Getting Started

### Prerequisites

- **Java 21** (JDK)
- **MySQL 8.x**
- **Maven 3.8+**
- **Google Gemini API Key** ([Get one here](https://aistudio.google.com/apikey))

### Setup

1. **Clone the repository**
   ```bash
   git clone https://github.com/NimsaraP/Web-Medical-Portal.git
   cd Web-Medical-Portal
   ```

2. **Create the MySQL database**
   ```sql
   CREATE DATABASE webmedicalportal;
   ```

3. **Configure environment variables**
   ```bash
   # Copy the example env file
   cp .env.example .env

   # Edit .env with your credentials
   DB_USERNAME=root
   DB_PASSWORD=your_mysql_password
   GEMINI_API_KEY=your_gemini_api_key
   ```

   Or set them directly:
   ```bash
   export DB_USERNAME=root
   export DB_PASSWORD=your_password
   export GEMINI_API_KEY=your_api_key
   ```

4. **Run the application**
   ```bash
   ./mvnw spring-boot:run
   ```

5. **Access the portal**
   ```
   http://localhost:8080
   ```

---

## 📁 Project Structure

```
Web_Medical_Portal_Demo/
├── src/
│   └── main/
│       ├── java/com/webmedicalportaldemo/
│       │   ├── controller/          # Request handlers
│       │   ├── model/               # Entity classes
│       │   │   └── strategy/        # Strategy pattern
│       │   ├── dao/                 # Database access
│       │   ├── dto/                 # Data transfer objects
│       │   ├── service/             # Business logic
│       │   └── util/                # Utilities (DB connection, auth)
│       ├── resources/
│       │   └── application.properties
│       └── webapp/
│           ├── WEB-INF/jsp/
│           │   ├── admin/           # Admin views
│           │   ├── ai/              # AI assistant views
│           │   ├── clinical/        # Doctor/clinical views
│           │   ├── emergency/       # Emergency views
│           │   ├── lab/             # Lab views
│           │   ├── patient/         # Patient views
│           │   ├── pharmacy/        # Pharmacy views
│           │   └── shared/          # Shared components (header, feedback)
│           ├── css/                 # Stylesheets
│           └── js/                  # JavaScript files
├── pom.xml                          # Maven configuration
├── .env.example                     # Environment variables template
└── README.md
```

---

## 👥 User Roles

| Role | Access |
|---|---|
| **Patient** | Dashboard, appointments, medical records, AI chat |
| **Doctor** | Clinical dashboard, EHR management, prescriptions |
| **Pharmacist** | Pharmacy dashboard, prescriptions, inventory |
| **Lab Technician** | Lab dashboard, test results, report generation |
| **Hospital Admin** | Admin dashboard, employee management, feedback |
| **System Admin** | System settings, audit logs, database backup |

---

## 📸 Modules Overview

| Module | Key Pages |
|---|---|
| Authentication | Login, Registration |
| Patient Portal | Dashboard, Book Appointment |
| Clinical Ops | Doctor Dashboard, EHR Form, EHR Viewer |
| Pharmacy | Pharmacist Dashboard, Prescriptions, Inventory |
| Lab | Lab Dashboard, Test Results |
| Emergency | Emergency Request, Emergency Dashboard |
| Admin | Admin Dashboard, Employee Registry |
| AI Assistant | AI Chat, Symptom Checker |

---

## 🤝 Contributing

This project was developed as a university SE project. Contributions, issues, and feature requests are welcome!

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

---

## 📄 License

This project is open source and available for educational purposes.

---

## 🙏 Acknowledgments

- **SLIIT** — Sri Lanka Institute of Information Technology
- **Spring Boot** — For the powerful backend framework
- **Google Gemini** — For AI capabilities via Spring AI
- All team members who contributed to this project

---

<p align="center">
  Made with ❤️ at SLIIT
</p>
