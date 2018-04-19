package fr.utbm.lo54.controller;

import fr.utbm.lo54.entity.Client;
import fr.utbm.lo54.entity.CourseSession;
import fr.utbm.lo54.repository.CourseSessionDao;
import fr.utbm.lo54.service.ClientService;

import java.util.Scanner;

/**
 * Created by matbo on 14/04/2018.
 */
public class DefaultClientController {

    public void registerClientFromInput(){
        //todo scanner des informations client
        Integer id=0;
        CourseSession courseSession = new CourseSessionDao().getCourseSession(id);
        String firstname = "";
        String lastname = "";
        String phone = "";
        String address = "";
        String email = "";
        Client client = new Client(courseSession,lastname,firstname,address,phone,email);

        ClientService clientService = new ClientService();
        clientService.registerClient(client);
    }
}
