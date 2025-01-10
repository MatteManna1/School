public class Main {
    public static void main(String[] args) {
        Auto miaAuto = new Auto("Fiat", "500");
        
        System.out.println(miaAuto);
        miaAuto.emettiRumore(); // Chiamata al metodo di Rumoroso
        miaAuto.accendiMotore(); // Chiamata al metodo di Motorizzato
    }
}