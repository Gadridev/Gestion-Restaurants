import java.util.ArrayList;
import java.util.List;

public class Commande {
    private  int idCommande;
    private Client client;
    private Serveur serveur;
    private List<PlatCommande> platCommandes;

    public Commande( Client client,Serveur serveur) {
        this.serveur=serveur;
        this.client = client;
        this.platCommandes=new ArrayList<>();
    }
    public void  ajouterPla(Plat p){
        PlatCommande pc = new PlatCommande(p, this);
        platCommandes.add(pc);
    }

    public Serveur getServers() {
        return serveur;
    }

    public void setServers(Serveur serveur) {
        this.serveur = serveur;
    }
    public double calculerTotal(){
        double total=0;
        for (PlatCommande pc:platCommandes){
            total +=pc.getPlat().getPrix();
        }
        return total;
    }
    public void afficherDetails(){
        if (serveur != null) {
            System.out.println("Serveur : " + serveur.getNom());
        } else {
            System.out.println("Serveur : Aucun");
        }
        for (PlatCommande pc:platCommandes){
            System.out.println("plats "+ pc.getPlat().getNom() +"le prix est :"+ pc.getPlat().getPrix());
        }
        System.out.println("le total est :" +calculerTotal());
    }
    public int getIdCommande() {
        return idCommande;
    }
    public void setIdCommande(int idCommande) {
        this.idCommande = idCommande;
    }
    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }
    @Override
    public String toString() {
        return "Commande{" +
                "idCommande=" + idCommande +
                ", client=" + client +
                '}';
    }
}