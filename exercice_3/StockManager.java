public class StockManager {
/**
 * 
 * @param typeOperation
 * @param produit
 * @param quantite
 * @param stock
 */
    public void gererStock(String typeOperation, String produit, int quantite, int stock) {
       switch (typeOperation) {
        case "ajout":
        stock += quantite;
        System.out.println("Produit : " + produit + ", Stock après ajout : " + stock);
            break;
       case "retrait":
       if (stock >= quantite) {
        stock -= quantite;
        System.out.println("Produit : " + produit + ", Stock après retrait : " + stock);
    } else {
        System.out.println("Stock insuffisant pour le produit : " + produit);
    }
        default:
        System.out.println("Opération inconnue.");
            break;
       }
    }
}