package ex1;

public class CustomException {
  public void demoException(int age) throws InvalidAgeException{
    if (age<18) throw new InvalidAgeException("Invalid");
    else System.out.println("ok");
  }
}
