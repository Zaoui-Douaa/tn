package tn.tuniprob.gestionmagasin.magasin;

import tn.tuniprob.gestionmagasin.employe.Employe;
import tn.tuniprob.gestionmagasin.employe.Caissier;
import tn.tuniprob.gestionmagasin.employe.Responsable;
import tn.tuniprob.gestionmagasin.employe.Vendeur;
import tn.tuniprob.gestionmagasin.produit.Produit;
import java.util.ArrayList;
import java.util.List;
public class Magasin extends Produit {
        private int Identifiant , Capacite ,nombreDeProduits , comppempl, totalEmployee;
        private String Adresse , Nom;
        private List<Produit>  produits;
        private List<Employe>  Employes;
        private final int CAPACITE_EMP=20;

        public Magasin(String nom, int identifiant, int Capacite, String Adresse) {
                this.Nom=nom;
                this.Identifiant = identifiant;
                this.Capacite = 50;
                this.Adresse = Adresse;
                this.produits = new ArrayList<>();// Initialisation du tableau avec la capacité maximale
                this.Employes = new ArrayList<>();
                this.nombreDeProduits = 0; // Aucun produit au départ
        }

        public String getNom() {
                return Nom;
        }
        public boolean AjouterProduit(Produit produit) {
                if (nombreDeProduits < Capacite && !ChercherProduit(produit))
                {
                        nombreDeProduits++;
                        produits.add(produit);
                        return true;
                }
                return false; // Capacité maximale atteinte et Produit est deja ajouter
        }

        public boolean AjouterEmploye(Employe E) {
                        if (comppempl < CAPACITE_EMP && !ChercherEmployee(E))
                        {
                                comppempl++;
                                Employes.add(E);
                                return true;
                        }
                        return false;
        }

        public void afficherCaracteristiquesMagasin() {
                System.out.println("Informations du magasin :"+this.getNom());
                System.out.println("Identifiant : " + Identifiant);
                System.out.println("Adresse : " + Adresse);
                System.out.println("Capacité : " + Capacite);
        }

        public void afficherProduits()
        {
                System.out.println("Produits dans le magasin :");
                for (Produit produit : produits)
                {
                        System.out.println("Nom : " + produit.getNom());
                        System.out.println("Prix : " + produit.getPrix() + "€");
                }
        }

        public void afficherEmploye()
        {
                System.out.println("Employe dans le magasin :");
                for (Employe Emp : Employes)
                {
                        System.out.println("Nom : " + Emp.getNom() + "Identifiant :"+ Emp.getIdentifiant()
                        + " Adresse :"+Emp.getAdresse() + "avec Nombre heures=" + Emp.getNbrHeures());
                }
        }

        public List<Produit> getProduits()
        {
                return produits;
        }

        public List<Employe> getEmployes()
        {
                return Employes;
        }

        public int getNombreDeProduits()
        {
                return produits.size();
        }

        public int getNombreDeEmployes()
        {
                return Employes.size();
        }

        public String toString()
        {
                return "Magasin " + Identifiant + " - Adresse : " + Adresse + " - Capacité : " + Capacite ;
        }

        public static int calculerNombreTotalDeProduits(List<Magasin> magasins)
        {
                int nombreTotal = 0;
                for (Magasin magasin : magasins)
                {
                        nombreTotal += magasin.getNombreDeProduits();
                }
                return nombreTotal;
        }

        public static int calculerNombreTotalDeEmployes(List<Magasin> magasins)
        {
                int nombreTotal = 0;
                for (Magasin magasin : magasins)
                {
                        nombreTotal += magasin.getNombreDeEmployes();
                }
                return nombreTotal;
        }

        public boolean ChercherProduit (Produit P)
        {
                for(Produit produit : produits)
                {
                        if (produit.getNom() == P.getNom())
                                 return true;
                }
                return false;
        }

        public boolean ChercherEmployee(Employe E) {
                for(Employe Emp : Employes)
                {
                        if(Emp.getIdentifiant() == E.getIdentifiant())
                                return true;
                }
                return false; // L'employé n'a pas été trouvé, retourne -1
        }
        public void SuppProduit(Produit produit)
        {
                if (ChercherProduit(produit))
                {
                        produits.remove(produit);
                }
        }

        public void SuppEmploye(Employe Empl)
        {
                if (ChercherEmployee(Empl))
                {
                        Employes.remove(Empl);
                }
        }
        public Magasin SupCapacite(Magasin M1 , Magasin M2)
        {
                if (M1.Capacite > M2.Capacite)
                        return M1;
                else
                        return M2;
        }

        public void afficheSalaire()
        {
                for(Employe emp:Employes)
                {
                        System.out.println(emp.Calculsalaire());
                }
        }
        public void affichePrimeResponsable()
        {

                for(Employe emp:Employes)
                {
                        if(emp instanceof  Responsable)
                        {
                                Responsable res = (Responsable) emp;
                                System.out.println(res.getPrime());

                                System.out.println(((Responsable)emp).getPrime());
                        }
                        else
                        {
                                System.out.println("ce n'est pas un responsable");
                        }
                }
        }
        public void afficherParType()
        {
                int nbC=0,nbV=0,nbR=0;

                for(Employe emp:Employes)
                {
                        if(emp instanceof Caissier)
                                nbC++;
                        if(emp instanceof Responsable)
                                nbR++;
                        if(emp instanceof Vendeur)
                                nbV++;

                }
                System.out.println("Le nombre de responsable ="+nbR);
                System.out.println("Le nombre de Vendeur ="+nbV);
                System.out.println("Le nombre de Caissier ="+nbC);
        }
}