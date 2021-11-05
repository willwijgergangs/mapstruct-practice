package org.will.mapstruct.mappers;

import org.mapstruct.Mapper;
import org.will.mapstruct.domain.Employee;
import org.will.mapstruct.dto.EmployeeDTO;

@Mapper
public interface EmployeeMapper {
	EmployeeDTO enployeeToDTO(Employee employee);

	Employee DTOToEmployee(EmployeeDTO EmployeeDTO);
}
