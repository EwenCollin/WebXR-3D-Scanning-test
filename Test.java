public class Test {
    
    public static void main(String[] args) {
        System.out.println("Hello!");
        Promotion myPromotion = new Promotion();
        myPromotion.add("Jean", "Dupont");
        myPromotion.add("Jean", "Dupont");
        myPromotion.add("Alex", "Andre");
        myPromotion.add("Prénom", "Nom de famille");

        myPromotion.quickSort();
        myPromotion.printToConsole();
    }
}
