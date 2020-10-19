package com.example.demo.Factory;

public class shapeAbstractFactory extends AbstractFactory {

    @Override
    public color getColor(String color) {
        return null;
    }

    @Override
    public shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new square();
        }
        return null;
    }
}
