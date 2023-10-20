package tn.tuniprob.gestionmagasin.employe;

public class Responsable extends Employe
{
    int Prime;

    public Responsable(int identifiant, int Nbr_Heures, String nom, String adresse , int prime) {
        super(identifiant, Nbr_Heures, nom, adresse);
        this.Prime=prime;
    }

    public float Calculsalaire()
    {
        if (Nbr_heures<160)
            return (Nbr_heures*10)+Prime;
        else
            return ((Nbr_heures-160)*20)+Prime+1600;
    }

    public int getPrime() {
        return Prime;
    }

    public void setPrime(int prime) {
        this.Prime = prime;
    }

    @Override
    public String toString() {
        return "Responsable :"+super.toString()+"Prime :"+Prime;
    }
}