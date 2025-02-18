package BasicsOfMultithreadingOne;
//shared resource
class Whiteboard{
    volatile String homework="Science Work";
}
//we have to make two threads that share the same variable homework
//teacher update this variable  and student read the homework from the whiteboard
class Teacher extends Thread{
    Whiteboard board;
    public Teacher(Whiteboard board){
        this.board=board;
    }
    public void run(){
        System.out.println("This is run method of Teacher class");
        String[] task={"Biology Work","Maths Work"};
        for(String a:task){
            System.out.println("Teacher update the one more task :"+a);
            board.homework=a;
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}


class Student extends Thread{
    Whiteboard board;
    public Student(Whiteboard board){
        this.board=board;
    }
    public void run(){
        System.out.println("This is run method of Student class");
        for(int i=0;i<7;i++){
            System.out.println("The homework read by student is :"+board.homework);
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }

    }
}





public class Question3 {
    public static void main(String[] args) {
        Whiteboard board=new Whiteboard();
        Teacher t=new Teacher(board);
        Student s=new Student(board);
        t.start();

        s.start();

    }
}
