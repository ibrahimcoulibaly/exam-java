package repositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entities.Professeur;

public class ProfesseurRepository {
     public  List<Professeur> selectAll(){
         List<Professeur> professeurs=new ArrayList<>();
       try {
          Class.forName("com.mysql.cj.jdbc.Driver");
          Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/examenjava"
                    , "root", "");
          //3-Execution et Recuperation
           Statement statement = conn.createStatement();
           ResultSet rs=   statement.executeQuery("select * from professuer");
             while (rs.next()) {
               //Une ligne du ResultSet ==> Une Agence
                 Professeur pr=new Professeur();
                 pr.setIdProfesseur(rs.getInt("id_professuer"));
                 pr.setNomProfesseur(rs.getString("nom_professeur"));
                 pr.setPrenomProfesseur(rs.getString("prenom_professeur"));

                 professeurs.add(pr);
             }
             rs.close();
             conn.close();
        } catch (ClassNotFoundException e) {
          System.out.println("Erreur de chargement de Driver");
        }
       catch (SQLException e) {
        System.out.println("Erreur de Connexion a la BD");
      }
        return  professeurs;
    }
    public  void insert(Professeur professeur){
        try {
             //1-Chargement du Driver
             Class.forName("com.mysql.cj.jdbc.Driver");
             //2-Se Connecter a une BD
             Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/examenjava"
                       , "root", "");
               //3-Execution et Recuperation
               Statement statement = conn.createStatement();
              String sql=String.format("INSERT INTO `module` ( `nom_professeur, prenom_professeur`)"+ 
                      " VALUES ('%s'),('%s')"
                      ,professeur.getNomProfesseur(),professeur.getPrenomProfesseur());
               
                int nbreLigne=statement.executeUpdate(sql);
                conn.close();
           } catch (ClassNotFoundException e) {
               System.out.println("Erreur de chargement de Driver");
           }
          catch (SQLException e) {
             System.out.println("Erreur de Connexion a la BD");
         }
}
}
