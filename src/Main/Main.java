package Main;

import java.nio.channels.spi.AbstractInterruptibleChannel;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Zeitschrift ds = new Zeitschrift("DS",120,new ArrayList<>(),"V1");

        Abonnent ab1 = new Abonnent("Emil1",200,ds);
        Abonnent ab2 = new Abonnent("Emil2",400,ds);

        ds.newIssue("V2");

        ab1.printSum();
        ab2.printSum();

    }
}
