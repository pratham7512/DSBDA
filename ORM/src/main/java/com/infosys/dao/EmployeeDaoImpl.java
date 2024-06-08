package com.infosys.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.infosys.entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.PersistenceUnit;
import jakarta.persistence.Query;

@Repository("employeeRepository")
public class EmployeeDaoImpl implements EmployeeDao{

	private EntityManagerFactory entityManagerFactory;
	
	@PersistenceUnit
	public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
		this.entityManagerFactory=entityManagerFactory;
	}
	@Override
	public List<Employee> getAll() {
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("Select c from Employee c");
		return (List<Employee>)query.getResultList();
	}

}
