package wraptext;

import utility.TextCommand;

/**
 * The wraptext.WrapTextCommand class implements the utility.TextCommand interface and is used to wrap a given text
 * with specified opening and ending strings.
 */
public class WrapTextCommand implements TextCommand {
  protected String opening;
  protected String end;

  /**
   * Constructs a new wraptext.WrapTextCommand with the specified opening and ending strings.
   *
   * @param opening the string to be added at the beginning of the text
   * @param end the string to be added at the end of the text
   */
  public WrapTextCommand(String opening, String end) {
    this.opening = opening;
    this.end = end;
  }

  /**
   * Executes the command by wrapping the given text with the opening and ending strings.
   *
   * @param text the text to be wrapped
   * @return the wrapped text
   */
  @Override
  public String execute(String text) {
    return getOpening() + text + getEnd();
  }

  /**
   * Returns the opening string.
   *
   * @return the opening string
   */
  public String getOpening() {
    return opening;
  }

  /**
   * Returns the ending string.
   *
   * @return the ending string
   */
  public String getEnd() {
    return end;
  }
}