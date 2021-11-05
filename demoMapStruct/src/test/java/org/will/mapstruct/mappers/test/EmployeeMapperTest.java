package org.will.mapstruct.mappers.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mapstruct.factory.Mappers;
import org.will.mapstruct.domain.Employee;
import org.will.mapstruct.dto.EmployeeDTO;
import org.will.mapstruct.mappers.EmployeeMapper;

public class EmployeeMapperTest {

	private static final String FIRST_NAME = "Deborah";
	private static final String LAST_NAME = "Harry";

	@Test
	public void mapEmployeeToDTO() {
		EmployeeMapper map = Mappers.getMapper(EmployeeMapper.class);
		Employee emp = new Employee(FIRST_NAME, LAST_NAME);
		EmployeeDTO empDTO = map.enployeeToDTO(emp);

		assertEquals(emp.getFirstName(), empDTO.getFirstName());
		assertEquals(emp.getLastName(), empDTO.getLastName());
	}

	@Test
	public void mapDTOToEmployee() {
		EmployeeMapper map = Mappers.getMapper(EmployeeMapper.class);
		EmployeeDTO empDTO = new EmployeeDTO(FIRST_NAME, LAST_NAME);
		Employee emp = map.DTOToEmployee(empDTO);

		assertEquals(emp.getFirstName(), empDTO.getFirstName());
		assertEquals(emp.getLastName(), empDTO.getLastName());
	}
}
