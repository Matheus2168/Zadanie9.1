import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("fname:");
        String firsName = sc.nextLine();
        System.out.println("lname");
        String lastName = sc.nextLine();
        System.out.println("age:");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("pesel:");
        String pesel = sc.nextLine();

        try {
            Person person = new Person(firsName,lastName,age,pesel);
        } catch (NameUndefinedException e) {
            e.printStackTrace();
        } catch (IncorrectAgeException e) {
            e.printStackTrace();
        }
    }
}
