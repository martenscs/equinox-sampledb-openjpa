package net.martenscs.osgi.example.repository;

import net.martenscs.osgi.example.domain.OfficeEntity;
import net.martenscs.osgi.example.domain.api.Office;
import net.martenscs.osgi.example.domain.api.Repository;

public class OfficeRepository extends GenericRepository<Office, String>
		implements Repository<Office, String> {

	public void init() {
	}

	@Override
	public String getDeleteNamedQuery() {
		return "deleteOfficeById";
	}

	@Override
	public String getFindNamedQuery() {
		return "findOfficeById";
	}

	@Override
	public String getFindAllNamedQuery() {
		return "findAllOffices";
	}

	@Override
	public Class<?> getEntityClass() {
		return OfficeEntity.class;
	}

}
