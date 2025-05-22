package cz.czechitas.ukol3;
public class Procesor {
    private String vyrobce;
    private long rychlost;

    public String getVyrobce (){
        return vyrobce;
    }
public void setVyrobce() {
     this.vyrobce = vyrobce;
}
public long getRychlost() {
        return rychlost;
}
public void setRychlost() {
        this.rychlost = rychlost;
}
public String toString() {
        return "vyrobce:" + vyrobce + ", Rychlost:" + rychlost;}
}
