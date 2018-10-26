package com.iotek.utils;

/**
 * Created by WDB1 on 2018/9/7.
 */
public class DoPage {
    private static final int PAGESIZE=5;

    public static int getTotalPages(int totalRows){
        return totalRows%PAGESIZE==0?totalRows/PAGESIZE:(totalRows/PAGESIZE)+1;
    }
}
