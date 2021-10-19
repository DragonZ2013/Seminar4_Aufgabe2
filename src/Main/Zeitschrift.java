package Main;

import java.util.List;

public class Zeitschrift implements  Subject{
    private String name;
    int preis;
    List<Abonnent> subscriberList;
    private String currentIssue;


    public Zeitschrift(String name, int preis, List<Abonnent> subscriberList,String currentIssue) {
        this.name = name;
        this.preis = preis;
        this.subscriberList = subscriberList;
        this.currentIssue = currentIssue;

    }

    public void newIssue(String futureIssue){
        currentIssue=futureIssue;
        notifyAlles();
    }

    @Override
    public void attach(Observer obs) {
        subscriberList.add((Abonnent) obs);
    }

    @Override
    public void detach(Observer obs) {
        subscriberList.remove((Abonnent) obs);

    }

    @Override
    public void notifyAlles() {
        for(Abonnent abo:subscriberList)
            abo.update();

    }

    public int getPreis() {
        return preis;
    }

    public void setPreis(int preis) {
        this.preis = preis;
    }
}
