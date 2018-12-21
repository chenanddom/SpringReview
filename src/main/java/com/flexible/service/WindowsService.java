package com.flexible.service;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: chendom
 * Date: 2018-12-21
 * Time: 12:37
 */
public class WindowsService implements ListService {
    @Override
    public String showListCmd() {
        return "dir";
    }
}
