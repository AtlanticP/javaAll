package vit.oop.second;
//Объект — карандаш, описываемый цветом рисования и маркой. Объект умеет выводить на
//экран содержимое своих полей, возвращать содержимое своих полей по запросу.

public abstract class Pen {

    public abstract String[] getSpecification();
    public abstract void viewSpecification();
}