public class Display {

    static void displayMainMenu () {

        System.out.println("Welcome to the Main Menu! Please choose what you want to do: ");
        System.out.println("-------------------------------------------------------------");
        System.out.println("1. Press + for addition ");
        System.out.println("2. Press - for subtraction ");
        System.out.println("3. Press * for multiplication ");
        System.out.println("4. Press / for division");
    }

    static void displayEnterAnInteger () {

        System.out.println("Enter an integer: ");
    }

    static void displayEnterASecondInteger() {

        System.out.println("Enter a second integer: ");
    }

    static void displayAdditionAnswer() {

        System.out.println(Calculation.usersNumber1 + " + " + Calculation.usersNumber2 + " = " + Calculation.answer);
    }

    static void displaySubtractionAnswer () {

        System.out.println(Calculation.usersNumber1 + " - " + Calculation.usersNumber2 + " = " + Calculation.answer);
    }

    static void displayMultiplicationAnswer() {

        System.out.println(Calculation.usersNumber1 + " * " + Calculation.usersNumber2 + " = " + Calculation.answer);
    }

    static void displayDivisionAnswer() {

        System.out.println(Calculation.usersNumber1 + " / " + Calculation.usersNumber2 + " = " + Calculation.answer);
    }

}
