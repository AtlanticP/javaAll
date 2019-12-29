//Описать объект, включающий заданные поля и методы. Написать программу, которая
//создает объект и тестирует его методы. Поля объекта должны быть закрыты, а методы
//открыты для доступа извне.
//Объект — лампа. Параметры: мощность и стоимость. Методы: конструткор и определяющий
//стоимость единицы мощности
package vit.oop.first;

public class Main {
    public static void main(String[] args) {
        Lamp lamp = new Lamp ();
        float unit = lamp.unitCost ();
        //            Console.WriteLine()
        //C#   Console.WriteLine()
        System.out.println (unit + " Р/Вт");
    }
}