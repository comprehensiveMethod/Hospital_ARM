package com.timur.hospital_arm.controllers;

import com.timur.hospital_arm.models.Client;
import com.timur.hospital_arm.repositories.ClientRepository;
import com.timur.hospital_arm.service.ClientService;
import com.timur.hospital_arm.service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
public class RegController {
    @Autowired
    SessionService sessionService;
    @Autowired
    ClientService clientService;
    @GetMapping("/register")
    public String regPage(HttpSession session, Model model){
        if(sessionService.checkLogged(session)) return "loggedPage";
        else{
            model.addAttribute("LoggedInHospitalClient", new Client());
            return "regPage";
        }
    }
    @PostMapping("/register")
    public String reg(@ModelAttribute("LoggedInHospitalClient") Client client, HttpSession session, Model model){
        session.setAttribute("LoggedInHospitalClient", client);
        clientService.saveToDB(client);
        return "redirect:/";
    }
}
