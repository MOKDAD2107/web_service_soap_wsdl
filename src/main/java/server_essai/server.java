package server_essai;
import jakarta.xml.ws.Endpoint;
import ws.banque_service;
public class server {
    public static void main(String[] args) {
        String url = "http://localhost:2211/";
        Endpoint.publish(url,new banque_service());
        System.out.println("Server Started in: "+url);
    }
}
