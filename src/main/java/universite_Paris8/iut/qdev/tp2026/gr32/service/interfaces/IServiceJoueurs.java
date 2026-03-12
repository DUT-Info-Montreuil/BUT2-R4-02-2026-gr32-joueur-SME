package universite_Paris8.iut.qdev.tp2026.gr32.service.interfaces;

import universite_Paris8.iut.qdev.tp2026.gr32.commons.dtos.JoueurDTO;
import universite_Paris8.iut.qdev.tp2026.gr32.commons.dtos.LangueDTO;

import java.util.ArrayList;

public interface IServiceJoueurs {
    public JoueurDTO ajouterUtilisateur(String prenom, String pseudo, String anneeDeNaissance, ArrayList<String> centreDinteret, LangueDTO langueDTO);
    public ArrayList<JoueurDTO> liste_joueurs();
}
