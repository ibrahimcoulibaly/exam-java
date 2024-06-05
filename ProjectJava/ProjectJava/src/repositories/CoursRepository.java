package repositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entities.Cours;

public class CoursRepository {
     public  List<Cours> selectAll(){
         List<Cours> cours=new ArrayList<>();
       try {
          Class.forName("com.mysql.cj.jdbc.Driver");
          Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/examenjava"
                    , "root", "");
          //3-Execution et Recuperation
           Statement statement = conn.createStatement();
           ResultSet rs=   statement.executeQuery("select * from cours");
             while (rs.next()) {
               //Une ligne du ResultSet ==> Une Agence
                 Cours co=new Cours();
                 co.setIdCours(rs.getInt("id_cours"));
                 co.setDateCours(rs.getDate("date_cours").toLocalDate());
                 co.setHeureCours(rs.getTime("heure_debut").toLocalTime());
                 cours.add(co);
             }
             rs.close();
             conn.close();
        } catch (ClassNotFoundException e) {
          System.out.println("Erreur de chargement de Driver");
        }
       catch (SQLException e) {
        System.out.println("Erreur de Connexion a la BD");
      }
        return  cours;
    }
    public  void insert(Cours cours){
        try {
             //1-Chargement du Driver
             Class.forName("com.mysql.cj.jdbc.Driver");
             //2-Se Connecter a une BD
             Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/examenjava"
                       , "root", "");
               //3-Execution et Recuperation
               Statement statement = conn.createStatement();
               int nbreLigne=statement.executeUpdate("INSERT INTO `cours` ( `Date_cours`,`Heure_cours`) VALUES ('"+cours.getDateCours()+""+cours.getHeureCours()+"')");
               conn.close();
                conn.close();
           } catch (ClassNotFoundException e) {
               System.out.println("Erreur de chargement de Driver");
           }
          catch (SQLException e) {
             System.out.println("Erreur de Connexion a la BD");
         }
        }
}
