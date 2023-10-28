package tn.tuniprob.gestionmagasin.gestville;

public class villa {
    private int id ;
    private String nom;

    public villa(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "villa{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                '}';
    }
}
