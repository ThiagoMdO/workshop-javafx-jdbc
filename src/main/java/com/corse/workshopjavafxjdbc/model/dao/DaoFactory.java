package com.corse.workshopjavafxjdbc.model.dao;

import com.corse.workshopjavafxjdbc.db.DB;
import com.corse.workshopjavafxjdbc.model.dao.impl.DepartmentDaoJDBC;
import com.corse.workshopjavafxjdbc.model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}

	public static DepartmentDao createDepartmentDao() {
		return new DepartmentDaoJDBC(DB.getConnection());
	}
}
