import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String[] name = {"Elif, Rana, Yılancı"};
        System.out.println(Arrays.toString(name));
        // toString, nesnenin türünün tam adını döndürür.

        ArrayList<String> fname = new ArrayList<>(Arrays.asList(name));
        // asList, bir diziden sabit boyutlu bir List nesnesine dönüştürüyor.
        System.out.println(fname);
    }
}
