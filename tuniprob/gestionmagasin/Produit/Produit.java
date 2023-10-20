package tn.tuniprob.gestionmagasin.produit;

import java.util.Date;
public class Produit {
    private int identifiant;
    private String libelle , marque;
    private double prix;
    Date date;
    public Produit()

    {
        this.identifiant=identifiant;
        this.libelle=libelle;
        this.marque=marque;
        setPrix(prix);;
    }

    public Produit(int l_iIdentifiant,String l_cLibelle,String l_cMarque)
    {
        this.identifiant=l_iIdentifiant;
        this.libelle=l_cLibelle;
        this.marque=l_cMarque;
    }

    public Produit(int l_iIdentifiant,String l_cLibelle,String l_cMarque,double l_fPrix)
    {
        this.identifiant=l_iIdentifiant;
        this.libelle=l_cLibelle;
        this.marque=l_cMarque;
        setPrix(l_fPrix);
        this.date=new Date();
    }

    public Produit(int l_iIdentifiant,String l_cLibelle,String l_cMarque,double l_fPrix,Date l_dDate)
    {
        this.identifiant=l_iIdentifiant;
        this.libelle=l_cLibelle;
        this.marque=l_cMarque;
        setPrix(l_fPrix);
        this.date=new Date();
    }

    public void setPrix(double prix) {
        if (prix >= 0) {
            this.prix = prix;
        } else {
            System.out.println("Le prix ne peut pas être négatif.");
        }
    }
    public String getNom()
    {
        return libelle;
    }

    public double getPrix()
    {
        return prix;
    }

    public void Afficher()
    {
        System.out.println("identifiant:"+identifiant+ " libelle:"+libelle+" marque:"+marque+" prix:"+prix+" Date:"+date);

    }

    public void AjoutPrix(double Prix)
    {
        this.prix=Prix;
    }

    //surcharger la méthode toString()
    public String toString()
    {
        return identifiant+" "+libelle+" "+marque+" "+prix+" "+date;
    }

    public  boolean comparer (Produit P)
    {
        if (this.identifiant == P.identifiant && this.libelle == P.libelle && this.prix==P.prix)
            return true;
        return false;
    }

    //Fonction membre de la classe "Static"
    public static boolean comparer (Produit P1 , Produit P2)
    {
        if (P1.identifiant == P2.identifiant && P1.libelle == P2.libelle && P1.prix==P2.prix)
            return true;
        return false;
    }
}