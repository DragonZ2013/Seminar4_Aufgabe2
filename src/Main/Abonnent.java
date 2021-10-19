package Main;

import java.util.List;

public class Abonnent implements Observer{
    private String name;
    private int geldSumme;
    private Zeitschrift zeitschrift;

    public Abonnent(String name, int geldSumme, Zeitschrift zeitschrift) {
        this.name = name;
        this.geldSumme = geldSumme;
        this.zeitschrift = zeitschrift;
        zeitschrift.attach(this);
    }



    @Override
    public void update() {
        geldSumme-=zeitschrift.getPreis();
    }

    public void printSum(){
        System.out.println(geldSumme);
    }
}
