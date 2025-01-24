import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BaseDeDonnees {
  private String url;
  private String nomUtilisateur;
  private String motDePasse;

  public BaseDeDonnees(String url, String nomUtilisateur, String motDePasse) {
    this.url = url;
    this.motDePasse = motDePasse;
    this.nomUtilisateur = nomUtilisateur;
  }

  // methodes
  public void executerRequete(String requete) {
    Connection connection = null;
    Statement statement = null;

    try {
      connection = DriverManager.getConnection(url, nomUtilisateur, motDePasse);
      System.out.println("connexion a la base de donne reussie !");

      // creer un statement pour executer un requete
      statement = connection.createStatement();

      // verfier si "Select"
      if (requete.trim().toUpperCase().startsWith("SELECT")) {
        ResultSet resultSet = statement.executeQuery(requete);
        // afficher les resultat
        while (resultSet.next()) {
          System.out.println("resultat : " + resultSet.getString(1));
        }
      } else {
        // executer un requete de mis a jour(insert, update, delete)
        int lignesAffectees = statement.executeUpdate(requete);
        // afficher les resultat
        System.out.println("Requete execute avec succes, " + lignesAffectees + "ligne a affexter");
      }
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      // fermer connection
      fermerConnexion(connection, statement);
    }

  }

  public void fermerConnexion(Connection connection, Statement statement) {
    try {
      if (connection != null) {
        connection.close(); // Fermer connexion
      }
      if (statement != null) {
        statement.close(); // fermer statement
      }
      System.out.println("Connexion et ressources fermees avex succes !");
    } catch (SQLException e) {
      System.out.println("Erreur de la fermeture des ressources : " + e.getLocalizedMessage());
    }
  }
}
