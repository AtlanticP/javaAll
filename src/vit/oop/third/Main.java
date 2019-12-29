package vit.oop.third;
//3. Моделировать множество, в качестве элементов которого могут использоваться числа
//заданного диапазона и символы.
//Операции: добавление элемента, удаление элемента,
//печать элементов и проверка вхождения. Создать класс — потомок, который содержит
//функцию определения мощности множества. Построить диаграмму классов. Для получения
//максимального количества баллов разработать контейнер произвольной длинны. В задании не
//использовать стандартные коллекции данных.

public class Main {
    public static void main(String[] args) {

//        MyArray arr = new MyArray ('A', 'z');
        MyArray arr = new MyArray (1, 20);
//        Создание массива
//        System.out.println (arr.array);

//        добавление элемента в массив
//        System.out.println (arr.array.size());
//        arr.addElement ('A');
//        System.out.println (arr.array.size());

//        Удаление элемента из массива по индексу
//        System.out.println (arr.array.size());
//        arr.delElement (4);
//        System.out.println (arr.array.size());

//        проверка вхождения
//        System.out.println (arr.checkElement ('A'));
        System.out.println (arr.checkElement (21));

    }
}
