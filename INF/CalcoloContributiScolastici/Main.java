public class Main {
    public static void main(String[] args) {
        Elementari elementari = new Elementari("ABEO029320KE2", "Guglielmo Marconi", "via papaV", "Sissa", 300, 1, 2, 20);
        Medie medie = new Medie("VADOJNVENINE", "Giacomo Leopardi", "Nerissima serpe", "Trecasali", 400, 1, 2, 25);
        Liceo liceo = new Liceo("BWNWBNOBRNOW", "Bertolucci", "Via toscana", "Parma", 900, 4, 5, 45);
        Tecnico tecnico = new Tecnico("TGBGRWBGRJ", "Leonardo da Vinci", "Via toscana", "Parma", 3000, 2, 40, 65);
        Professionale professionale = new Professionale("AYYNHRTHGB", "Primo levi", "via <<>>", "Parma", 700, 1, 50, 60);

        elementari.calcolaContributi();
        medie.calcolaContributi();
        liceo.calcolaContributi();
        tecnico.calcolaContributi();
        professionale.calcolaContributi();

        System.out.println("\n" + elementari + "\n" + medie + "\n" + liceo  + "\n" + tecnico  + "\n" + professionale);
        tecnico.aggiunginClassi(5);
        tecnico.aggiunginLaboratori(5);
        tecnico.aggiunginSedi(1);
        tecnico.aggiunginStudenti(5);
    
        System.out.println("\n"+tecnico);
    }
}