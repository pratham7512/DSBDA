package com.infosys;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.infosys.entity.EmployeeDTO;
import com.infosys.service.EmployeeService;

@SpringBootApplication
public class OrmApplication implements CommandLineRunner {
	@Autowired
	ApplicationContext context;
	public static void main(String[] args)  {
		SpringApplication.run(OrmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		EmployeeService emploserv=context.getBean("employeeService",EmployeeService.class);
		ArrayList<EmployeeDTO> eList=(ArrayList<EmployeeDTO>)emploserv.getAll();	
		for(EmployeeDTO employee:eList) {
			System.out.println(employee);
		}
	}
}
