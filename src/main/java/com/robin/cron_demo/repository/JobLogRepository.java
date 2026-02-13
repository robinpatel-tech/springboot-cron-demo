package com.robin.cron_demo.repository;

import com.robin.cron_demo.entity.JobLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobLogRepository extends JpaRepository<JobLog , Long> {

}
