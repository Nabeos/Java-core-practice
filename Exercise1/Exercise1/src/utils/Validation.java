package utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
  private static final String STRING_REGEX = "^";
  public static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

  public static String validateString() {
    String str;
    try {
      str = bf.readLine();
      Matcher matcher = Pattern.compile(STRING_REGEX).matcher(str);
      if (matcher.matches())
        return str;
    } catch (IOException e) {
      e.printStackTrace();
    }
    return "Error while input";
  }

  public static String validateGender() {
    String str;
    try {
      str = bf.readLine();
      if (str.equalsIgnoreCase("nam") || str.equalsIgnoreCase("nu")
          || str.equalsIgnoreCase("khac"))
        return str;
    } catch (IOException e) {
      e.printStackTrace();
    }
    return "Error while input";
  }

  public static int validateNumber() {
    int age;
    try {
      age = Integer.parseInt(bf.readLine());
      return age;
    } catch (NumberFormatException | IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    return 0;
  }
}
