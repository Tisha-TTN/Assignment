package Java8;


//this interface return true if a>b otherwise false
interface Greater{
    boolean isGreater(int a,int b);
}


interface Increment{
    int increment(int a);
}

interface Concatenation{
    String concate(String a,String b);
}

interface Uppercase{
    String upper(String str);
}


public class LambdaDemo {
    public static void main(String[] args) {


        //lambda for checking the greater number
        Greater g=(a,b)-> a>b;
        System.out.println("Is this grater than "+g.isGreater(5,6));


        //lambda for increment the number
        Increment i=(a)->a+1;
        System.out.println("Incremented result is :"+i.increment(7));

        //lambda for doing concatenation
        Concatenation c=(a,b)-> a+b;
        System.out.println("After cocatenation the result would be :"+c.concate("Eating","Pizza"));



        Uppercase u=(a)->a.toUpperCase();
        System.out.println("The uppercase would be :"+u.upper("hello"));
    }
}
