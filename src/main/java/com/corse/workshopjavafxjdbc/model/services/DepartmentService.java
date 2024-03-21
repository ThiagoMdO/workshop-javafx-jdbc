package com.corse.workshopjavafxjdbc.model.services;

import com.corse.workshopjavafxjdbc.model.entities.Department;

import java.util.ArrayList;
import java.util.List;

public class DepartmentService {

    public List<Department> findAll(){
        List<Department> list = new ArrayList<>();
        list.add(new Department(1, "Books"));
        list.add(new Department(2, "Eletronics"));
        list.add(new Department(3, "Food"));

        return list;
    }
}