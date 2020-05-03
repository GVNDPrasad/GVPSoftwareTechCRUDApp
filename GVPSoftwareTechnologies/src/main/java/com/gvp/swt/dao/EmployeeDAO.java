package com.gvp.swt.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gvp.swt.domain.EmployeeDM;

@Repository
public interface EmployeeDAO extends CrudRepository<EmployeeDM, Integer>{
   //Done CRUD operations Code
}
