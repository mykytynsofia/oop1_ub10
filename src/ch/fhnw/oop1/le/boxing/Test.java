package ch.fhnw.oop1.le.boxing;

public class Test {

    public static Integer inc(Integer i) {
       return i + 1;
    }
 
    public static void main(String[] args) {
       Object o1 = inc(2);        
       System.out.println(o1);
       
       Integer i1 = inc(2);       
       System.out.println(i1);
       
       int i2 = inc(2);           
       System.out.println(i2);
    }
 }
