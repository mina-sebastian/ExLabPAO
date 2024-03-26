package me.mina.lab5.singleton;

public class Application {

    public static void main(String[] args) {
        Server.getInstance().addRequest("HTTP - GET - index.html");
        Server.getInstance().addRequest("HTTP - POST - api/endpoint");
        Server.getInstance().addRequest("HTTP - PUT - api/endpoint3");
        Server.getInstance().addRequest("HTTP - PATCH - api/endpoint5");

        System.out.println(Server.getInstance().toString());

        Server.getInstance().remRequest("HTTP - PUT - api/endpoint3");

        System.out.println(Server.getInstance().toString());
    }
}
