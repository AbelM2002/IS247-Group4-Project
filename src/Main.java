//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Objects;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        //nofication choosing
        System.out.println("Hello and welcome!");
        System.out.println("Choose notification type:");
        System.out.println("Email: e");
        System.out.println("SMS: s");
        System.out.println("WhatsApp: w");

        Scanner input = new Scanner(System.in);
        String notif = input.nextLine();
        
        int w = 0;
        while (w == 0){
            if((Objects.equals(notif, "e")) || (notif.equals("s")) || (notif.equals("w"))){
                w++;
            }else{
                System.out.println("Invalid Input");
                System.out.println("Choose notification type:");
                System.out.println("Email");
                System.out.println("SMS");
                System.out.println("WhatsApp");
                notif = input.nextLine();
            }
        }
        // notif = chosen notification type

        System.out.println("Enter Contact");
        String contact = input.nextLine();
        // contact = contact point

        //intial deposti
        System.out.println("Enter initial deposit amount");
        int deposit = input.nextInt();
        w = 0;
        while (w == 0){
            if(deposit>0){
                w++;
            }else{
                System.out.println("Invalid Input");
                System.out.println("Enter initial deposit amount");
                account = input.nextInt();
            }
        }
        //deposit = inital deposit

        System.out.println("creating account...");
        Account account1 = new Account(deposit,notif,contact);
        System.out.println("account created");

        int x = 0;
        int amount;
        while(x == 0) {
            System.out.println("What would you like to do?");
            System.out.println("View Balance ... B");
            System.out.println("Deposit ... D");
            System.out.println("Withdraw ... W");
            System.out.println("Quit ... Q");
            String in = input.nextLine();
            System.out.println("h");

            if (Objects.equals(in, "Q")){
                x++;
                System.out.println("Quiting");
            } else if (Objects.equals(in, "B")) {
                account1.balance();
            }else if (Objects.equals(in, "D")) {
                System.out.println("Enter deposit amount:");
                amount = input.nextInt();
                account1.deposit(amount);
            }else if (Objects.equals(in, "W")) {
                amount = input.nextInt();
                account1.withdraw(amount);
            }else{
                System.out.println("Invalid Input");
            }
        }


        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}
