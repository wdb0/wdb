package com.iotek.service.impl;

import com.iotek.dao.StaffDao;
import com.iotek.model.Staff;
import com.iotek.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * Created by WDB1 on 2018/10/25.
 */
@Service
public class StaffServiceImpl implements StaffService {
    @Autowired
    private StaffDao staffDao;
    public boolean addStaff(Staff staff) {
        return staffDao.addStaff(staff);
    }

    public boolean delStaff(int id) {
        return staffDao.delStaff(id);
    }

    public boolean updtaeStaff(Staff staff) {
        return staffDao.updtaeStaff(staff);
    }

    public List<Staff> getAllStaff() {
        return staffDao.getAllStaff();
    }

    public Staff getStaffById(int id) {
        return staffDao.getStaffById(id);
    }

    public List<Staff> getStaffByDpidAndJobid(int dp_id, int job_id) {
        HashMap<String, Object> map = new HashMap();
        map.put("dp_id",dp_id);
        map.put("job_id",job_id);
        return staffDao.getStaffByDpidAndJobid(map);
    }

    public List<Staff> getStaffByState(int state) {
        return staffDao.getStaffByState(state);
    }

    public Staff getStaffByNameAndPass(String sf_name, String sf_pass) {
        HashMap<String, Object> map = new HashMap();
        map.put("sf_name",sf_name);
        map.put("sf_pass",sf_pass);
        return staffDao.getStaffByNameAndPass(map);
    }

    public List<Staff> getStaffByLimit(int currentPage, int pageSize) {
        HashMap<String, Object> map = new HashMap();
        map.put("currentPage", (currentPage-1)*pageSize);
        map.put("pageSize", currentPage*pageSize);
        return staffDao.getStaffByLimit(map);
    }
}
