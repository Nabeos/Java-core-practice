package ex14.validator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import ex14.exception.InvalidDOBException;
import ex14.exception.InvalidException;
import ex14.exception.InvalidFullNameException;
import ex14.exception.InvalidPhoneNumberException;

public class Validator {
  private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

  public static String doBCheck(String text) throws IOException, InvalidDOBException {
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    Date now = new Date();
    dateFormat.setLenient(false);
    while (true) {
      try {
        String date = in.readLine();
        Date dob = dateFormat.parse(date);
        // check current date
        if (dob.compareTo(dateFormat.parse(dateFormat.format(now))) > 0)
          throw new InvalidDOBException("wrong");
        return date;
      } catch (ParseException | InvalidDOBException e) {
        System.out.println(text);
      }
    }
  }

  public static String fullNameCheck(String error) {
    while (true) {
      try {
        String name = in.readLine();
        if (name.length() < 10 || name.length() > 50)
          throw new InvalidFullNameException("Error");
        return name;
      } catch (IOException | InvalidFullNameException e) {
        System.out.println(error);
      }
    }
  }

  public static String phoneCheck(String error) {
    while (true) {
      try {
        String phone = in.readLine();
        phone = phone.replaceAll("\\s+", "");
        if (phone.trim().length() == 10 && phone.startsWith("090") || phone.startsWith("091")
            || phone.startsWith("098") || phone.startsWith("031") || phone.startsWith("035")
            || phone.startsWith("038")) {
          return phone;
        } else
          throw new InvalidPhoneNumberException("error");
      } catch (IOException | InvalidPhoneNumberException e) {
        System.out.println(error);
      }
    }
  }

  public static String stringCheck() {
    while (true) {
      try {
        String content = in.readLine();
        if (content.isBlank() || content == null)
          throw new InvalidException();
        return content;
      } catch (IOException | InvalidException e) {
        System.out.println("Input files have unknown errors !!!");
      }
    }
  }

  public static int numberCheck() {
    while (true) {
      try {
        int content = Integer.parseInt(in.readLine());
        return content;
      } catch (IOException | NumberFormatException e) {
        System.out.println("Input files have unknown errors !!!");
      }
    }
  }

  public static String genderCheck() {
    while (true) {
      try {
        String content = in.readLine();
        if ((!content.isBlank() || content != null) && content.equalsIgnoreCase("nam") || content.equalsIgnoreCase("nu")
            || content.equalsIgnoreCase("male") || content.equalsIgnoreCase("female")) {
          return content;
        }
        throw new InvalidException();
      } catch (IOException | InvalidException e) {
        System.out.println("Input files have unknown errors !!!");
      }
    }
  }
}
