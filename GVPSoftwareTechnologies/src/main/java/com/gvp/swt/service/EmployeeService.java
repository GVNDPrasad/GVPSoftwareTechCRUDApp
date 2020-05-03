package com.gvp.swt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gvp.swt.dao.EmployeeDAO;
import com.gvp.swt.domain.EmployeeDM;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeDAO empDao;

	public EmployeeDM insert(EmployeeDM empObj) {
		// TODO Auto-generated method stub
		System.out.println("Hi Service");
		return empDao.save(empObj);//Inserting values
	}
	
	public Iterable<EmployeeDM> getAll() {
		return empDao.findAll();
	}

	public void delete(int empCount) {
		empDao.deleteById(empCount);;
	}
}
