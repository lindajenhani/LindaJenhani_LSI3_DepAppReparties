package clientPackage;

import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main (String[] args) throws IOException{
        // Affiche un message pour indiquer que le client n'est pas encore connecté.
        System.out.println("Je suis un client pas encore connecté");
        
        // Crée une instance de Socket pour établir une connexion avec le serveur sur localhost (port 2020).
        Socket s = new Socket("localhost", 2020);
        
        // Affiche un message pour indiquer que le client est connecté.
        System.out.println("Je suis un client connecté");

        // Ferme la connexion du socket.
        s.close();
    }
}
