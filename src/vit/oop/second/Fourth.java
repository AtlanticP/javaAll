package vit.oop.second;

import java.util.HashMap;
import java.util.Map;

public class Fourth extends Pen {
    private String color = "Blue";
    private String mark = "KORES";
    private String[] specification = new String[]{color, mark};

    @Override
    public String[] getSpecification() {
        return specification;
    }

    public void viewSpecification() {
// C#   Dictionary<int, string> countries = new Dictionary<int, string>(5);
//        countries.Add(1, "Russia");

        Map dict = new HashMap ();
        dict.put (1, "Цвет");
        dict.put (2, "Марка");

        // C#                            .Length
        for (int j = 0; j < specification.length; j++) {

//C#         Console.WriteLine(  dict[j]
            System.out.println (dict.get (j + 1) + ": " + specification[j]);
        }
    }
}
