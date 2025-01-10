public class Main {
    public static void main(String[] args) {
        Tapparella tapparella= new Tapparella(150, 200);
        TapparellaElettrica tapparella2 = new TapparellaElettrica(250, 400, false);

        //test Tapparella:
        System.out.println(tapparella.tapparellaUp(150));
        System.out.println(tapparella.tapparellaDown(100));
        System.out.println(tapparella.tapparellaDown(50));
        System.out.println(tapparella.tapparellaDown(1));

        //test TapparellaElettrica
        System.out.println(tapparella2.tapparellaUpOrDown(true));
        System.out.println(tapparella2.tapparellaUpOrDown(false));
        System.out.println(tapparella2.tapparellaUp(100));
        System.out.println(tapparella2.tapparellaDown(50));
    }
}
