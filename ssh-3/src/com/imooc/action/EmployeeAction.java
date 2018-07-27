package com.imooc.action;

import com.imooc.entity.Employee;
import com.imooc.service.EmployeeService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class EmployeeAction extends ActionSupport implements ModelDriven<Employee>{
	
	Employee employee = new Employee();
	@Override
	public Employee getModel() {
		// TODO Auto-generated method stub
		return employee;
	}
	
//	以下代码为实现与service连接
	EmployeeService employeeService;
	
	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	public String save(){
		System.out.print("action执行了");
		employeeService.saveEmployee(employee);
		
		return "success";
	}

	
}
