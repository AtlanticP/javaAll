package vit.oop.second;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
//Объект Пенал. Объект состоит из числового поля, содержащего количество карандашей, и собственно
//массива Карандашей. Объект умеет выводить на экран содержимое своих полей, возвращать
//по запросу реальный размер массива, искать карандаш нужного цвета и определенной марки.

public class PenBox {

    public Pen[] penBox = new Pen[]{new First (), new Second (), new Third (), new Fourth()};
    public int amountOfPens = penBox.length;

    public void viewAll() {

//C#        Dictionary<int, string> countries = new Dictionary<int, string>(5);
//C#        countries.Add(1, "Russia");

        Map dict = new HashMap ();
        dict.put (1, "Цвет");
        dict.put (2, "Марка");

//                                .Length
        for (int i = 0; i < penBox.length; i++) {
            Pen pen = penBox[i];
            String[] specification = pen.getSpecification ();

            for (int j = 0; j < specification.length; j++) {  //.Length
//
//          Console.WriteLine(  dict[j]
                System.out.println ("Номер " + i + " " + dict.get (j + 1) + ": " + specification[j]);
            }
        }
    }

    public ArrayList findPen (String str) {

        Map dict = new HashMap ();
        dict.put (1, "Цвет");
        dict.put (2, "Марка");

        ArrayList<Integer> coincidence = new ArrayList();
        int cnt = 0;
        //                                .Length
        for (int i = 0; i < penBox.length; i++) {
            Pen pen = penBox[i];
            String[] specification = pen.getSpecification ();
                                        //C# .Length
            for (int j = 0; j < specification.length; j++) {

                if (specification[j] == str) {
                          //C# .Add
                    coincidence.add (cnt, i);
                    cnt++;
                }
            }
        }
        return coincidence;
    }
}