import java.lang.String;

import tn.tuniprob.gestionmagasin.employe.Caissier;
import tn.tuniprob.gestionmagasin.employe.Responsable;
import tn.tuniprob.gestionmagasin.employe.Vendeur;
import tn.tuniprob.gestionmagasin.produit.Produit;
import tn.tuniprob.gestionmagasin.magasin.Magasin;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Magasin> magasins = new ArrayList<>();

        Produit NewProduit0=new Produit(1021,"lait","Delice");
        Produit NewProduit1=new Produit(2510,"Yaourt","Vitalait");
        Produit NewProduit2=new Produit(3250,"Tomate","Sicam",1.200);

        Magasin magasin1 = new Magasin("Carrefour",1, 50, "Centre-Ville");
        Magasin magasin2 = new Magasin("Monoprix",2, 30, "Menzah 6");

        Caissier Caissier1 = new Caissier(1,15,"C1","tunis",15);
        Caissier Caissier2 = new Caissier(2,10,"C2","tunistunis",10);
        Vendeur vendeur1 = new Vendeur(3,5,"V1","LAC",10);
        Responsable responsable1= new Responsable(4,20,"R1","MENZAH",500);

        if(!magasin1.ChercherEmployee(Caissier1))
            magasin1.AjouterEmploye(Caissier1);

        if(!magasin1.ChercherEmployee(Caissier2))
            magasin1.AjouterEmploye(Caissier2);

        if(!magasin1.ChercherEmployee(vendeur1))
            magasin1.AjouterEmploye(vendeur1);

        if(!magasin1.ChercherEmployee(responsable1))
            magasin1.AjouterEmploye(responsable1);

        Caissier Caissier3 = new Caissier(5,15,"C3","tunis",15);
        Vendeur vendeur2 = new Vendeur(6,5,"V2","LAC",10);
        Vendeur vendeur3 = new Vendeur(7,5,"V3","LAC",10);
        Responsable responsable2= new Responsable(8,20,"R2","MENZAH",100);

        if(!magasin2.ChercherEmployee(Caissier3))
            magasin2.AjouterEmploye(Caissier3);

        if(!magasin2.ChercherEmployee(vendeur2))
            magasin2.AjouterEmploye(vendeur2);

        if(!magasin2.ChercherEmployee(vendeur3))
            magasin2.AjouterEmploye(vendeur3);

        if(!magasin2.ChercherEmployee(responsable2))
            magasin2.AjouterEmploye(responsable2);

        NewProduit0.AjoutPrix(0.700);

        NewProduit1.AjoutPrix(1000);

        // Afficher les caractéristiques du magasin
        magasin1.afficherCaracteristiquesMagasin();
        // Afficher les produits dans le magasin
        magasin1.afficherProduits();
        magasin1.afficherEmploye();
        // Afficher les caractéristiques du magasin
        magasin2.afficherCaracteristiquesMagasin();
        // Afficher les produits dans le magasin
        magasin2.afficherProduits();
        magasin2.afficherEmploye();

        magasins.add(magasin1);
        magasins.add(magasin2);

        int nombreTotalDeProduits = Magasin.calculerNombreTotalDeProduits(magasins);

        System.out.println("Nombre total de produits dans tous les magasins : " + nombreTotalDeProduits);

        System.out.println("Comparer de "+NewProduit0.getNom()+ " et "+NewProduit1.getNom() +" est : "+NewProduit0.comparer(NewProduit1));
        System.out.println("Comparer de "+NewProduit1.getNom()+ " et "+NewProduit2.getNom() +" est : "+NewProduit0.comparer(NewProduit1,NewProduit2) );
        System.out.println("Comparer de "+NewProduit1.getNom()+ " et "+NewProduit1.getNom() +" est : "+NewProduit0.comparer(NewProduit1,NewProduit1) );
        
        System.out.println("la recherche de  Produit : "+NewProduit0.getNom()+" dans la premier magasin est avec le result "+ magasin1.ChercherProduit(NewProduit0));
        System.out.println("la recherche de  Produit : "+NewProduit2.getNom()+" dans la premier magasin est avec le result "+ magasin1.ChercherProduit(NewProduit2));

        System.out.println("le result d'ajout de Produit : "+NewProduit0.getNom()+" est "+ magasin1.AjouterProduit(NewProduit0));
        System.out.println("le result d'ajout de Produit : "+NewProduit2.getNom()+" est "+ magasin1.AjouterProduit(NewProduit2));
        System.out.println("la recherche de  Produit : "+NewProduit2.getNom()+" dans la premier magasin est avec le result "+ magasin1.ChercherProduit(NewProduit2));
        magasin1.afficherProduits();
        magasin1.SuppProduit(NewProduit2);
        System.out.println("la recherche de  Produit : "+NewProduit2.getNom()+" dans la premier magasin est avec le result "+ magasin1.ChercherProduit(NewProduit2));

        System.out.println("la superieur Capacite est   "+ magasin1.SupCapacite(magasin1,magasin2) );

        System.out.println("Pour  "+ magasin1.getNom() );
        System.out.println("salaire de  "+ Caissier1.getNom() + " est = "+Caissier1.Calculsalaire());
        System.out.println("salaire de  "+ Caissier2.getNom() + " est = "+Caissier2.Calculsalaire());
        System.out.println("salaire de  "+ vendeur1.getNom() + " est = "+vendeur1.Calculsalaire());
        System.out.println("salaire de  "+ responsable1.getNom() + " est = "+responsable1.Calculsalaire());

        System.out.println("Pour  "+ magasin2.getNom() );
        System.out.println("salaire de  "+ Caissier3.getNom() + " est = "+Caissier3.Calculsalaire());
        System.out.println("salaire de  "+ vendeur2.getNom() + " est = "+vendeur2.Calculsalaire());
        System.out.println("salaire de  "+ vendeur3.getNom() + " est = "+vendeur3.Calculsalaire());
        System.out.println("salaire de  "+ responsable2.getNom() + " est = "+responsable2.Calculsalaire());

        System.out.println("Pour "+ magasin1.getNom());
        magasin1.afficheSalaire();
        System.out.println("Pour "+ magasin2.getNom());
        magasin2.afficheSalaire();
        System.out.println("Pour les responsables de "+ magasin1.getNom());
        magasin1.affichePrimeResponsable();
        System.out.println("Pour les responsables de "+ magasin2.getNom());
        magasin2.affichePrimeResponsable();
        System.out.println("Pour "+ magasin1.getNom());
        magasin1.afficherParType();
        System.out.println("Pour "+ magasin2.getNom());
        magasin2.afficherParType();
    String str="abc";
    System.out.println(str.equals(responsable1));
        System.out.println("Les Employees " + Caissier1.getNom() + " et " + Caissier2.getNom() +" sont-ils éqaux? "+ Caissier1.equals(Caissier2));
    }
}