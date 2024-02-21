package com.gre.crudoperation.UserRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gre.crudoperation.Entity.MasterTable;


@Repository
public interface MasterTableRepository extends JpaRepository<MasterTable, Integer>{

}
