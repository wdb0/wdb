package com.iotek.service;

import com.iotek.model.Staff;

import java.util.HashMap;
import java.util.List;

/**
 * Created by WDB1 on 2018/10/25.
 */
public interface StaffService {
    boolean addStaff(Staff staff);
    boolean delStaff(int id);
    boolean updtaeStaff(Staff staff);
    List<Staff> getAllStaff();
    Staff getStaffById(int id);
    List<Staff> getStaffByDpidAndJobid(int dp_id,int job_id);
    List<Staff> getStaffByState(int state);
    Staff getStaffByNameAndPass(String sf_name,String sf_pass);
    List<Staff> getStaffByLimit(int currentPage, int pageSize);
}
