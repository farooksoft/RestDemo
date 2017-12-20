package com.stackroute.restful.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.restful.model.Employee;
import com.stackroute.restful.service.EmployeeService;

@RestController

public class EmployeeController {

	EmployeeService employeeService = new EmployeeService();

	@RequestMapping(value = "/Employee", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Employee> getCountries() {
		List<Employee> listOfCountries = employeeService.getAllEmployeeMembers();
		return listOfCountries;
	}

	@RequestMapping(value = "/Employee/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public Employee getemployeeById(@PathVariable int id) {
		return employeeService.getEmployee(id);
	}

	@RequestMapping(value = "/Employee", method = RequestMethod.POST, headers = "Accept=application/json")
	public Employee addemployee(@RequestBody Employee employee) {
		return employeeService.addEmployee(employee);
	}

	@RequestMapping(value = "/Employee", method = RequestMethod.PUT, headers = "Accept=application/json")
	public Employee updateemployee(@RequestBody Employee employee) {
		return employeeService.updateEmployee(employee);

	}

	@RequestMapping(value = "/Employee/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	public void deleteemployee(@PathVariable("id") int id) {
		employeeService.deleteEmployee(id);

}
}