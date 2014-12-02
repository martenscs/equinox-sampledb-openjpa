package net.martenscs.osgi.example.repository;

import net.martenscs.osgi.example.domain.EmployeeEntity;
import net.martenscs.osgi.example.domain.api.Employee;
import net.martenscs.osgi.example.domain.api.Repository;

public class EmployeeRepository extends GenericRepository<Employee, Integer>
		implements Repository<Employee, Integer> {

	public void init() {
	}

	@Override
	public String getDeleteNamedQuery() {
		return "deleteEmployeeById";
	}

	@Override
	public String getFindNamedQuery() {
		return "findEmployeeById";
	}

	@Override
	public String getFindAllNamedQuery() {
		return "findAllEmployees";
	}

	@Override
	public Class<?> getEntityClass() {
		return EmployeeEntity.class;
	}

}
