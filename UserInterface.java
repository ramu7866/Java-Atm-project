package atm;

import java.util.Scanner;

public class UserInterface {
         private static int status; 
            public static void main(String[] args){
    AtmInterface ap =new AtmOpea();
    Scanner sc = new Scanner(System.in);
    System.out.println("set the Atm number");
    int atmnumber=sc.nextInt();
    System.out.println("set Atm pin");
    int atmpin=sc.nextInt();

    System.out.println("Reenter ATM number");
    int atmnum2=sc.nextInt();
    System.out.println("Reenter ATM Pin");
    int atmpin2=sc.nextInt();
    if(atmnumber==atmnum2 && atmpin==atmpin2){
        while(true) {
           System.out.println("1.viewAvailable\n 2.withdrawamount\n 3.DepositeAmount\n 4.viewministatement\n 5.exit");
            System.out.println("Enter your choice");
            int ch=sc.nextInt();
            if(ch==1){
                ap.viewBalance();
            }
            else if(ch==2){
                System.out.println("enter the amount to withdraw");
                double withdrawamount=sc.nextDouble();
                ap.withdrawamount(withdrawamount);
            }
            else if(ch==3){
                System.out.println("enter the amount to deposit");
                double depositeamount=sc.nextDouble();
                ap.depositeamount(depositeamount);
            }
            else if(ch==4){
                ap.viewMiniStatement();
            }
            else if(ch==5){
                System.out.println("collect your ATM card \n Thank you");
                System.exit(status);
            }
        }

            }

    
    else{
        System.out.println("incorrect Atm number or pin");
    }



    
}
}
