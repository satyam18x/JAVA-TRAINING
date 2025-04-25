public class new1{
    public static void main(String[] args){

        String str="hello";
        String str1="hiiii";
       

        for(int i=0;i<str.length();i++){
            for(int j=0;j<str1.length();j++){
                if(str.charAt(i)==str1.charAt(j)){
                    System.out.println("common character is: "+str.charAt(i));
                }
            }
        }
    }
}
