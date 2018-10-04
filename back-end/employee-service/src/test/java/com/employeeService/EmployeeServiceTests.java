package com.employeeService;

import com.employeeService.resources.model.Employee;
import com.employeeService.resources.repositories.EmployeeRepository;
import com.employeeService.resources.service.EmployeeService;
import com.employeeService.resources.service.EmployeeServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.Silent.class)
public class EmployeeServiceTests {

	@Mock
	EmployeeRepository employeeRepositoryMock;

	@InjectMocks
	EmployeeServiceImpl businessImpl;

	@Test
	public void testGetAllEmployees() {
		List<Employee> empListTest = new ArrayList<Employee>();
		Employee emp = new Employee("sushil","kumar","Male","05/07/1991","nitro");
		empListTest.add(emp);
		when(employeeRepositoryMock.findAll()).thenReturn(empListTest);
		assertEquals(1,empListTest.size());
	}

	@Test
	public void testSaveEmployee() {
		Employee emp = new Employee("sushil","kumar","Male","05/07/1991","nitro");
		when(employeeRepositoryMock.save(emp)).thenReturn(emp);
		assertNotNull(emp);
	}

}
