package temp;

public class Main {


    public static void main(String[] args) {
        Temp temp = new Temp ();
        Object t = temp.returnNull ();

        temp.mapAnalyzing ();

        String str = "ABCD";
        System.out.println ();
        for (int i = 0; i < str.split ("").length; i++) {
            System.out.println (str.split ("")[i].getClass ());
        }



    }
}