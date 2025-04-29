class student{

    
    void area(int length, int breadth){
        System.out.println("Area of rectangle is: " + (length*breadth));
   
    }

}

public class objectclasees {
    public static void main(String[] args) {
        student s = new student();
        s.area(5,6);
    }
    


}
