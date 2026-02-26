package universite_Paris8.iut.qdev.tp2026.gr32.commons.dtos;

import java.util.ArrayList;

public class JoueurDTO {
    private String prenom;
    private String pseudo;
    private int annéeDeNaissance;
    private ArrayList<String> centreDinteret;
    private LangueDTO langueDTO;

    public JoueurDTO(String prenom, String pseudo, int anneeDeNaissance, ArrayList<String> centreDinteret, LangueDTO langueDTO) {
        this.prenom = prenom;
        this.pseudo = pseudo;
        this.annéeDeNaissance = anneeDeNaissance;
        this.centreDinteret = centreDinteret;
        this.langueDTO = langueDTO;
    }

    public String getPrenom() {return this.prenom;}
    public String getPseudo() {return this.pseudo;}
    public int getAnnéeDeNaissance() {return this.annéeDeNaissance;}
    public ArrayList<String> getCentreDinteret() {return this.centreDinteret;}
    public LangueDTO getLangueDTO() {return this.langueDTO;}

    public void setPrenom(String prenom) {this.prenom = prenom;}
    public void setPseudo(String pseudo) {this.pseudo = pseudo;}
    public void setAnnéeDeNaissance(int annéeDeNaissance) {this.annéeDeNaissance = annéeDeNaissance;}
    public void setCentreDinteret(ArrayList<String> centreDinteret) {this.centreDinteret = centreDinteret;}
    public void setLangueDTO(LangueDTO langueDTO) {this.langueDTO = langueDTO;}
}
