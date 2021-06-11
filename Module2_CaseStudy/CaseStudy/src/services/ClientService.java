package services;

import model.Client;

import java.util.ArrayList;
import java.util.List;

public class ClientService implements GeneralService<Client> {
    private List<Client> clients;

    public ClientService() {
        this.clients = new ArrayList<>();
    }

    @Override
    public void create(Client client) {
        clients.add(client);
    }

    @Override
    public void delete(int id) {
        int index=-1;
        for (int i = 0; i < clients.size(); i++) {
            if(clients.get(i).getClientID()==id) {
                clients.remove(i);
                index=i;
            }
        }
        if(index==-1) System.out.println("Found no client to delete!");
        else System.out.println("Delete successfully!");
    }

    @Override
    public void update(int id, Client client) {
        int index=-1;
        for (int i = 0; i < clients.size(); i++) {
            if(clients.get(i).getClientID()==id) {
                clients.set(i,client);
                index=i;
            }
        }
        if(index==-1) System.out.println("Found no id match "+id);
        else System.out.println("Update successfully");
    }

    @Override
    public List<Client> findByName(String name) {
        List<Client> findList=new ArrayList<>();
        for (int i = 0; i < clients.size(); i++) {
            if(clients.get(i).getClientName().equals(name))  findList.add(clients.get(i));
        }
        if (findList.isEmpty()) System.out.println("Found no client with name of "+name);
        else {
            System.out.println("List client is found");
        }
        return findList;
    }

    @Override
    public List<Client> findAll() {
        return clients;
    }

    @Override
    public void display() {
        for (Client client:clients) {
            System.out.println(client);
        }
    }
}
