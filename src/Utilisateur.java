public class Utilisateur {
  private int id;
  private String nomUtilisateur;
  private String motDePasse;
  private String role; // Exemple : "admin", "utilisateur", "technicien"

  public Utilisateur(int id, String nomUtilisateur, String motDePasse, String role) {
    this.id = id;
    this.nomUtilisateur = nomUtilisateur;
    this.motDePasse = motDePasse;
    this.role = role;
  }

  // Getters
  public int getId() {
    return id;
  }

  public String getNomUtilisateur() {
    return nomUtilisateur;
  }

  public String getMotDePasse() {
    return motDePasse;
  }

  public String getRole() {
    return role;
  }

  // Setters
  public void setId(int id) {
    this.id = id;
  }

  public void setNomUtilisateur(String nomUtilisateur) {
    this.nomUtilisateur = nomUtilisateur;
  }

  public void setMotDePasse(String motDePasse) {
    this.motDePasse = motDePasse;
  }

  public void setRole(String role) {
    this.role = role;
  }

  // methodes
  public void seConnecter(String nomUtilisateur, String motDePasse) {
    // verifier si cette personne deja connecter
    if (this.nomUtilisateur == nomUtilisateur && this.motDePasse == motDePasse) {
      System.out.println("connexion reussit. bienvenue " + this.nomUtilisateur);
    } else {
      System.out.println("Erreur, nom d'Utilisateur ou mot de passe n'est pas correct");
    }
  }

  public void seDeconnecter() {
    System.out.println("vous avez deconnecter");
  }

  @Override
  public String toString() {
    return "Utilisateur[ id : " + id + " nom Utilisateur : " + nomUtilisateur + " mot de passe : " + motDePasse
        + " role : " + role + "]";
  }

}
