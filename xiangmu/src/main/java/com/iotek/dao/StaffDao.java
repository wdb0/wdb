package com.iotek.dao;

import com.iotek.model.Staff;

import java.util.HashMap;
import java.util.List;

/**
 * Created by WDB1 on 2018/10/25.
 */
public interface StaffDao {
    boolean addStaff(Staff staff);
    boolean delStaff(int id);
    boolean updtaeStaff(Staff staff);
    List<Staff> getAllStaff();
    Staff getStaffById(int id);
    List<Staff> getStaffByDpidAndJobid(HashMap<String, Object> hashMap);
    List<Staff> getStaffByState(int state);
    Staff getStaffByNameAndPass(HashMap<String, Object> hashMap);
    List<Staff> getStaffByLimit(HashMap<String, Object> hashMap);
}
