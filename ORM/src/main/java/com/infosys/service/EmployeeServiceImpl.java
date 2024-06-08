package com.infosys.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.dao.EmployeeDao;
import com.infosys.entity.Employee;
import com.infosys.entity.EmployeeDTO;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeDao employeeDao;
	@Override
	public List<EmployeeDTO> getAll() {
		List<EmployeeDTO> empList= new ArrayList<>();
		List<Employee> EmpEntityList=employeeDao.getAll();
		for(Employee employeeEntity : EmpEntityList) {
			EmployeeDTO empDTO=Employee.prepareDTO(employeeEntity);
			empList.add(empDTO);
		}
		return empList;
	}

}
