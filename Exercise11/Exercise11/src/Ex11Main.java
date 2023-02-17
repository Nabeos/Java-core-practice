import java.util.Scanner;

import ex11.ComplexNumber;
import ex11.Management;

public class Ex11Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Management management = new Management();
        ComplexNumber complexNumber = null;
        System.out.println("Enter 1: Enter a complex number");
        System.out.println("Enter 2: Display");
        System.out.println("Enter 3: Add 2 Complex Number");
        System.out.println("Enter 4: Multiply 2 Complex Number");
        System.out.println("Enter 5: Out");
        int option = Integer.parseInt(scanner.nextLine());
        switch (option) {
            case 1: {
                System.out.println("Complex Number 1: real part");
                double real1 = Double.parseDouble(scanner.nextLine());
                System.out.println("imaginary part: ");
                double ima1 = Double.parseDouble(scanner.nextLine());
                complexNumber = new ComplexNumber(real1, ima1);
                break;
            }
            case 2:
                management.display(complexNumber);
                break;
            case 3: {
                System.out.println("Complex Number 1: real part");
                double real1 = Double.parseDouble(scanner.nextLine());
                System.out.println("imaginary part: ");
                double ima1 = Double.parseDouble(scanner.nextLine());
                ComplexNumber complexNumber1 = new ComplexNumber(real1, ima1);
                System.out.println("Complex Number 2: real part");
                double real2 = Double.parseDouble(scanner.nextLine());
                System.out.println("imaginary part: ");
                double ima2 = Double.parseDouble(scanner.nextLine());
                ComplexNumber complexNumber2 = new ComplexNumber(real2, ima2);
                management.addComplexNumber(complexNumber1, complexNumber2);
                break;
            }
            case 4: {
                System.out.println("Complex Number 1: real part");
                double real1 = Double.parseDouble(scanner.nextLine());
                System.out.println("imaginary part: ");
                double ima1 = Double.parseDouble(scanner.nextLine());
                ComplexNumber complexNumber1 = new ComplexNumber(real1, ima1);
                System.out.println("Complex Number 2: real part");
                double real2 = Double.parseDouble(scanner.nextLine());
                System.out.println("imaginary part: ");
                double ima2 = Double.parseDouble(scanner.nextLine());
                ComplexNumber complexNumber2 = new ComplexNumber(real2, ima2);
                management.multipleComplexNumber(complexNumber1, complexNumber2);
                break;
            }
            case 5:
                return;
        }
    }
}
