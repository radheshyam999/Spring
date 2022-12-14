package io.XLParser;

public class Abc implements Cloneable{
    public static void main(String[] args) throws CloneNotSupportedException {
        Abc obj = new Abc();
        System.out.println(obj.clone().getClass() == obj.getClass());
        
    }


}