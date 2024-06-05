package entities;

import java.time.LocalDate;
import java.time.LocalTime;

public class Cours {
   
    private int idCours;
    private LocalDate dateCours;
    private LocalTime heureCours;

    //ManyToOne
    private Module module;
    public Cours() {
        //TODO Auto-generated constructor stub
    }
    public Cours(LocalDate date, LocalTime heure) {
        //TODO Auto-generated constructor stub
    }
    public Module getModule() {
        return module;
    }
    public void setModule(Module module) {
        this.module = module;
    }
    public int getIdCours() {
        return idCours;
    }
    public void setIdCours(int idCours) {
        this.idCours = idCours;
    }
    public LocalDate getDateCours() {
        return dateCours;
    }
    public void setDateCours(LocalDate dateCours) {
        this.dateCours = dateCours;
    }
    public LocalTime getHeureCours() {
        return heureCours;
    }
    public void setHeureCours(LocalTime heureCours) {
        this.heureCours = heureCours;
    }
}
