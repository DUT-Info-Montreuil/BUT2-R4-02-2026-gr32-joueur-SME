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


}
