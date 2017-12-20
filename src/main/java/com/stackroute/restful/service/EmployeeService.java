package com.stackroute.restful.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.stackroute.restful.model.Employee;

public class EmployeeService {
	static HashMap<Integer, Employee> EmployeeIdMap = getEmployeeIdMap();

	public EmployeeService() {
		super();

		if (EmployeeIdMap == null) {
			EmployeeIdMap = new HashMap<Integer, Employee>();
			// Creating some objects of Employee while initializing
			Employee tom = new Employee(1, "TOM", 50000, "HR");
			Employee jerry = new Employee(2, "JERRY", 49500, "TL");
			Employee olive = new Employee(3, "OLIVE", 48342, "ACC MGR");
			Employee stuart = new Employee(4, "STUART", 51230, "HRM");

			EmployeeIdMap.put(1, tom);
			EmployeeIdMap.put(2, jerry);
			EmployeeIdMap.put(3, olive);
			EmployeeIdMap.put(4, stuart);
		}
	}

	public List<Employee> getAllEmployeeMembers() {
		List<Employee> members = new ArrayList<Employee>(EmployeeIdMap.values());
		return members;
	}

	public Employee getEmployee(int id) {
		Employee Employee = EmployeeIdMap.get(id);
		return Employee;
	}

	public Employee addEmployee(Employee Employee) {
		Employee.setId(getMaxId() + 1);
		EmployeeIdMap.put(Employee.getId(), Employee);
		return Employee;
	}

	public Employee updateEmployee(Employee Employee) {
		if (Employee.getId() <= 0)
			return null;
		EmployeeIdMap.put(Employee.getId(), Employee);
		return Employee;

	}

	public void deleteEmployee(int id) {
		EmployeeIdMap.remove(id);
	}

	public static HashMap<Integer, Employee> getEmployeeIdMap() {
		return EmployeeIdMap;
	}

	// Utility method to get max id
	public static int getMaxId() {
		int max = 0;
		for (int id : EmployeeIdMap.keySet()) {
			if (max <= id)
				max = id;

		}
		return max;
	}
}
