import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FileHandler fh = new FileHandler();

        ArrayList<Covid19Data> covid19Data = fh.loadAllpatients();

        for (Covid19Data data : covid19Data){
            System.out.println(data);
        }

    }
}
