package ex11;

public class Management {

  public Management() {
  }

  public ComplexNumber enterComplexNumber(double real, double imaginary) {
    return new ComplexNumber(real, imaginary);
  }

  public void display(ComplexNumber complexNumber) {
    System.out.println(complexNumber);
  }

  public void addComplexNumber(ComplexNumber complexNumber1, ComplexNumber complexNumber2) {
    double realPart = complexNumber1.getRealPart() + complexNumber2.getRealPart();
    double imaginaryPart = complexNumber1.getImaginaryPart() + complexNumber2.getImaginaryPart();
    ComplexNumber complexNumber = new ComplexNumber(realPart, imaginaryPart);
    System.out.println(complexNumber);
  }

  public void multipleComplexNumber(ComplexNumber c1, ComplexNumber c2) {
    // (a + ib) (c + id) = (ac - bd) + i(ad + bc)
    double real = (c1.getRealPart() * c2.getRealPart()) - (c1.getImaginaryPart() * c2.getImaginaryPart());
    double imaginary = (c1.getRealPart() * c2.getImaginaryPart()) + (c1.getImaginaryPart() * c2.getRealPart());
    ComplexNumber complexNumber = new ComplexNumber(real, imaginary);
    System.out.println(complexNumber);
  }
}
