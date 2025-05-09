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
class Main{
    public static void main(String[] args){
      rectangle obj=new rectangle();
      obj.setfields(20,30);
      System.out.println( obj.getareafields());
    
    
    }
}

