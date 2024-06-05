package entities;
import java.util.ArrayList;
import java.util.List;

public class Module {
    private int idModule;
    private String nomModule;

    //OneToMany
List<Professeur> professeurs = new ArrayList<Professeur>();
    public List<Professeur> getProfesseurs() {
        return professeurs;
    }
    public void setProfesseurs(List<Professeur> professeurs) {
        this.professeurs = professeurs;
    }
 //OneToMany
    List<Cours> cours = new ArrayList<Cours>();
    public List<Cours> getCours() {
        return cours;
    }
    public void setCours(List<Cours> cours) {
        this.cours = cours;
    }
    public int getIdModule() {
        return idModule;
    }
    public void setIdModule(int idModule) {
        this.idModule = idModule;
    }
    public String getNomModule() {
        return nomModule;
    }
    public void setNomModule(String nomModule) {
        this.nomModule = nomModule;
    }
}