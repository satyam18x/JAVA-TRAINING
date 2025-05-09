 class atm {
    private int a;
     public void setRUPEES(int a)
     {
    
        this.a=a;
     }
     public int getRupees(){
        return a;

     }
    
}

class Main{
    public static void main(String[] args){
        atm obj=new atm();
        obj.setRUPEES(500);
        int k=obj.getRupees();
        System.out.println(k);
    }
}
