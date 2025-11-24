import java.util.ArrayList;
import java.util.List;

public class Client {
    private String nom;


    List<Commande>commandes;

    public Client(String nom) {
        this.nom = nom;
        this.commandes = new ArrayList<>();
    }

    public List<Commande> getCommandes() {
        return commandes;
    }

    public void setCommandes(List<Commande> commandes) {
        this.commandes = commandes;
    }

    public String getNom() {
        return nom;
    }
    public void afficher() {
        System.out.println("Client : " + nom);
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public void ajouterCommend(Commande c){
        
            commandes.add(c);

        

    }
}
