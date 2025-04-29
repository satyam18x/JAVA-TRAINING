class student{


    void show(String car,String color,int price , int year, String model)
        { System.out.println("car detils : \n name :  " + car+" \n color " + color + " \n price : " + price + " \n year : " + year + "\n model :  " + model);
   
    }

}

public class car {
    public static void main(String[] args) {
        student s = new student();
        s.show("BMW", "red", 1000000, 2023, "X5");
    }
    


}
