package tn.tuniprob.gestionmagasin.employe;
public class Vendeur extends Employe
{

    float tauxDeVente;

    public Vendeur(int identifiant, int Nbr_Heures, String nom, String adresse , float taux)
    {
        super(identifiant, Nbr_Heures, nom, adresse);
        this.tauxDeVente=taux;
    }
    public float Calculsalaire()
    {
        return tauxDeVente*450;
    }

    public float getTauxDeVente() {
        return tauxDeVente;
    }

    public void setTauxDeVente(float tauxDeVente) {
        this.tauxDeVente = tauxDeVente;
    }

}