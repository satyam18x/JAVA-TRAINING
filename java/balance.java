public class balance{


     int balance = 1000;

      public void withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount + ", New Balance: " + balance);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
             
            }
        } else {
            System.out.println("Withdrawal of " + amount + " failed, aapke pass paisa nhi h. Current Balance: " + balance);
        }
    }

    public static void main(String[] args) {
        balance b = new balance();
        Thread t1 = new Thread(() -> b.withdraw(800));
        Thread t2 = new Thread(() -> b.withdraw(500));
        t1.start();
        t2.start();
      
    }
}