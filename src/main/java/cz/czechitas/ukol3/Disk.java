package cz.czechitas.ukol3;

public class Disk {
    private long kapacita;
    private long vyuziteMisto;

    public long getKapacita() {
        return kapacita;
    }

    public void setKapacita(long kapacita) {
        this.kapacita = kapacita;
    }

    public long getVyuziteMisto() {
        return vyuziteMisto;
    }

    public void setVyuziteMisto(long vyuziteMisto) {

        if  (vyuziteMisto > kapacita) {
            System.err.println("Nedostatek mista na disku.");
            return;
        }
        if (vyuziteMisto < 0) {
            System.err.println("Vyuzite misto nesmi byt mensi nez 0.");
            return;
        }
        this.vyuziteMisto = vyuziteMisto;
    }

    public String toString() {
        return "kapacita:" + kapacita + ", Vyuzite Misto:" + vyuziteMisto;
    }
}
