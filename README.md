 ⏰ Spring Boot Cron Job Demo

This project demonstrates how to implement **Scheduled Tasks (Cron Jobs)** in Spring Boot.

It includes:
- Fixed rate scheduling
- Cron expression scheduling
- Database logging using H2
- Spring Data JPA integration

---

## 🚀 Features

✅ Runs a task every 10 seconds (Fixed Rate)  
✅ Runs a Cron job every minute  
✅ Saves cron execution logs into H2 Database  
✅ Uses Spring Data JPA  
✅ H2 Console enabled for DB inspection  

---

## 🛠 Tech Stack

- Java 17+
- Spring Boot
- Spring Scheduling
- Spring Data JPA
- H2 Database
- Maven
- Lombok

---

## 📂 Project Structure



com.robin.cron_demo
│
├── CronDemoApplication.java
├── entity
│ └── JobLog.java
├── repository
│ └── JobLogRepository.java
└── service
└── CronJobService.java


---

## 🔄 Scheduled Tasks Implemented

### 1️⃣ Fixed Rate Task

```java
@Scheduled(fixedRate = 10000)


Runs every 10 seconds.

2️⃣ Cron Expression Task
@Scheduled(cron = "0 * * * * ?")


Runs at the start of every minute.

Cron format in Spring:

second minute hour day month day-of-week

🗄 Database Configuration

The project uses an in-memory H2 database.

H2 Console URL:

http://localhost:8080/h2-console


JDBC URL:

jdbc:h2:mem:testdb

▶️ How to Run the Project
1️⃣ Clone Repository
git clone https://github.com/robinpatel-tech/springboot-cron-demo.git

2️⃣ Navigate to Project
cd springboot-cron-demo

3️⃣ Run Application

Using Maven:

mvn spring-boot:run


Or run directly from IDE.

📊 Verify Cron Execution

Check console logs:

Running every 10 seconds...
Saved log to database


Check database:

SELECT * FROM JOB_LOG;
