package vit.list;

public class Main {
    public static void main(String[] args) {
        List l1 = new List ();
        for (double x=0.0f; x <= 10; x+=0.1) {
            l1.add(x);
        }
        l1.addAt(95, 3.14f);
        l1.delAt(97);
        for (int k=0; k < 120; k+=1) {
            double y = l1.getAt (k);
            System.out.println (y);
        }
    }
}