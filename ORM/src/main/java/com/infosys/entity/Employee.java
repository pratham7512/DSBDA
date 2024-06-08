package com.infosys.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity

public class Employee {
	@Id
	private Integer emp_id;
	private String emp_name;
	private String emp_desg;
	private Integer emp_sal;
	
	public static EmployeeDTO prepareDTO (Employee employeeEntity) {
		EmployeeDTO empDTO= new EmployeeDTO();
		empDTO.setEmp_id(employeeEntity.getEmp_id());
		empDTO.setEmp_name(employeeEntity.getEmp_name());
		empDTO.setEmp_desg(employeeEntity.getEmp_desg());
		empDTO.setEmp_sal(employeeEntity.getEmp_sal());
		return empDTO;
	}
}
