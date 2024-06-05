package entities;


public class Professeur {
    private int idProfesseur;
    private String nomProfesseur;
    private String prenomProfesseur;

    //ManyToOne
    private Module module;
    public int getIdProfesseur() {
        return idProfesseur;
    }
    public void setIdProfesseur(int idProfesseur) {
        this.idProfesseur = idProfesseur;
    }
    public String getNomProfesseur() {
        return nomProfesseur;
    }
    public void setNomProfesseur(String nomProfesseur) {
        this.nomProfesseur = nomProfesseur;
    }
    public String getPrenomProfesseur() {
        return prenomProfesseur;
    }
    public void setPrenomProfesseur(String prenomProfesseur) {
        this.prenomProfesseur = prenomProfesseur;
    }
    public Module getModule() {
        return module;
    }
    public void setModule(Module module) {
        this.module = module;
    }
}
