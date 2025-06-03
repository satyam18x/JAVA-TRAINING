 class dfiles {
    public static void gun (String file){
        for (int i=1;i<5;i++){
            System.out.println(file + " "+ "downloading...."+ (i*20)+ "% complete");
            
            try{
                Thread.sleep(2000);
            }catch (Exception e){

            }
        }System.out.println(file + " downloaded successfully");
    }
    
}   

class files {
    public static void main(String[] args) {

        dfiles d1 = new dfiles();
        d1.gun("file A  ");
        d1.gun("file B  ");
  

        
    }
}
