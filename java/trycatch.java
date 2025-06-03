class MYthread extends Thread {
    public void run() {
        System.out.println("hello");
        try {
            Thread.sleep(2000); 
        } catch (Exception e) {
           
        }
        System.out.println("hi");
    }
}

class trycatch {
    public static void main(String[] args) {
        MYthread t1 = new MYthread();
        t1.start(); 
    }
}