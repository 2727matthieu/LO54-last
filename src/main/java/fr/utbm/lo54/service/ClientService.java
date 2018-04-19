package fr.utbm.lo54.service;

import fr.utbm.lo54.entity.Client;
import fr.utbm.lo54.repository.ClientDao;

/**
 * Created by matbo on 14/04/2018.
 */
public class ClientService {
    public void registerClient(Client client){
        //todo appelle vers clientDao pour enregistrer dans la bdd
        ClientDao clientDao = new ClientDao();
        clientDao.saveNewClient(client);
    }
}
