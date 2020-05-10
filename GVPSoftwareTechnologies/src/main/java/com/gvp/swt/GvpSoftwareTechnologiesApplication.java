package com.gvp.swt;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
		EmployeeDM emp1 = new EmployeeDM();
		System.out.println("Employee Obj:"+emp1);
		emp1.setEmpId(50001);
		emp1.setEmpName("Grandhi Venkata Naga Duraga Prasad");
		emp1.setEmpGen("Male");
		emp1.setEmpRole("TA");
		emp1.setEmpUnit("FS");
		emp1.setEmpDomain("JAVA");
		emp1.setEmpJOD(new Date());
		emp1.setEmpIdStatus("Active");
		
		System.out.println("Employee Obj:"+emp1);
		
		es.insert(emp1);
		
		EmployeeDM emp2 = new EmployeeDM();
		System.out.println("Employee Obj:"+emp2);
		emp2.setEmpId(50002);
		emp2.setEmpName("Grandhi Venkata Naga Duraga Prasad");
		emp2.setEmpGen("Male");
		emp2.setEmpRole("TA");
		emp2.setEmpUnit("FS");
		emp2.setEmpDomain("JAVA");
		emp2.setEmpJOD(new Date());
		emp2.setEmpIdStatus("In-Active");
		
		System.out.println("Employee2 Obj:"+emp2);
		
		es.insert(emp2);
		
		EmployeeDM emp3 = new EmployeeDM();
		System.out.println("Employee Obj:"+emp3);
		emp3.setEmpId(50003);
		emp3.setEmpName("Grandhi Venkata Naga Duraga Prasad");
		emp3.setEmpGen("Male");
		emp3.setEmpRole("TA");
		emp3.setEmpUnit("FS");
		emp3.setEmpDomain("JAVA");
		emp3.setEmpJOD(new Date());
		emp3.setEmpIdStatus("Active");
		
		System.out.println("Employee Obj:"+emp3);
		
		es.insert(emp3);
		
		List<EmployeeDM> al = new ArrayList<>();
		al.add(emp1);
		al.add(emp2);
		al.add(emp3);
		System.out.println("Array List is:"+al);
		
		for(EmployeeDM l:al) {
			System.out.println("For-each loop:"+l);
		}
		
		Set<EmployeeDM> hs = new HashSet<>();
		hs.add(emp1);
		hs.add(emp2);
		hs.add(emp3);
		System.out.println("Hash Set is:"+hs);
		
		for(EmployeeDM s:hs) {
			System.out.println("For-each loop:"+s);
		}
	}

}
