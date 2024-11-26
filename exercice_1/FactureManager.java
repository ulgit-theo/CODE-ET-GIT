public class FactureManager {

    /**
     * Retourne le pourcentage de réduction selon la catégorie de produit.
     *
     * @param typeProduit Le type de produit (Alimentaire, Electronique, Luxe)
     * @return Le pourcentage de réduction
     */
    private double getReductionCategorie(String typeProduit) {
        switch (typeProduit) {
            case "Alimentaire":
                return 0.05; // Réduction de 5%
            case "Electronique":
                return 0.1; // Réduction de 10%
            case "Luxe":
                return 0.15; // Réduction de 15%
            default:
                return 0.0; // Pas de réduction pour les autres types de produits
        }
    }
     /**
     * Calcule le total d'une facture en appliquant les réductions selon le type de produit et le montant total.
     *
     * @param typeProduit Le type de produit (Alimentaire, Electronique, Luxe)
     * @param quantite La quantité de produits
     * @param prixUnitaire Le prix unitaire du produit
     * @return Le total de la facture après application des réductions
     */
    public double calculerFacture(String typeProduit, int quantite, double prixUnitaire) {
        double total = quantite * prixUnitaire;

        // Appliquer la réduction selon la catégorie de produit
        total -= total * getReductionCategorie(typeProduit);

        // Appliquer une réduction supplémentaire pour les gros montants
        if (total > 1000) {
            total -= total * 0.05; // Réduction supplémentaire de 5%
        }

        return total;
    }
}
