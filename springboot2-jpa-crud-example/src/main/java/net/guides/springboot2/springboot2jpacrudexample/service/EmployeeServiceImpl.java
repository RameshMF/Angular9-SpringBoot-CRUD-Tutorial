package net.guides.springboot2.springboot2jpacrudexample.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.guides.springboot2.springboot2jpacrudexample.model.Employee;
import net.guides.springboot2.springboot2jpacrudexample.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> getAllEmployees() {
		return this.employeeRepository.findAll();
	}

	@Override
	public Optional<Employee> getEmployeeById(Long employeeId) {
		return this.employeeRepository.findById(employeeId);
	}

	@Override
	public Employee createEmployee(Employee employee) {
		return this.employeeRepository.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employeeDetails) {
		return this.employeeRepository.save(employeeDetails);
	}

	@Override
	public void deleteEmployee(Employee employee) {
		this.employeeRepository.delete(employee);
	}

}
