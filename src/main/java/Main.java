import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner usersOperatorInput = new Scanner(System.in);

        Display.displayMainMenu();

        String usersOperatorChoice = usersOperatorInput.nextLine();

        switch (usersOperatorChoice) {

            case "+" -> {

                Display.displayEnterAnInteger();

                Calculation.userInputsFirstInteger();

                Display.displayEnterASecondInteger();

                Calculation.userInputsSecondInteger();

                Calculation.addition();

                Display.displayAdditionAnswer();
            }

            case "-" -> {

                Display.displayEnterAnInteger();

                Calculation.userInputsFirstInteger();

                Display.displayEnterASecondInteger();

                Calculation.userInputsSecondInteger();

                Calculation.subtraction();

                Display.displaySubtractionAnswer();
            }

            case "*" -> {

                Display.displayEnterAnInteger();

                Calculation.userInputsFirstInteger();

                Display.displayEnterASecondInteger();

                Calculation.userInputsSecondInteger();

                Calculation.multiplication();

                Display.displayMultiplicationAnswer();
            }

            case "/" -> {

                Display.displayEnterAnInteger();

                Calculation.userInputsFirstInteger();

                Display.displayEnterASecondInteger();

                Calculation.userInputsSecondInteger();

                Calculation.division();

                Display.displayDivisionAnswer();
            }


        }



    }
}
