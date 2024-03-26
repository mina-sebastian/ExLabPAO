package me.mina.lab5.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Server {

    private static Server server;

    private List<String> requesturi;

    private Server(){
        requesturi = new ArrayList<>();
    }

    public static Server getInstance(){
        if(server == null){
            server = new Server();
        }
        return server;
    }


    public List<String> getRequesturi() {
        return requesturi;
    }

    public void setRequesturi(List<String> requesturi) {
        this.requesturi = requesturi;
    }

    public void addRequest(String req){
        requesturi.add(req);
    }

    public void remRequest(String req){
        requesturi.remove(req);
    }

    @Override
    public String toString() {
        return "Lista requesturi: \n" + String.join("\n", requesturi);
    }
}
