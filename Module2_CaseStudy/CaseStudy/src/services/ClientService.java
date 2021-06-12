package services;

import file.ClientIO;
import model.Client;
import model.Taxi;
import java.util.ArrayList;
import java.util.List;
import static file.Path.PATH_FILE_CLIENT;


public class ClientService implements GeneralService<Client> {
    private List<Client> clients;
    private static ClientService instance;

    private ClientService() {
        this.clients = ClientIO.readFromFile(PATH_FILE_CLIENT);
    }

    public static ClientService getInstance() {
        if(instance==null) instance=new ClientService();
        return instance;
    }

    public List<Client> getClients() {
        return clients;
    }

    @Override
    public void create(Client client) {
        this.clients.add(client);
        ClientIO.writeToFile(PATH_FILE_CLIENT,this.clients);
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
        ClientIO.writeToFile(PATH_FILE_CLIENT,this.clients);
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
        ClientIO.writeToFile(PATH_FILE_CLIENT,this.clients);
    }

    @Override
    public Client findById(int id) {
        int index=-1;
        for (int i = 0; i < clients.size(); i++) {
            if(clients.get(i).getClientID()==id) {
                index=i;
            }
        }
        if(index==-1) {
            System.out.println("Found no client with id "+id);
            return null;
        } else {
            System.out.println("Client is found successfully!");
            return clients.get(index);
        }
    }

    public Client findByUsername(String username) {
        List<Taxi> findList=new ArrayList<>();
        int index=-1;
        for (int i = 0; i < clients.size(); i++) {
            if(clients.get(i).getClientUsername().equals(username)) {
                index=i;
            }
        }
        if(index==-1) {
            return null;
        } else {
            return clients.get(index);
        }
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
