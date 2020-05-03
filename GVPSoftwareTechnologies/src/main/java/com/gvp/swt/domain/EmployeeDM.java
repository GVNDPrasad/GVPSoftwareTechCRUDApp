//Domain Class
package com.gvp.swt.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="EMP")
public class EmployeeDM {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int empCount;//1
	@Column(name="EMP_ID")
	long empId;//2
	@Column(name="EMP_Name")
	String empName;//3
	@Column(name="EMP_Gender")
	String empGen;//4
	@Column(name="EMP_Role")
	String empRole;//5
	@Column(name="EMP_Unit")
	String empUnit;//6
	@Column(name="EMP_Domain")
	String empDomain;//7
	@Column(name="EMP_JOD")
	Date empJOD;//8
	@Column(name="EMP_ID_Status")
	String empIdStatus;//9
	
	public EmployeeDM() {
		System.out.println("Employee Domain");
	}
	
	public EmployeeDM(int empCount, long empId, String empName, String empGen, String empRole, String empUnit,
			String empDomain, Date empJOD, String empIdStatus) {
		super();
		this.empCount = empCount;
		this.empId = empId;
		this.empName = empName;
		this.empGen = empGen;
		this.empRole = empRole;
		this.empUnit = empUnit;
		this.empDomain = empDomain;
		this.empJOD = empJOD;
		this.empIdStatus = empIdStatus;
	}
	

	public int getEmpCount() {
		return empCount;
	}

	public void setEmpCount(int empCount) {
		this.empCount = empCount;
	}

	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpGen() {
		return empGen;
	}

	public void setEmpGen(String empGen) {
		this.empGen = empGen;
	}

	public String getEmpRole() {
		return empRole;
	}

	public void setEmpRole(String empRole) {
		this.empRole = empRole;
	}

	public String getEmpUnit() {
		return empUnit;
	}

	public void setEmpUnit(String empUnit) {
		this.empUnit = empUnit;
	}

	public String getEmpDomain() {
		return empDomain;
	}

	public void setEmpDomain(String empDomain) {
		this.empDomain = empDomain;
	}

	public Date getEmpJOD() {
		return empJOD;
	}

	public void setEmpJOD(Date empJOD) {
		this.empJOD = empJOD;
	}

	public String getEmpIdStatus() {
		return empIdStatus;
	}

	public void setEmpIdStatus(String empIdStatus) {
		this.empIdStatus = empIdStatus;
	}

	@Override
	public String toString() {
		return "EmployeeDM [empCount=" + empCount + ", empId=" + empId + ", empName=" + empName + ", empGen=" + empGen
				+ ", empRole=" + empRole + ", empUnit=" + empUnit + ", empDomain=" + empDomain + ", empJOD=" + empJOD
				+ ", empIdStatus=" + empIdStatus + "]";
	}
	
}
