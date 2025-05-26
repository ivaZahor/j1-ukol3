package cz.czechitas.ukol3;

public class Pocitac {
    private boolean jeZapnuty;
    private Procesor procesor;
    private Pamet pamet;
    private Disk disk1;
    private Disk disk2;

    public boolean jeZapnuty() {
        return jeZapnuty;
    }

    public void zapniSe() {
        if (procesor == null || pamet == null || disk1 == null) {
            System.err.println("Pocitac nelze zapnout, protoze chybi potrebny hardware.");

            if (procesor = null)
                System.err.println("Chybi procesor.");

            if (pamet = null)
                System.err.println("Chybi pamet.");

            if (disk1 = null)
                System.err.println("Chybi disk.");
            return;
        }
        if (jeZapnuty()) {
            System.err.println("Pocitac uz je zapnuty.");
            return;
        }
        jeZapnuty = true;
        System.out.println("Pocitac je zapnuty.");
    }

    public void vypniSe() {
        jeZapnuty = false;
        System.out.println("Pocitac je vypnuty.");
    }
    public void vytvorSouborOVelikost(long velikost){
        if (!jeZapnuty){
            System.err.println("Pocitac neni zapnuty.");
            return;
        }
        if (Disk != null) {
            long noveVyuziti = Disk.getVyuziteMisto() + velikost;
            disk1.setVyuziteMisto(noveVyuziti);
                }
    }
    public void vymazSouborOVelikosti(long velikost){
        if (!jeZapnuty){
            System.err.println("Pocitac neni zapnuty.");
            return;
        }
        if (Disk !=null){
            long noveVyuziti = disk1.getVyuziteMisto() - velikost;
            disk1.setVyuziteMisto(noveVyuziti);
        }
    }

   public void setDisk1(Disk disk1) {
        this.disk1 = disk1 ;
    }
 //   public void setDisk2(Disk disk2) {
 //       this.disk2 = disk2 ;
  //  }
    public void setPamet(Pamet pamet) {
        this.pamet = pamet;
    }
    public void setProcesor(Procesor procesor) {
        this.procesor = procesor;
    }

    public String toString() {
        return "Pocitac: Zapnuty -"  + jeZapnuty ;
    }
}
