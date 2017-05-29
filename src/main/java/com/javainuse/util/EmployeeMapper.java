package com.javainuse.util;

import com.javainuse.domain.Employee;
import com.javainuse.domain.Request;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeMapper {

	public Map<String, Object> getMap(Employee employee) {
		Map<String, Object> answer = new HashMap<String, Object>();
		answer.put("EmpId", employee.getEmpId());
		answer.put("EmpName", employee.getEmpName());
		return answer;
	}

	public List<Employee> readEmployees(List<Map<String, String>> dataList) {

		System.out.println("data:" + dataList);

		List<Employee> employees = new ArrayList<Employee>();

		if (dataList.size() > 0) {
			for (Map<String, String> data : dataList) {

				Employee employee = new Employee();

				employee.setEmpId(data.get("EmpId"));
				employee.setEmpName(data.get("EmpName"));

				employees.add(employee);
			}
		}

		return employees;
	}

	public Map<String, Object> getJson(Request req) {
		
		System.out.println("data :"+req);
		
		Map<String, Object> answer = new HashMap<String, Object>();
		answer.put("InData", req.getInData());
		return answer;
	}
}