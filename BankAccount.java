import java.util.Scanner;
public class BankAccount {
    static String bankname;
    static {
        System.out.println("Welcome to SBI Bank");
    }

    static int findaccount(int accountnumber, int[] accountsarray) {
        int i = 0;
        while (i < accountsarray.length) {
            if (accountsarray[i] == accountnumber) {
                return i;
            }
            i++;
        }
        return 0;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] AccountNumber = new int[200];
        String[] AccountHolderName = new String[200];
        long[] AccountBalance = new long[200];
        String[] EmailID = new String[200];
        long[] MobileNumber = new long[200];
        int accountcount = 0;
        int newaccountnumber = 201;
        while (true) {
            System.out.println("Enter 1->if you want to create a new account");
            System.out.println("Enter 2-> if you want to deposit money");
            System.out.println("Enter 3-> if you want to withdraw money");
            System.out.println("Enter 4-> if you want to view account details");
            System.out.println("Enter 5->if you want to update contact details");
            System.out.println("Enter any other if you want to exit");
            System.out.print("Enter your choice: ");

            int choice = input.nextInt();
            input.nextLine();
            if (choice == 1) {
                System.out.print("Enter account holder name:");
                String Name = input.nextLine();
                System.out.print("Enter your first deposit:");
                long initialdeposit = input.nextLong();
                input.nextLine();
                System.out.print("Enter your email address:");
                String email = input.nextLine();
                System.out.print("Enter your mobile number:");
                long mobilenumber = input.nextLong();
                AccountNumber[accountcount] = newaccountnumber;
                AccountHolderName[accountcount] = Name;
                AccountBalance[accountcount] = initialdeposit;
                EmailID[accountcount] = email;
                MobileNumber[accountcount] = mobilenumber;
                System.out.println("Account created successfully");
                System.out.println("Your account number is " + newaccountnumber);
                newaccountnumber++;
                accountcount++;
            } else if (choice == 2) {
                System.out.print("Enter account number: ");
                int accountno = input.nextInt();
                if (findaccount(accountno, AccountNumber) != -1) {
                    int index = findaccount(accountno, AccountNumber);
                    System.out.print("Enter amount you want to deposit:");
                    long depositedamount = input.nextLong();
                    AccountBalance[index] += depositedamount;
                    System.out.println("Amount deposited successfully.");
                    System.out.println("your new balance is " + AccountBalance[index]);
                } else {
                    System.out.println("Cannot find your account");
                }
            } else if (choice == 3) {
                System.out.print("Enter account number: ");
                int accountno = input.nextInt();
                if (findaccount(accountno, AccountNumber) != -1) {
                    int index = findaccount(accountno, AccountNumber);
                    System.out.print("Enter amount you want to withdraw:");
                    long withdrawnamount = input.nextLong();
                    AccountBalance[index] -= withdrawnamount;
                    System.out.println("Amount withdrawn successfully.");
                    System.out.println("your new balance is " + AccountBalance[index]);
                } else {
                    System.out.println("Cannot find your account");
                }
            } else if (choice == 4) {
                System.out.print("Enter account number: ");
                int accountno = input.nextInt();
                if (findaccount(accountno, AccountNumber) != -1) {
                    int index = findaccount(accountno, AccountNumber);
                    System.out.println("Account Holder Name: " + AccountHolderName[index]);
                    System.out.println("Email id: " + EmailID[index]);
                    System.out.println("Phone number: " + MobileNumber[index]);
                    System.out.println("Avialable Balance: " + AccountBalance[index]);
                } else {
                    System.out.println("Cannot find your account");
                }
            } else if (choice == 5) {
                System.out.print("Enter account number: ");
                int accountno = input.nextInt();
                if (findaccount(accountno, AccountNumber) != -1) {
                    int index = findaccount(accountno, AccountNumber);
                    System.out.print("Enter new phone number: ");
                    MobileNumber[index] = input.nextLong();
                    input.nextLine();
                    System.out.print("Enter new email:");
                    EmailID[index] = input.nextLine();
                    System.out.println("Account details updated successfully");
                } else {
                    System.out.println("Cannot find your account");
                }
            } else {
                System.out.println("you have exited successfully");
                break;
            }
        }

    }
}