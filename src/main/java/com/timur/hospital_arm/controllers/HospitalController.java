package com.timur.hospital_arm.controllers;

import com.timur.hospital_arm.service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class HospitalController {
    @Autowired
    SessionService sessionService;
    @GetMapping("/")
    public String mainPage(HttpSession session, Model model){
        if(sessionService.checkLogged(session)){
            return "mainPage";
        }
        return "redirect:/register";
    }
}
