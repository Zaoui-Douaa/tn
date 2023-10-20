package tn.tuniprob.gestionmagasin.employe;

public abstract class Employe {

    protected int Identifiant , Nbr_heures;
    protected String Nom , Adresse;

    public Employe(int identifiant , int Nbr_Heures , String nom , String adresse  )
    {
        this.Identifiant=identifiant;
        this.Nbr_heures=Nbr_Heures;
        this.Nom=nom;
        this.Adresse=adresse;
    }
    public String getNom()
    {
        return Nom;
    }
    public String getAdresse()
    {
        return Adresse;
    }
    public int getNbrHeures()
    {
        return Nbr_heures;
    }
    public int getIdentifiant()
    {
        return Identifiant;
    }
    public String toString() {
        return "id :" + Identifiant + "nom :"
                + Nom + "adresse :" + Adresse + "nbh :" + Nbr_heures;
    }
    public boolean comparer(Employe E)
    {
        if(this.Identifiant==E.Identifiant)
            return true;
        return false;
    }

    public void afficherPrime()
    {
        System.out.println("Aucun prime our ce employe");
    }

    public abstract float Calculsalaire();


    public boolean equals (Object O) {
        if (this == O)
            return true;
        if (O == null || getClass() != O.getClass())
            return false;
        Employe autreEmployee= (Employe) O;
        return Nom.equals(autreEmployee.Nom) && Identifiant==autreEmployee.Identifiant;
    }
}
