import java.util.Objects;

class Account{
    private int balance;
    private String notification;
    private String contact;

    public Account(int balance, String notification String contact) {
        this.balance = balance;
        this.notification = notification;
        this.contact = contact;
    }

    public void balance() {
        notify("balance is: " + balance,notification,contact);
    }

    public void deposit(int x){
        balance = balance + x;
        notify(x + " dollars have been deposited" + balance,notification,contact);
    }

    public void withdraw(int x){
        int temp = balance + x;
        if(temp < 0){
            notify("overdrawn" + balance,notification,contact);
        }else{
            balance = balance - x;
            notify(x + " dollars have been withdrawn" + balance,notification,contact);
        }
    }
    
     private void notify(String s, String notification,String contact) {
        if(Objects.equals(notification, "e")){
            System.out.println("email to " + contact +  ": " + s +"\n");
        } else if (Objects.equals(notification, "s")) {
            System.out.println("sms to " + contact + ": : " + s +"\n");
        } else if (Objects.equals(notification, "w")) {
            System.out.println("whatsapp message to" + contact + ": : " + s +"\n");
        }
    }   
}
