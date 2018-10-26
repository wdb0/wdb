package com.iotek.dao;

import com.iotek.model.Department;

import java.util.List;

/**
 * Created by WDB1 on 2018/10/24.
 */
public interface DepartmentDao {
    boolean addDepartment(Department department);
    boolean updateDepartment(Department department);
    boolean delDepartment(int id);
    List<Department> getAllDepartment();
    Department getDepartmentById(int dp_id);
    Department getDepartmentByName(String name);
}
