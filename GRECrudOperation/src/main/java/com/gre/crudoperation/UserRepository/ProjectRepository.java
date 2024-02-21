package com.gre.crudoperation.UserRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gre.crudoperation.Entity.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer> {

}
