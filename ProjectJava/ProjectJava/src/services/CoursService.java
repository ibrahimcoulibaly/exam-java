package services;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import entities.Cours;
import repositories.CoursRepository;

public class CoursService {
       private CoursRepository coursRepository=new CoursRepository();


    public void ajouterUnCours(Cours cours) {
        coursRepository.insert(cours);
    }
     public List<Cours> listerCours(){
      return coursRepository.selectAll();
   }
    public void ajouterUnCours(LocalDate date, LocalTime heure) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ajouterUnCours'");
    }
}
