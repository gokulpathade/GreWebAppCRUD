package com.gre.crudoperation.UserRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gre.crudoperation.Entity.ProjectChangeLog;

@Repository
public interface ProjectChangeLogRepository extends JpaRepository<ProjectChangeLog, Integer> {

}
