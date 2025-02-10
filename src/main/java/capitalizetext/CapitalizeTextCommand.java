package capitalizetext;

import utility.TextCommand;

/**
 * The `CapitalizeTextCommand` class is responsible for capitalizing
 * the entire input text.
 */
public class CapitalizeTextCommand implements TextCommand {

  /**
   * Executes the command to capitalize the entire input text.
   *
   * @param text the input text to be capitalized
   * @return the modified text with all characters capitalized
   */
  @Override
  public String execute(String text) {
    String capitalized = text.toUpperCase();
    return TextCommand.super.execute(capitalized);
  }
}