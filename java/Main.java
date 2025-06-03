class rectangle{
    private int length;
           private int breadth;
    public void setfields(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }

    public int getareafields(){
        return length*breadth;
        
    }
    public int getperimeterfields(){
        return 2*(length+breadth);
        
    }
}

class student {
    private String name;
    private int marks;
public void setinfo(String name,int marks){
 this.name=name;
 this.marks=marks;
}

public String getname(){
 return name;
 }
 public int getmarks(){
    return marks;
    }
}

class Main{
    public static void main(String[] args){
      rectangle obj=new rectangle();
      obj.setfields(20,30);
      System.out.println( obj.getareafields());
    student ob = new student();
    ob.setinfo("satyam",99);
    System.out.println(ob.getname());

    
    }
}


