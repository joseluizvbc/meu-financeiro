package model.dao.database.jpa;

import model.entity.CentroCusto;

public interface DAO {

	void create(CentroCusto t);
	
	CentroCusto read(Long id);
	
	void update(CentroCusto t);
	
	void delete(Long id);
}
