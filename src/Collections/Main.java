package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {



        public static void main(String[] args) {


            List<Double> list = new ArrayList<>();
            list.add(1.2);
            list.add(3.89);
            list.add(89.45);
            list.add(33.76);
            list.add(88.98);
            Iterator<Double> i=list.iterator();
            double sum=0;
            while(i.hasNext()){
                sum+=i.next();
            }
            System.out.println("Sum is :"+sum);



        }
    }

