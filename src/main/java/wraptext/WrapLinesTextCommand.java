package wraptext;

/**
 * The `WrapLinesTextCommand` class is responsible for wrapping each line of the input text
 * with the specified opening and ending strings.
 */
public class WrapLinesTextCommand extends WrapTextCommand {

  /**
   * Constructs a new `WrapLinesTextCommand` with the specified opening and ending strings.
   *
   * @param opening the string to prepend to each line
   * @param end the string to append to each line
   */
  public WrapLinesTextCommand(String opening, String end) {
    super(opening, end);
  }

  /**
   * Executes the command to wrap each line of the input text with the specified opening and ending strings.
   *
   * @param text the input text to be processed
   * @return the modified text with each line wrapped with the opening and ending strings
   */
  @Override
  public String execute(String text) {
    String[] parts = text.split("\n");
    StringBuilder wrappedLinesBuilder = new StringBuilder();

    for (String part : parts) {
      wrappedLinesBuilder.append(super.execute(part)).append("\n");
    }
    return wrappedLinesBuilder.toString().trim();
  }
}