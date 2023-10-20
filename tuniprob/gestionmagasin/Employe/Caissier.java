package tn.tuniprob.gestionmagasin.employe;

public class Caissier extends Employe
{
    int numeroDeCaisse;

    public Caissier(int identifiant, int Nbr_Heures, String nom, String adresse, int NumCaise )
    {
        super(identifiant, Nbr_Heures, nom, adresse);
        this.numeroDeCaisse=NumCaise;
    }

    public float Calculsalaire()
    {
        if (Nbr_heures<180)
            return (Nbr_heures*5);
        else
            return ((Nbr_heures-180)*15)+(180*5);
    }

    public int getNumCaisse() {
        return numeroDeCaisse;
    }
    public String toString()
    {

        return "Caissier :"+super.toString()
                +"num Caisse :"+numeroDeCaisse;
    }
}
