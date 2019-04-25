package com.atossyntel.ems.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.atossyntel.ems.dao.EmployeeDao;
import com.atossyntel.ems.model.Employee;

@Service
//@Component("employeeServiceImpl")
public class EmployeeServiceImpl implements EmployeeService {

	// dependency
	@Qualifier("employeeMapDaoImpl1")
	@Autowired
	private EmployeeDao employeeDao;
	
	
	public EmployeeServiceImpl() {
		System.out.println("EmployeeServiceImpl created.,.....");
	}

	/*public EmployeeServiceImpl(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
		System.out.println("EmployeeServiceImpl param constrcutor created...,.....");

	}

	@Qualifier("employeeMapDaoImpl")
	@Autowired
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
		System.out.println("EmployeeServiceImpl setEmployeeDao method..,.....");

	}*/

	@Override
	public Employee findEmployee(int employeId) {
		// TODO Auto-generated method stub
		return employeeDao.findEmployee(employeId);
	}

	@Override
	public boolean deleteEmployee(int employeeId) {
		// TODO Auto-generated method stub
		return employeeDao.deleteEmployee(employeeId);
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDao.updateEmployee(employee);
	}

	@Override
	public boolean addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDao.addEmployee(employee);
	}

	@Override
	public List<Employee> findAllEmployees() {
		// TODO Auto-generated method stub
		
		System.out.println("Dependency :"+employeeDao.getClass().getName());
		
		return employeeDao.findAllEmployees();
	}

}
