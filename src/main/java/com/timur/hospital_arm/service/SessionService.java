package com.timur.hospital_arm.service;

import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

@Service
public class SessionService {
    public boolean checkLogged(HttpSession session){
        if(session.getAttribute("LoggedInHospitalClient")!= null) return true;
        else return false;
    }
}
