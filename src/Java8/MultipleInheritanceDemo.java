package Java8;

interface A{
   default void display(){
       System.out.println("hey I am inerface A");
   };

}

interface B{
   default void display(){
       System.out.println("Hey I am interface B");
   };
}

class Demo implements A,B{
    @Override
    public void display(){
        System.out.println("hi");
        A.super.display();
        B.super.display();
    }



}

public class MultipleInheritanceDemo {
    public static void main(String[] args) {

        Demo d=new Demo();
        d.display();

    }
}
