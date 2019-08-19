package sourcecode.CramersRule;

import java.util.*;

public class Cramers{
    private static String getIntroduction(){
        String introduction = "";

        introduction += " Hey there. Welcome to the program. \n";
        introduction += " This program is designed to help mathematicians in solving simple homogenous equations. \n";
        introduction += " Specifically, its essence is to get the solutions to two equations of the form : \n";
        introduction += " ax + by = result. \n";
        introduction += " where 'a' and 'b' are constants and x and y are the values to be determined. \n";
        introduction += " 'result' refers to the final output of the equation. \n";
        introduction += " The technique used is Cramer's rule for solving homogenous equations. \n";
        introduction += " It is worth noting that henceforth, we will be using 'a' and 'b' to refer to the values of the coefficients. \n";
        introduction += " Similarly, 'X' and 'Y' will refer to the unknowns whose values are to be determined. \n";
        introduction += " 'result' will refer to the final value of the equation. \n";
        introduction += " Feel free to use the application and report incase of any errors. \n";

        return introduction;
    }

    private static String getCredits(){
        return " Patrick Gatiri 2019. \n";
    }

    public static void main (String [] args){

        Scanner scanner = new Scanner (System.in);
        double firstCoefficient, secondCoefficient, result;

        System.out.print(getCredits() + getIntroduction());
	System.out.println();

	Equation firstEquation = null, secondEquation = null;

	try{

        System.out.print(" Enter the value of a in the first equation : ");
        firstCoefficient = scanner.nextDouble();
        System.out.println();
        System.out.print(" Enter the value of b in the first equation : ");
        secondCoefficient = scanner.nextDouble();
        System.out.println();
        System.out.print(" Enter the value of the result in the first equation : ");
        result = scanner.nextDouble();
        System.out.println();

	firstEquation = new Equation(firstCoefficient, secondCoefficient, result);
        System.out.println();

        System.out.print(" Enter the value of a in the second equation : ");
        firstCoefficient = scanner.nextDouble();
        System.out.println();
        System.out.print(" Enter the value of b in the second equation : ");
        secondCoefficient = scanner.nextDouble();
        System.out.println();
        System.out.print(" Enter the value of the result in the second equation : ");
        result = scanner.nextDouble();
        System.out.println();

        secondEquation = new Equation(firstCoefficient, secondCoefficient, result);
	System.out.println();

	} catch (InputMismatchException e){
		System.out.println(" Please ensure that you enter valid integral or floating point values");
	}

	if (firstEquation != null && secondEquation != null){
        
        Solution solution = new Solution(firstEquation, secondEquation);

        System.out.println(" The valie of X is : " + solution.getX());
        System.out.println(" The value of Y is : " + solution.getY());
        System.out.println();
        System.out.println();

	}
    }
}
