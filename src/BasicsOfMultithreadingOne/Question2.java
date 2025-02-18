package BasicsOfMultithreadingOne;

class Counter{
    private int count=0;
    public synchronized  void increment(){
        count++;
        System.out.println(Thread.currentThread().getName()+"count is :"+count);
    }
}

class P{
    public void print(String message){
        synchronized (this){
            System.out.println(message);
        }
    }
}
public class Question2 {
    public static void main(String[] args) {
       Counter c=new Counter();
       Thread t1=new Thread(()->c.increment(),"Thread-1");
       Thread t2=new Thread(()->c.increment(),"Thread-2");
       t1.start();
       t2.start();

       P p=new P();
       Thread t3=new Thread(()->p.print("Hy"),"Thread-3");
       Thread t4=new Thread(()->p.print("By"),"Thread-4");
       t3.start();
       t4.start();
    }
}
