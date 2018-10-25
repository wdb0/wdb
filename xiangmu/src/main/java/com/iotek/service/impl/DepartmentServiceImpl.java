package com.iotek.service.impl;

import com.iotek.dao.DepartmentDao;
import com.iotek.model.Department;
import com.iotek.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by WDB1 on 2018/10/24.
 */
@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentDao departmentDao;
    public boolean addDepartment(Department department) {
        return departmentDao.addDepartment(department);
    }

    public boolean updateDepartment(Department department) {
        return departmentDao.updateDepartment(department);
    }

    public boolean delDepartment(int id) {
        return departmentDao.delDepartment(id);
    }

    public List<Department> getAllDepartment() {
        return departmentDao.getAllDepartment();
    }

    public Department getDepartmentById(int dp_id) {
        return departmentDao.getDepartmentById(dp_id);
    }
}
