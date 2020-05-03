package com.gvp.swt;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gvp.swt.domain.EmployeeDM;
import com.gvp.swt.service.EmployeeService;

@SpringBootApplication
public class GvpSoftwareTechnologiesApplication implements CommandLineRunner {
	
	@Autowired
	EmployeeService es;

	public static void main(String[] args) {
		SpringApplication.run(GvpSoftwareTechnologiesApplication.class, args);
		System.out.println("Main Spring boot class");
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		EmployeeDM emp = new EmployeeDM();
		System.out.println("Employee Obj:"+emp);
		emp.setEmpId(50003);
		emp.setEmpName("Grandhi Venkata Naga Duraga Prasad");
		emp.setEmpGen("Male");
		emp.setEmpRole("TA");
		emp.setEmpUnit("FS");
		emp.setEmpDomain("JAVA");
		emp.setEmpJOD(new Date());
		emp.setEmpIdStatus("Active");
		
		System.out.println("Employee Obj:"+emp);
		
		es.insert(emp);
	}

}
