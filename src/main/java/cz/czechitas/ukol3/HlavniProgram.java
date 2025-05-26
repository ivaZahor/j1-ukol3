package cz.czechitas.ukol3;

/**
 * Spouštěcí třída celého programu
 */
public class HlavniProgram {

    public static void main(String... args) {
        Pocitac ivaPc = new Pocitac();
        System.out.println(ivaPc.toString());
        ivaPc.zapniSe();      // Vypíše chybu, nemá v tuto chvíli všechny potřebné součásti.

        Procesor ivaProcesor = new Procesor();
        ivaProcesor.setRychlost(1_800_000_000L);
        ivaProcesor.setVyrobce("HP");

        Pamet ivaPamet = new Pamet();
        ivaPamet.setKapacita(3_890_000_000L);

        Disk ivaDisk = new Disk();
        ivaDisk.setKapacita(4_000_000_000L);
        ivaDisk.setVyuziteMisto(2_000_000_000L);

        ivaPc.setProcesor(ivaProcesor);
        ivaPc.setPamet(ivaPamet);
        ivaPc.setDisk1(ivaDisk);

        System.out.println(ivaPc.toString());

       ivaPc.zapniSe();
      //  ivaPc.zapniSe();      // Vypíše chybu, protože počítač už běží
        System.out.println(ivaPc.toString());

        ivaPc.vytvorSouborOVelikost(500_000_000L);
      //  ivaPc.vytvorSouborOVelikost(2_000_000_000L);   //nepujde ulozit

        ivaPc.vymazSouborOVelikosti(1_000_000_000L);

     //   ivaPc.vypniSe();
     //   ivaPc.vypniSe();
    }

  //          System.out.println("Program spuštěn.");
}



