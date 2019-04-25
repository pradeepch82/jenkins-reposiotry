package com.atossyntel.ems.rest.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atossyntel.ems.model.Employee;
import com.atossyntel.ems.service.EmployeeService;


@RequestMapping("/employees")
@RestController
public class EmsRestController {


	@Qualifier("employeeServiceImpl")
	@Autowired
	private EmployeeService employeeService;

	public EmsRestController() {
		System.out.println("######### EmsRestController created########");
	}

	
	@ApiOperation("retrive all employees")
	@GetMapping
	public List<Employee> getAllEmployees() {
	return employeeService.findAllEmployees();
	}
		
	@ApiOperation("retrive employee by id")
	
	@GetMapping("/{id}")
	public Employee getEmployee(@PathVariable("id")int id) {
	return employeeService.findEmployee(id);
	}
	
	@ApiOperation("delete employee by id")
	@DeleteMapping("/{id}")
	public List<Employee> deleteEmployee(@PathVariable("id")int id) {
		   employeeService.deleteEmployee(id);
		return employeeService.findAllEmployees();
	
	}
	

	
	@ApiResponses(value={
			@ApiResponse(code=500,message="Internal Server Error"),
			@ApiResponse(code=403,message="Access Denied")}
			)
	@ApiOperation("uodate employee by id")
	@PutMapping("/{id}")
	public List<Employee> updateEmployee(@PathVariable("id")int id,@RequestBody Employee employee) {
		  employeeService.updateEmployee(employee);
		  return employeeService.findAllEmployees();
	
	}
	

	@ApiOperation("add employee")
	@PostMapping
	public List<Employee> addEmployee(@RequestBody Employee employee) {
		  employeeService.addEmployee(employee);
		  return employeeService.findAllEmployees();
	
	}
	
	
}
