
package oop.demo;


public class OOPDemo {

   
    public static void main(String[] args) {
  //Student s1 = new Student();
   //s1.getAddress();
  RationalNumber a = new RationalNumber(10,3);
  RationalNumber b = new RationalNumber(2,3);
  RationalNumber c = a.add(b);
  a.print();
  b.print();
  c.print();
  ComplexNumber x = new ComplexNumber(2,4);
  ComplexNumber y =new ComplexNumber(-2,4);
  ComplexNumber z= x.Add(y);

  x.print();
  y.print();
    z.print();
        
       
       // System.out.println("Id:");
    }
    
}
