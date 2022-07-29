package com.timur.hospital_arm.service;

import com.timur.hospital_arm.models.Client;
import com.timur.hospital_arm.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    @Autowired
    ClientRepository clientRepository;
    public void saveToDB(Client client){
        clientRepository.save(client);
    }
}
