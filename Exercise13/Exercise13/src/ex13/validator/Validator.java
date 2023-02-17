package ex13.validator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import ex13.exception.BirthdayException;
import ex13.exception.EmailException;
import ex13.exception.FullNameException;
import ex13.exception.PhoneException;

public class Validator {
  private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

  private final static String BIRTHDAY = "(0[1-9]|1[0-9]|2[0-9]|3[01]).(0[1-9]|1[012]).([19, 20]{2})?([0-9]{2})";
  private final static String EMAIL = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
  private final static String PHONE = "(84|0[3|5|7|8|9])+([0-9]{8})\\b";
  private final static String FULLNAME = "^[a-zA-Z]+(([',. -][a-zA-Z ])?[a-zA-Z]*)*$";

  public static String birthDayCheck(String text) throws BirthdayException, IOException {
    while (true) {
      try {
        Pattern pattern = Pattern.compile(BIRTHDAY);
        String cont = in.readLine();
        Matcher matcher = pattern.matcher(cont);
        if (cont == null || cont.equals("") || !matcher.matches())
          throw new BirthdayException("Error");
        else
          return cont;
      } catch (BirthdayException e) {
        System.out.println(text);
      }
    }
  }

  public static String nameCheck(String text) throws FullNameException, IOException {
    while (true) {
      try {
        Pattern pattern = Pattern.compile(FULLNAME);
        String cont = in.readLine();
        Matcher matcher = pattern.matcher(cont);
        if (cont == null || cont.equals("") || !matcher.matches())
          throw new BirthdayException("Error");
        else
          return cont;
      } catch (BirthdayException e) {
        System.out.println(text);
      }
    }
  }

  public static String phoneCheck(String text) throws PhoneException, IOException {
    while (true) {
      try {
        Pattern pattern = Pattern.compile(PHONE);
        String cont = in.readLine();
        Matcher matcher = pattern.matcher(cont);
        if (cont == null || cont.equals("") || !matcher.matches())
          throw new BirthdayException("Error");
        else
          return cont;
      } catch (BirthdayException e) {
        System.out.println(text);
      }
    }
  }

  public static String emailCheck(String text) throws EmailException, IOException {
    while (true) {
      try {
        Pattern pattern = Pattern.compile(EMAIL);
        String cont = in.readLine();
        Matcher matcher = pattern.matcher(cont);
        if (cont == null || cont.equals("") || !matcher.matches())
          throw new BirthdayException("Error");
        else
          return cont;
      } catch (BirthdayException e) {
        System.out.println(text);
      }
    }
  }
}
