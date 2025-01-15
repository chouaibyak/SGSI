import java.util.*;
public class Serveur {
  private String addressIP;
  private int port;
  private List<Thread> threads;

  public Serveur(String addressIP, int port){
    this.addressIP=addressIP;
    this.port=port;
    this.threads=new ArrayList<Thread>();
  }
  //Getters
  public String getAddress(){
    return addressIP;
  }
  public int getPort(){
    return port;
  }

  //Setters
  public void setAddress(String addressIP){
    this.addressIP=addressIP;
  }
  public void setPort(int port){
    this.port=port;
  }
  //methodes
  public void demarrerServeur(String addressIP, int port){
    if(this.addressIP==addressIP && this.port==port){
      System.out.println("")
    }


  }
  public void gererConnexion(){

  }

  
}
