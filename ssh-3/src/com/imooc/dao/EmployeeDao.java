package com.imooc.dao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.imooc.entity.Employee;

public class EmployeeDao extends HibernateDaoSupport{

	public void saveEmployee(Employee employee) {
		System.out.print("dao≤„÷¥––");
		this.getHibernateTemplate().save(employee);
	}
}
