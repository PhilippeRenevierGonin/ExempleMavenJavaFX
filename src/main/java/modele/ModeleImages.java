package modele;

import ihm.Vue;
import javafx.scene.image.Image;

import java.util.ArrayList;

public class ModeleImages {


    // les données sont stockées ici sous forme d'image javaFX pour des raisons de simplicité.
    // elles auraient pu être stockées sous forme de tableau RGB par exemple...
    private ArrayList<Image> banqueDImages = new ArrayList<>();
    private int imageActuelle = 0;

    private ArrayList<Vue> listeVues = new ArrayList<>();

    public void addVue(Vue v) {
        listeVues.add(v);
        prevenirLesVues();
    }


    public ModeleImages() {
        for(int i = 8; i > 0 ; i--) {
            banqueDImages.add(new Image("/images/trbfly"+i+".gif"));
        }
    }


    private void prevenirLesVues() {
        if ((imageActuelle >= 0) && (imageActuelle < banqueDImages.size()))
            for(int i = 0; i < listeVues.size(); i++) {
                 listeVues.get(i).miseAJour(banqueDImages.get(imageActuelle));
            }
    }


    public void imageSuivante() {
        int taille = banqueDImages.size();
        imageActuelle = (imageActuelle + 1 ) % taille ;
        prevenirLesVues();
    }

    public void imagePrécédente() {
        int taille = banqueDImages.size();
        imageActuelle = (imageActuelle - 1 + taille) % taille ; // pour ne pas avoir de nombre négatif
        prevenirLesVues();
    }
}
