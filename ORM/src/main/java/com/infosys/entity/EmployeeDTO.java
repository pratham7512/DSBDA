package com.infosys.entity;

import lombok.Data;

@Data
public class EmployeeDTO {
	private Integer emp_id;
	private String emp_name;
	private String emp_desg;
	private Integer emp_sal;
	
	public static Employee prepareDTO (EmployeeDTO empDTO) {
		Employee employeeEntity= new Employee();
		employeeEntity.setEmp_id(empDTO.getEmp_id());
		employeeEntity.setEmp_name(empDTO.getEmp_name());
		employeeEntity.setEmp_desg(empDTO.getEmp_desg());
		employeeEntity.setEmp_sal(empDTO.getEmp_sal());
		return employeeEntity;
	}
}
