package com.robin.cron_demo.service;

import com.robin.cron_demo.entity.JobLog;
import com.robin.cron_demo.repository.JobLogRepository;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class CronJobService {

    private final JobLogRepository repository;

    public CronJobService(JobLogRepository repository) {
        this.repository = repository;
    }

    // Runs every 10 seconds
    @Scheduled(fixedRate = 10000)
    public void runEveryTenSeconds() {
        System.out.println("Running every 10 seconds: " + LocalDateTime.now());
    }

    // Runs every minute using CRON
    @Scheduled(cron = "0 * * * * ?")
    public void saveLogToDatabase() {

        JobLog log = new JobLog();
        log.setMessage("Cron executed at " + LocalDateTime.now());
        log.setCreatedAt(LocalDateTime.now());

        repository.save(log);

        System.out.println("Saved log to database");
    }
}
