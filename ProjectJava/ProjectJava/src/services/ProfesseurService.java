package services;

import java.util.List;

import entities.Professeur;
import repositories.ProfesseurRepository;

public class ProfesseurService {
        private ProfesseurRepository professeurRepository=new ProfesseurRepository();


    public void ajouterUnProfesseur(Professeur professeur) {
        professeurRepository.insert(professeur);
    }
     public List<Professeur> listerProfesseur(){
      return professeurRepository.selectAll();
   }
}
