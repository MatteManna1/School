import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Squadra> array = new ArrayList<>();
        SquadreTotali squadre = new SquadreTotali(array);

        Squadra NewCastle = new Squadra("New Castle", 4, 0, 1);
        Squadra ManchesterUnited = new Squadra("Manchester United", 2, 0, 3);
        Squadra Fulham = new Squadra();
        Squadra Bournemouth = new Squadra("Bournemouth", 2, 3, 0);
        Squadra Everton = new Squadra("Everton", 1, 3, 1);
        Squadra Nottingham = new Squadra();

        Squadra ManchesterCity = new Squadra();
        Squadra Chelsea = new Squadra("Chelsea", 3, 1, 1);
        Squadra Wolves = new Squadra();
        Squadra Arsenal = new Squadra("Arsenal", 3, 2, 0);

        Squadra Tottenam = new Squadra("Tottenam", 2, 1, 2);
        Squadra Brendford = new Squadra();
        Squadra Astonvilla = new Squadra();

        Squadra SouthEmpton = new Squadra();
        Squadra Brighton = new Squadra("Brighton", 0, 3, 2);
        Squadra Liverpool = new Squadra("Liverpool", 4, 1, 0);

        Squadra CristalPalace = new Squadra("Cristal Palace", 2, 1, 2);
        Squadra WestHem = new Squadra();
        Squadra Ipswich = new Squadra();
        Squadra Leicester = new Squadra();

        // Aggiungi altre squadre
        squadre.addSquadra(NewCastle);
        squadre.addSquadra(ManchesterUnited);
        squadre.addSquadra(Bournemouth);
        squadre.addSquadra(Everton);
        squadre.addSquadra(Chelsea);
        squadre.addSquadra(Arsenal);
        squadre.addSquadra(Tottenam);
        squadre.addSquadra(Brighton);
        squadre.addSquadra(Liverpool);
        squadre.addSquadra(CristalPalace);

        // Creazione delle partite
        PartitePrecedenti TottenamWolves = new PartitePrecedenti("TottenamWolves", 2, 2, Tottenam, Wolves, false, 5, 5);
        PartitePrecedenti TottenhamNottingham = new PartitePrecedenti("TottenhamNottingham", 0, 1, Tottenam, Nottingham, false, 7, 2);
        PartitePrecedenti TottenhamLiverpool = new PartitePrecedenti("TottenhamLiverpool", 3, 6, Tottenam, Liverpool, false, 7, 5);
        PartitePrecedenti TottenhamManchesterUnited = new PartitePrecedenti("TottenhamManchesterUnited", 4, 3, Tottenam, ManchesterUnited, true, 2, 8);
        PartitePrecedenti TottenhamSouthEmpton = new PartitePrecedenti("TottenhamSouthEmpton", 5, 0, Tottenam, SouthEmpton, true, 5, 2);

        PartitePrecedenti NewCastleAstonvilla = new PartitePrecedenti("NewCastleAstonvilla", 3, 0, NewCastle, Astonvilla, true, 9, 6);
        PartitePrecedenti NewCastleIpswich = new PartitePrecedenti("NewCastleIpswich", 4, 0, NewCastle, Ipswich, true, 5, 1);
        PartitePrecedenti NewCastleLeicester = new PartitePrecedenti("NewCastleLeicester", 4, 0, NewCastle, Leicester, true, 5, 2);
        PartitePrecedenti NewCastleBrendford = new PartitePrecedenti("NewCastleBrendford", 2, 4, NewCastle, Brendford, false, 4, 3);
        PartitePrecedenti NewCastleLiverpool = new PartitePrecedenti("NewCastleLiverpool", 3, 3, NewCastle, Liverpool, false, 5, 6);

        PartitePrecedenti ManchesterUnitedWolves = new PartitePrecedenti("ManchesterUnitedWolves", 0, 2, ManchesterUnited, Wolves, false, 4, 4);
        PartitePrecedenti ManchesterUnitedBornemouth = new PartitePrecedenti("ManchesterUnitedBornemouth", 2, 2, ManchesterUnited, Bournemouth, false, 5, 5);
        PartitePrecedenti ManchesterUnitedTottenham = new PartitePrecedenti("ManchesterUnitedTottenham", 0, 3, ManchesterUnited, Tottenam, false, 13, 1);
        PartitePrecedenti ManchesterUnitedManchesterCity = new PartitePrecedenti("ManchesterUnitedManchesterCity", 2, 1, ManchesterUnited, ManchesterCity, true, 2, 8);
        PartitePrecedenti ManchesterUnitedNottingham = new PartitePrecedenti("ManchesterUnitedNottingham", 2, 3, ManchesterUnited, Nottingham, false, 5, 3);

        PartitePrecedenti LiverpoolWestHem = new PartitePrecedenti("LiverpoolWestHem", 5, 0, Liverpool, WestHem, true, 6, 2);
        PartitePrecedenti LiverpoolLeicester = new PartitePrecedenti("LiverpoolLeicester", 3, 1, Liverpool, Leicester, true, 14, 1);
        PartitePrecedenti LiverpoolTottenham = new PartitePrecedenti("LiverpoolTottenham", 2, 2, Liverpool, Tottenam, false, 5, 5);
        PartitePrecedenti LiverpoolSouthEmpton = new PartitePrecedenti("LiverpoolSouthEmpton", 2, 1, Liverpool, SouthEmpton, true, 7, 3);
        PartitePrecedenti LiverpoolFulham = new PartitePrecedenti("LiverpoolFulham", 2, 2, Liverpool, Fulham, false, 5, 4);

        PartitePrecedenti CristalPalaceSouthEmpton = new PartitePrecedenti("CristalPalaceSouthEmpton", 2, 1, CristalPalace, SouthEmpton, true, 8, 7);
        PartitePrecedenti CristalPalaceBournemouth = new PartitePrecedenti("CristalPalaceBournemouth", 0, 0, CristalPalace, Bournemouth, false, 2, 5);
        PartitePrecedenti CristalPalaceArsenal = new PartitePrecedenti("CristalPalaceArsenal", 1, 5, CristalPalace, Arsenal, false, 3, 3);
        PartitePrecedenti CristalPalaceBrighton = new PartitePrecedenti("CristalPalaceBrighton", 3, 1, CristalPalace, Brighton, true, 5, 8);
        PartitePrecedenti CristalPalaceManchesterCity = new PartitePrecedenti("CristalPalaceManchesterCity", 2, 2, CristalPalace, ManchesterCity, false, 6, 8);

        PartitePrecedenti ChelseaFulham = new PartitePrecedenti("ChelseaFulham", 1, 2, Chelsea, Fulham, false, 3, 1);
        PartitePrecedenti ChelseaEverton = new PartitePrecedenti("ChelseaEverton", 0, 0, Chelsea, Everton, false, 5, 2);
        PartitePrecedenti ChelseaBrendford = new PartitePrecedenti("ChelseaBrendford", 2, 1, Chelsea, Brendford, true, 8, 5);
        PartitePrecedenti ChelseaTottenham = new PartitePrecedenti("ChelseaTottenham", 4, 3, Chelsea, Tottenam, true, 10, 5);
        PartitePrecedenti ChelseaSouthEmpton = new PartitePrecedenti("ChelseaSouthEmpton", 5, 1, Chelsea, SouthEmpton, true, 7, 5);

        PartitePrecedenti BrightonBrendford = new PartitePrecedenti("BrightonBrendford", 0, 0, Brighton, Brendford, false, 5, 3);
        PartitePrecedenti BrightonWestHem = new PartitePrecedenti("BrightonWestHem", 1, 1, Brighton, WestHem, false, 4, 8);
        PartitePrecedenti BrightonCristalPalace = new PartitePrecedenti("BrightonCristalPalace", 1, 3, Brighton, CristalPalace, false, 8, 5);
        PartitePrecedenti BrightonLeicester = new PartitePrecedenti("BrightonLeicester", 2, 2, Brighton, Leicester, false, 5, 4);
        PartitePrecedenti BrightonFulham = new PartitePrecedenti("BrightonFulham", 1, 3, Brighton, Fulham, false, 6, 5);

        PartitePrecedenti ArsenalIpswich = new PartitePrecedenti("ArsenalIpswich", 1, 0, Arsenal, Ipswich, true, 5, 1);
        PartitePrecedenti ArsenalCristalPalace = new PartitePrecedenti("ArsenalCristalPalace", 5, 1, Arsenal, CristalPalace, true, 3, 3);
        PartitePrecedenti ArsenalEverton = new PartitePrecedenti("ArsenalEverton", 0, 0, Arsenal, Everton, false, 8, 2);
        PartitePrecedenti ArsenalFulham = new PartitePrecedenti("ArsenalFulham", 1, 1, Arsenal, Fulham, false, 6, 0);
        PartitePrecedenti ArsenalManchesterUnited = new PartitePrecedenti("ArsenalManchesterUnited", 2, 2, Arsenal, ManchesterUnited, false, 5, 5);

        PartitePrecedenti BournemouthFulham = new PartitePrecedenti("BournemouthFulham", 2, 2, Bournemouth, Fulham, false, 7, 1);
        PartitePrecedenti BournemouthCristalPalace = new PartitePrecedenti("BournemouthCristalPalace", 0, 0, Bournemouth, CristalPalace, false, 5, 2);
        PartitePrecedenti BournemouthManchesterUnited = new PartitePrecedenti("BournemouthManchesterUnited", 3, 0, Bournemouth, ManchesterUnited, true, 1, 13);
        PartitePrecedenti BournemouthWestHem = new PartitePrecedenti("BournemouthWestHem", 1, 1, Bournemouth, WestHem, false, 12, 6);
        PartitePrecedenti BournemouthIpswitch = new PartitePrecedenti("BournemouthIpswitch", 2, 1, Bournemouth, Ipswich, true, 13, 6);

        PartitePrecedenti EvertonNottingham = new PartitePrecedenti("EvertonNottingham", 0, 2, Everton, Nottingham, false, 5, 4);
        PartitePrecedenti EvertonManchesterCity = new PartitePrecedenti("EvertonManchesterCity", 1, 1, Everton, ManchesterCity, false, 5, 8);
        PartitePrecedenti EvertonChelsea = new PartitePrecedenti("EvertonChelsea", 0, 0, Everton, Chelsea, false, 2, 5);
        PartitePrecedenti EvertonArsenal = new PartitePrecedenti("EvertonArsenal", 0, 0, Everton, Arsenal, false, 8, 2);
        PartitePrecedenti EvertonWolves = new PartitePrecedenti("EvertonWolves", 4, 0, Everton, Wolves, true, 3, 4);

        // Crea una schedina per ogni coppia di squadre
        for (int i = 0; i < squadre.getSquadre().size(); i++) {
            for (int j = i + 1; j < squadre.getSquadre().size(); j++) {
                Squadra squadra1 = squadre.getSquadre().get(i);
                Squadra squadra2 = squadre.getSquadre().get(j);
                
                // Creazione di una schedina per ciascuna coppia di squadre
                Schedina schedina = new Schedina();
                schedina.setSquadra1(squadra1);
                schedina.setSquadra2(squadra2);

                // Aggiungi le partite precedenti alla schedina
                schedina.aggiungiPartitePrecedenti(TottenamWolves);
                schedina.aggiungiPartitePrecedenti(TottenhamNottingham);
                schedina.aggiungiPartitePrecedenti(TottenhamLiverpool);
                schedina.aggiungiPartitePrecedenti(TottenhamManchesterUnited);
                schedina.aggiungiPartitePrecedenti(TottenhamSouthEmpton);

                schedina.aggiungiPartitePrecedenti(NewCastleAstonvilla);
                schedina.aggiungiPartitePrecedenti(NewCastleIpswich);
                schedina.aggiungiPartitePrecedenti(NewCastleLeicester);
                schedina.aggiungiPartitePrecedenti(NewCastleBrendford);
                schedina.aggiungiPartitePrecedenti(NewCastleLiverpool);

                schedina.aggiungiPartitePrecedenti(ManchesterUnitedWolves);
                schedina.aggiungiPartitePrecedenti(ManchesterUnitedBornemouth);
                schedina.aggiungiPartitePrecedenti(ManchesterUnitedTottenham);
                schedina.aggiungiPartitePrecedenti(ManchesterUnitedManchesterCity);
                schedina.aggiungiPartitePrecedenti(ManchesterUnitedNottingham);

                schedina.aggiungiPartitePrecedenti(LiverpoolWestHem);
                schedina.aggiungiPartitePrecedenti(LiverpoolLeicester);
                schedina.aggiungiPartitePrecedenti(LiverpoolTottenham);
                schedina.aggiungiPartitePrecedenti(LiverpoolSouthEmpton);
                schedina.aggiungiPartitePrecedenti(LiverpoolFulham);

                schedina.aggiungiPartitePrecedenti(CristalPalaceSouthEmpton);
                schedina.aggiungiPartitePrecedenti(CristalPalaceBournemouth);
                schedina.aggiungiPartitePrecedenti(CristalPalaceArsenal);
                schedina.aggiungiPartitePrecedenti(CristalPalaceBrighton);
                schedina.aggiungiPartitePrecedenti(CristalPalaceManchesterCity);

                schedina.aggiungiPartitePrecedenti(ChelseaFulham);
                schedina.aggiungiPartitePrecedenti(ChelseaEverton);
                schedina.aggiungiPartitePrecedenti(ChelseaBrendford);
                schedina.aggiungiPartitePrecedenti(ChelseaTottenham);
                schedina.aggiungiPartitePrecedenti(ChelseaSouthEmpton);

                schedina.aggiungiPartitePrecedenti(BrightonBrendford);
                schedina.aggiungiPartitePrecedenti(BrightonWestHem);
                schedina.aggiungiPartitePrecedenti(BrightonCristalPalace);
                schedina.aggiungiPartitePrecedenti(BrightonLeicester);
                schedina.aggiungiPartitePrecedenti(BrightonFulham);

                schedina.aggiungiPartitePrecedenti(ArsenalIpswich);
                schedina.aggiungiPartitePrecedenti(ArsenalCristalPalace);
                schedina.aggiungiPartitePrecedenti(ArsenalEverton);
                schedina.aggiungiPartitePrecedenti(ArsenalFulham);
                schedina.aggiungiPartitePrecedenti(ArsenalManchesterUnited);

                schedina.aggiungiPartitePrecedenti(BournemouthFulham);
                schedina.aggiungiPartitePrecedenti(BournemouthCristalPalace);
                schedina.aggiungiPartitePrecedenti(BournemouthManchesterUnited);
                schedina.aggiungiPartitePrecedenti(BournemouthWestHem);
                schedina.aggiungiPartitePrecedenti(BournemouthIpswitch);

                schedina.aggiungiPartitePrecedenti(EvertonNottingham);
                schedina.aggiungiPartitePrecedenti(EvertonManchesterCity);
                schedina.aggiungiPartitePrecedenti(EvertonChelsea);
                schedina.aggiungiPartitePrecedenti(EvertonArsenal);
                schedina.aggiungiPartitePrecedenti(EvertonWolves);
                


                // Applicazione dei metodi per calcolare le probabilità
                System.out.println("Partita tra: " + squadra1.getNome() + " vs " + squadra2.getNome());
                System.out.println("Probabilità goal per " + squadra1.getNome() + ": " + schedina.probabilitaGoalPerSquadra(squadra1));
                System.out.println("Probabilità goal per " + squadra2.getNome() + ": " + schedina.probabilitaGoalPerSquadra(squadra2));
                System.out.println("Probabilità vittoria per " + squadra1.getNome() + ": " + schedina.CalcoloVittoriaSquadraA());
                System.out.println("Probabilità pareggio tra " + squadra1.getNome() + " e " + squadra2.getNome() + ": " + schedina.CalcoloPareggio());
                System.out.println("Probabilità vittoria per " + squadra2.getNome() + ": " + schedina.CalcoloVittoriaSquadraB());
                System.out.println(schedina.calcolaProbabilitaMediaGoal(squadra1));
                System.out.println(schedina.calcolaProbabilitaMediaGoal(squadra2));
                System.out.println(schedina.calcoloProbabilitaMediaCorner(squadra1));
                System.out.println(schedina.calcoloProbabilitaMediaCorner(squadra2));
                System.out.println("--------------------------------------------------");
            }
        }
    }
}
