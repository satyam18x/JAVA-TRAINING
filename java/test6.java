public class test6 {
    public static void main(String[] args)
    {
      //immutable string
      String str="hello";
      System.out.println(str.concat("hii"));
      System.out.println(str);


      //mutable string
      StringBuilder stk=new StringBuilder("hello");
      stk.append("hii");
      System.out.println(stk);
     

      StringBuilder stp=new StringBuilder(10);
      stp.append("hello hii bye");
      // old capacity*2+2
     // now new will be 10*2+2=22
      System.out.println(stp.length());
      System.out.println(stp.capacity());      
    }
}
