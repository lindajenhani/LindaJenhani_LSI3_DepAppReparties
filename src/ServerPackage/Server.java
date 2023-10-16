package ServerPackage;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        // Cree un objet ServerSocket pour ecouter les connexions entrantes sur le port 2020.
        ServerSocket ss = new ServerSocket(2020);
        
        // Affiche un message pour indiquer que le serveur est en attente de la connexion d'un client.
        System.out.println("Je suis un serveur en attente de la connexion d'un client");
        
        // Le serveur attend une connexion entrante et accepte la connexion lorsque qu'un client se connecte.
        Socket s = ss.accept();
        
        // Affiche un message pour indiquer qu'un client est connecté.
        System.out.println("Un client est connecté");

        // Ferme la connexion du socket client.
        s.close();
        
        // Ferme le ServerSocket pour arrêter l'écoute des connexions entrantes.
        ss.close();
    }
}
