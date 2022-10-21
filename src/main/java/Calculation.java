import java.util.Scanner;

public class Calculation {

    static Scanner userNumber = new Scanner(System.in);
    static int usersNumber1;
    static int usersNumber2;
    static int answer;

    static void userInputsFirstInteger() {
        usersNumber1 = userNumber.nextInt();

    }

    static void userInputsSecondInteger() {

        usersNumber2 = userNumber.nextInt();
    }

    static void addition() {

        answer = usersNumber1 + usersNumber2;

    }

    static void subtraction() {

        answer =   usersNumber1 - usersNumber2;

    }

    static void division() {

        answer =   usersNumber1 / usersNumber2;

    }

    static void multiplication () {

        answer =   usersNumber1 * usersNumber2;

    }













}
