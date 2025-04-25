public class test4 {
    public static void main (String[] args){

                 String str ="heello";
                String newStr = "";
                for (int i=0;i<str.length();i++)
                { for (int j=i+1;j<str.length();j++)
                    {
                        if (str.charAt(i)==str.charAt(j))
                        {
                            System.out.println(str.charAt(i));
                           return;
                        }
                    }
                }
                
            }
        
        }   
    
    

