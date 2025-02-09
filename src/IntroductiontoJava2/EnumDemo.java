package IntroductiontoJava2;
enum House{
    APARTMENT(23456),
    villa(5000),
    bugalow(22500),
    duplex(18000);


    private int price;

    House(int price) {
        this.price = price;
    }


    public int getPrice(){
        return price;
    }

}



public class EnumDemo {
    public static void main(String args[]){

        for(House house : House.values()){
            System.out.println(house+"cost $" + house.getPrice());
        }




    }
}