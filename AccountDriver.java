import java.util.Scanner;

//just javac this fiel will auto cause Account.java to be processed into a .class file.
//Account.java don't even have a main() method
public class AccountDriver
{
    public static void main(String[] args)
    {
    Account account = new Account();
    //print surname BEFORE initializing it & see results
    System.out.println("\nSurname is " + account.surname);

    //set surname DIRECTLY.
    account.surname = "Shaikh";
    System.out.println("Surname is " + account.surname);

//set name using a method of account obj of Account class.
    account.setName("Mani");
    System.out.printf("First name is: %s \n", account.name);



    //getName() used after changing the name:
    account.setName("Zoya");
    System.out.printf("Wife's name is %10s %-10s \n", account.name, account.surname);

    //init Scanner to read user input
    Scanner input = new Scanner(System.in);
    System.out.print("\nWhat's the name of your child? ");
    String baby = input.nextLine();
    
    System.out.printf("Baby's name is: %s \n", baby);


//call non-default constructor of class "Age"
Age ages = new Age(36, 28, 1);

//print ages of a  3. Cannot access ages.dadAge if it's private there
System.out.printf("Ages of family are %d, %d, and %d\n", ages.dadAge, ages.momAge, ages.sonAge);

    }
}