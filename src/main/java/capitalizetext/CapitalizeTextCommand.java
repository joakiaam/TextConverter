package capitalizetext;

import utility.TextCommand;

public class CapitalizeTextCommand implements TextCommand {

  @Override
  public String execute(String text) {
    String capitalized = text.toUpperCase();
    return TextCommand.super.execute(capitalized);
  }
}