package net.javaguides.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

import net.javaguides.springboot.model.EmployeeModel;
import net.javaguides.springboot.repository.EmployeeRepository;


@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public List<EmployeeModel> getAllEmployee(){
		return employeeRepository.findAll();
	}
	
	@Override
	public void saveEmployee(EmployeeModel employee) {
		this.employeeRepository.save(employee);
	}
	
	@Override
	public EmployeeModel getEmployeeById(long id) {
		Optional<EmployeeModel> optional = employeeRepository.findById(id);
		EmployeeModel employee = null;
		if(optional.isPresent()) {
			employee = optional.get();
		}else {
			throw new RuntimeException("Employee not found for id :: "+id);
		}
		return employee;
	}
	
	@Override
	public void deleteEmployeeById(long id) {
		this.employeeRepository.deleteById(id);
	}
}
