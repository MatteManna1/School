public class Main {
    public static void main(String[] args) throws Exception {
        Autonoleggio autonoleggio = new Autonoleggio();
            autonoleggio.addVeicolo(new Auto("AAA", 32, "Fiat", "Panda", 1500, 2006, 50, 7));
            autonoleggio.addVeicolo(new Furgone("BBB", 66, "Renault", "boh", 4000, 2001, 200, 3));

        try {
            System.out.println("\nGetVeicoloByTarga: "+autonoleggio.getVeicoloByTarga("AAA") + "\n");
        } catch (Exception e) {
            throw new Exception("Exception found:");
        }
        try {
            System.out.println("CostoAutovetture: "+autonoleggio.costoAutovetture(100, 20)+ "\n");
        } catch (Exception e) {
            throw new Exception("Exception found:");
        }
        try { 
            System.out.println("CostoFurgone: "+autonoleggio.costoFurgone(1000, 20)+ "\n");
        } catch (Exception e) {
            throw new Exception("Exception found:");
        }
        try { 
            System.out.println("ToString: "+autonoleggio);
        } catch (Exception e) {
            throw new Exception("Exception found:");
        }



    }
    
}
