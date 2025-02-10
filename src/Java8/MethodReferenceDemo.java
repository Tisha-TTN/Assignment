package Java8;

@FunctionalInterface
interface Arithmetic{
    int operation(int a,int b);
}

class Calculation{
    public int add(int a,int b){
        return a+b;
    }
    public int subtract(int a,int b){
        return a-b;
    }

    static int multiply(int a,int b){
        return a*b;
    }

}

public class MethodReferenceDemo {
    public static void main(String[] args) {
        Calculation c=new Calculation();

        Arithmetic a= c::add;
        System.out.println("After addition the result would be :"+a.operation(10,5));

        Arithmetic s=c::subtract;
        System.out.println("After subtraction the result would be :"+s.operation(19,5));


        Arithmetic m=Calculation::multiply;
        System.out.println("after multiplication the value would be :"+m.operation(3,3));

    }
}
