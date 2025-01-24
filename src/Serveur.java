import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import java.util.ArrayList;
import java.util.List;

public class Serveur {
  private String addressIP;
  private int port;
  private List<Thread> threads;

  public Serveur(String addressIP, int port) {
    this.addressIP = addressIP;
    this.port = port;
    this.threads = new ArrayList<Thread>();
  }

  // Getters
  public String getAddress() {
    return addressIP;
  }

  public int getPort() {
    return port;
  }

  // Setters
  public void setAddress(String addressIP) {
    this.addressIP = addressIP;
  }

  public void setPort(int port) {
    this.port = port;
  }

  // methodes
  public void demarrerServeur() {
    ServerSocket serverSocket = null;
    try {
      serverSocket = new ServerSocket(port);
      System.out.println("Serveur démarré sur " + addressIP + ":" + port);

      while (true) {
        Socket clientSocket = serverSocket.accept(); // bloque programme jusqu'à un client connecte
        System.out.println("Nouvelle connexion de " + clientSocket.getInetAddress());

        // Créer un thread pour gérer cette connexion
        Thread thread = new Thread(() -> gererConnexion(clientSocket));
        threads.add(thread);
        thread.start();
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void gererConnexion(Socket clientSocket) {
    try {
      BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
      PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
      String msg;
      while ((msg = in.readLine()) != null) {
        System.out.println("Recu :" + msg);

        String reponse = "Serveur : " + msg;
        out.println(reponse);
        if (msg.equalsIgnoreCase("exit")) {
          break;
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        clientSocket.close(); // Fermer la connexion
        System.out.println("Connexion fermée avec le client.");
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
