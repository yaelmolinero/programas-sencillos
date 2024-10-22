package utils;

public class PicoColors {
  private static final String RESET = "\u001b[0m";
  private static final String BLACK = "\u001b[30m";
  private static final String RED = "\u001b[31m";
  private static final String GREEN = "\u001b[32m";
  private static final String YELLOW = "\u001b[33m";
  private static final String BLUE = "\u001b[34m";
  private static final String MAGENTA = "\u001b[35m";
  private static final String CYAN = "\u001b[36m";

  public static String black(String text) {
    return BLACK + text + RESET;
  }
  public static String red(String text) {
    return RED + text + RESET;
  }
  public static String green(String text) {
    return GREEN + text + RESET;
  }
  public static String yellow(String text) {
    return YELLOW + text + RESET;
  }
  public static String blue(String text) {
    return BLUE + text + RESET;
  }
  public static String magenta(String text) {
    return MAGENTA + text + RESET;
  }
  public static String cyan(String text) {
    return CYAN + text + RESET;
  }

  public static String rgb(String text, int red, int green, int blue) {
    return "[38:2;{" + red + "};{" + green + "};{" + blue + "}m" + text + RESET;
  }
}
