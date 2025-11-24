public class PlatCommande {
    private Plat plat;
    private Commande commande;

    public PlatCommande(Plat plat, Commande commande) {
        this.plat = plat;
        this.commande = commande;
    }

    public Plat getPlat() {
        return plat;
    }

    public Commande getCommande() {
        return commande;
    }

}