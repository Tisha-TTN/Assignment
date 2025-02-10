package Java8;

import org.w3c.dom.ls.LSOutput;
@FunctionalInterface
interface Functional{



    Employee display(String str);
}
class Employee{
    private String str;
    public Employee(String str){

        this.str=str;
        System.out.println("Message from constructor"+str);
    }


}

public class ConstructorReferenceDemo {
    public static void main(String[] args) {
        //it tells whenever the display method call the new Employee(msg)
        //f holds the reference of the constructor
        Functional f=Employee::new;
        //here display method calls on a refernce f so java automatically calls the new Employee(msg)
       Employee e= f.display("Hey I am display method");

    }
}
