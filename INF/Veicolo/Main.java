public class Main {
    public static void main(String[] args) {
        Auto auto = new Auto(2024, "panda", 140, 5);
        Moto moto = new Moto(2021, "fantic", 121, false);

        System.out.println(auto.toString());
        System.out.println(moto.toString());
    }
}