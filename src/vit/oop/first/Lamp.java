package vit.oop.first;
//Описать объект, включающий заданные поля и методы. Написать программу, которая
//создает объект и тестирует его методы. Поля объекта должны быть закрыты, а методы
//открыты для доступа извне.
//Объект — лампа. Параметры: мощность и стоимость. Методы: конструткор и определяющий
//стоимость единицы мощности

public class Lamp {
    private float power = 100;
    private float price = 10;

    public void Lamp (int price) {
        this.price = (float)price;
    }

    public float unitCost () {
        float uc = price/power;
        return uc;
    }
}
