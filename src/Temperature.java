public class Temperature {

  /**
   * Converts temperature from Fahrenheit to Celsius degree.
   *
   * @param fahrenheit temperature degree in Fahrenheit
   * @return temperature degree in Celsius
   */
  public static double fahrenheitToCelsius(double fahrenheit) {
    return (fahrenheit - 32) * 5 / 9;
  }

  /**
   * Converts temperature from Celsius to Fahrenheit degree.
   *
   * @param celsius temperature degree in Celsius
   * @return temperature degree in Fahrenheit
   */
  public static double celsiusToFahrenheit(double celsius) {
    return (celsius * 9 / 5) + 32;
  }
}
