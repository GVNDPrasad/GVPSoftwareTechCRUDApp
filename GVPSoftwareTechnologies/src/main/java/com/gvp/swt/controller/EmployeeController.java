//Controller Class
package com.gvp.swt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gvp.swt.domain.EmployeeDM;
import com.gvp.swt.service.EmployeeService;


@RestController
@RequestMapping(value="/empController")
public class EmployeeController {
	
	@Autowired
	EmployeeService empSer;

	@PostMapping(value = "/insert")//http://localhost:8002/empController/insert
	public EmployeeDM insert(@RequestBody EmployeeDM empObj) {
		System.out.println("Inserion values-Emp Controller-insert()");
		return empSer.insert(empObj);
	}
	
	@GetMapping(value = "/getAll")//http://localhost:8002/empController/getAll
	public Iterable<EmployeeDM> getAll() {
		return empSer.getAll();
	}
	
	@DeleteMapping(value = "/delById/{empKey}")//http://localhost:8002/empController/delById/1
	public void delete(@PathVariable("empKey") int empCount) {
		 empSer.delete(empCount);;
	}
}
