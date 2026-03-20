package universite_Paris8.iut.qdev.tp2026.gr32.commons.dtos;

import java.util.ArrayList;

public class JoueurDTO {
    private String prenom;
    private String pseudo;
    private int annéeDeNaissance;
    private ArrayList<String> centreDinteret;
    private LangueEnum langueEnum;

    public JoueurDTO(String prenom, String pseudo, int anneeDeNaissance, ArrayList<String> centreDinteret, LangueEnum langueEnum) {
        this.prenom = prenom;
        this.pseudo = pseudo;
        this.annéeDeNaissance = anneeDeNaissance;
        this.centreDinteret = centreDinteret;
        this.langueEnum = langueEnum;
    }

    public String getPrenom() {return this.prenom;}
    public String getPseudo() {return this.pseudo;}
    public int getAnnéeDeNaissance() {return this.annéeDeNaissance;}
    public ArrayList<String> getCentreDinteret() {return this.centreDinteret;}
    public LangueEnum getLangueDTO() {return this.langueEnum;}

    public void setPrenom(String prenom) {this.prenom = prenom;}
    public void setPseudo(String pseudo) {this.pseudo = pseudo;}
    public void setAnnéeDeNaissance(int annéeDeNaissance) {this.annéeDeNaissance = annéeDeNaissance;}
    public void setCentreDinteret(ArrayList<String> centreDinteret) {this.centreDinteret = centreDinteret;}
    public void setLangueDTO(LangueEnum langueEnum) {this.langueEnum = langueEnum;}
}
