public class Plat {

    private String nom;
    private float prix;


    public Plat(String nom, float prix, String special) {
        this.nom = nom;
        this.prix = prix;

    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public void AfficherInfos(){
        System.out.println("Plat: "+nom+" || Prix= "+prix);
    }

    @Override
    public String toString() {
        return "Plat{" +
                "nom='" + nom + '\'' +
                ", prix=" + prix +
                ", special='" + special + '\'' +
                '}';
    }
}
