package vit.oop.third2;
//3. Моделировать множество, в качестве элементов которого могут использоваться числа
//заданного диапазона и символы.
//Операции: добавление элемента, удаление элемента,
//печать элементов и проверка вхождения. Создать класс — потомок, который содержит
//функцию определения мощности множества. Построить диаграмму классов. Для получения
//максимального количества баллов разработать контейнер произвольной длинны. В задании не
//использовать стандартные коллекции данных.

public class Main {
    public static void main(String[] args) {
        MyArray array = new MyArray ();

//        create array
        for (double d = 0.0f; d < 40.0f; d+=0.01f) {
            array.add(d);
        }

//        get value of i-th's element
        for (int i = 0; i < 7; i++) {
            System.out.println (array.getValue (i));
        }

        System.out.println ("size of the array: " + array.getSize ());

//       add element to the array
        array.add(5, 1.44444d);

        for (int i = 0; i < 7; i++) {
            System.out.println (array.getValue (i));
        }

//        get size of the array
        System.out.println ("size of the array: " + array.getSize ());

        System.out.println ("Generate a random array from range [0, 10)");
        MyArray arrayRandom = new MyArray ();

        for (int i = 0; i < 5; i++) {
            arrayRandom.add ((double)Math.random ()*10);
        }

        System.out.println ("Let's it's value: ");

        for (int i = 0; i < 5; i++) {
            System.out.println (arrayRandom.getValue (i));
        }
    }

}