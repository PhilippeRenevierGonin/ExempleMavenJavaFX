package controleur;

import modele.ModeleImages;

public class ControleurSuivantPrécédent
{
    public static final String SUIV = "suivante";
    public static final String PREC = "précédente";
    private final ModeleImages modele;

    public ControleurSuivantPrécédent(ModeleImages m) {
        this.modele = m;
    }

    public void prevenirLeControleur(String action) {
                if (action.equals(SUIV)) {
                    modele.imageSuivante();
                }
                else  if (action.equals(PREC)) {
                    modele.imagePrécédente();
                }
    }
}
