public class EquipementReseau {
  private int id;
  private String nom;
  private String adresseIP;
  private String etat;

  public EquipementReseau(int id, String nom, String adresseIP, String etat) {
    this.id = id;
    this.nom = nom;
    this.adresseIP = adresseIP;
    this.etat = etat;
  }

  // getters
  public int getId() {
    return id;
  }

  public String getNom() {
    return nom;
  }

  public String getadresseIP() {
    return adresseIP;
  }

  public String getEtat() {
    return etat;
  }

  // setters
  public void setId(int id) {
    this.id = id;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public void setadresseIP(String adresseIP) {
    this.adresseIP = adresseIP;
  }

  public void setEtat(String etat) {
    this.etat = etat;
  }

  // methodes
  public void ajoute() {
    System.out.println("Equipement a ajouter " + this.nom);
  }

  public void modifier() {
    System.out.println("Equipement a modifier est " + this.nom);
  }

  public void supprimer() {
    System.out.println("Equipement a suprimer " + this.nom);
  }

  public void surveiller() {
    // verifier l'etat d'quipement actif ou inactif
    System.out.println("Equipement " + this.nom);
    if (this.etat == "actif") {
      System.out.println(" L'équipement est en ligne ");
    } else {
      System.out.println("L'équipement est hors ligne ");
    }
  }

  @Override
  public String toString() {
    return "EquipementReseau[ id : " + id + " nom : " + nom + " addressIP : " + adresseIP + " etat : " + etat + "]";
  }
}
