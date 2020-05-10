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
		System.out.println("Hi Service");
		return empDao.save(empObj);//Inserting record
	}
	
	public Iterable<EmployeeDM> getAll() {
		return empDao.findAll();//Getting all records
	}
	
	public EmployeeDM get(int empCount) {
		return empDao.findById(empCount).orElse(new EmployeeDM());//Getting single record
	}

	public void delete(int empCount) {
		empDao.deleteById(empCount);//Deleting record
	}
	
	public EmployeeDM update(int empCount,String empIdStatus) {
		EmployeeDM empRec = get(empCount);//Getting Record
		empRec.setEmpIdStatus(empIdStatus);//Setting updated value
		return empDao.save(empRec);//Saving updated value
	}
}
