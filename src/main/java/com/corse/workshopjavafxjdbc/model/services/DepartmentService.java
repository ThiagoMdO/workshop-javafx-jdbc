package com.corse.workshopjavafxjdbc.model.services;

import com.corse.workshopjavafxjdbc.model.dao.DaoFactory;
import com.corse.workshopjavafxjdbc.model.dao.DepartmentDao;
import com.corse.workshopjavafxjdbc.model.entities.Department;

import java.util.ArrayList;
import java.util.List;

public class DepartmentService {

    private DepartmentDao dao = DaoFactory.createDepartmentDao();

    public List<Department> findAll(){
        return dao.findAll();
    }
}
