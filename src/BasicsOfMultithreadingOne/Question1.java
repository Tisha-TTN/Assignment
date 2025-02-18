package BasicsOfMultithreadingOne;



class Demo implements Runnable{
    public void run(){
        System.out.println("Run method overriding by implementing Runnable");
        try {
            //System.out.println(Thread.currentThread().getName()+": now start");
            //System.out.println("Thread pause for some time");
            Thread.sleep(10);
            System.out.println(Thread.currentThread().getName()+": now end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}


class Demo1 extends Thread{
    public void run(){
        System.out.println("Run method override by extending Thread class");
        try{
           // System.out.println("Thread start working"+Thread.currentThread().getName());
           // System.out.println("Thread pause for sometime");
          Thread.sleep(20);
            System.out.println(Thread.currentThread().getName()+"now end");



        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }



}

public class Question1 {
    public static void main(String[] args) {
        Demo d=new Demo();
        Thread t=new Thread(d,"Thread-1");
        t.start();



        Demo1 d1=new Demo1();
        d1.setName("Thread-2");
        d1.start();
        try{
            t.join();
            d1.join();


        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Now the execution completed");

    }
}
