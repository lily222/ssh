package com.imooc.service;

import com.imooc.dao.EmployeeDao;
import com.imooc.entity.Employee;

public class EmployeeService {

	EmployeeDao employeeDao ;
	
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
	
	public void saveEmployee(Employee employee) {
		System.out.print("service÷¥––¡À");
		employeeDao.saveEmployee(employee);
	}
}
