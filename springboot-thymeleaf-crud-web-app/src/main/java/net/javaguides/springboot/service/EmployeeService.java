package net.javaguides.springboot.service;

import net.javaguides.springboot.model.EmployeeModel;
import java.util.List;



public interface EmployeeService {

	  List<EmployeeModel> getAllEmployee();
	  void saveEmployee(EmployeeModel employee);
	  EmployeeModel getEmployeeById(long id);
	  void deleteEmployeeById(long id);
}
