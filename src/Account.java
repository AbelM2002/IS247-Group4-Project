import java.util.Objects;

class Account{
    private int balance;
    private String notification;
    private String contact;
    //notification and contact are fluff, were used for API

    public Account(int balance, String notification String contact) {
        this.balance = balance;
        this.notification = notification;
        this.contact = contact;
    }
}

    public void balance() {
        System.out.println("balance is: " + balance);
    }

    public void deposit(int x){
        balance = balance + x;
        System.out.println(x + " dollars have been deposited");
    }

    public void withdraw(int x){
        int temp = balance + x;
        if(temp < 0){
            System.out.println("overdrawn");
        }else{
            balance = balance - x;
            System.out.println(x + " dollars have been withdrawn");
        }
    }

