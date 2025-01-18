public class Processus {
  private int idProcessus;
  private String nom;
  private String etat;

  public Processus(int idProcessus, String nom, String etat) {
    this.idProcessus = idProcessus;
    this.nom = nom;
    this.etat = etat;
  }

  // methodes
  public void listerProcessus() {
    System.out.println("liste des processus");
    System.out.println("id : " + idProcessus + " nom : " + nom + " etat : " + etat);
  }

  public void arreterProcessus() {
    // lorsque etat n'est close changer a close
    if (!etat.equalsIgnoreCase("close")) {
      etat = "close";
      System.out.println("processus " + idProcessus + " a ete arreter");
    } else {
      System.out.println("processus " + idProcessus + " deja arreter");
    }
  }
}
