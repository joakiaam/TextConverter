package utility;

import java.util.List;

/**
 * The Script class represents a sequence of text commands that can be executed on a given text.
 */
public class Script {
  private List<TextCommand> textCommand;

  /**
   * Constructs a Script with the specified list of text commands.
   *
   * @param textCommand the list of text commands to be executed
   */
  public Script(List<TextCommand> textCommand) {
    this.textCommand = textCommand;
  }

  /**
   * Executes the sequence of text commands on the given text.
   *
   * @param text the text to be processed by the text commands
   * @return the processed text after all commands have been executed
   */
  public String execute(String text) {
    for (TextCommand command : textCommand) {
      text = command.execute(text);
    }
    return text.trim();
  }
}