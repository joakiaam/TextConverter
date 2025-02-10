package capitalizetext;

/**
 * The `CapitalizeWordsTextCommand` class is responsible for capitalizing
 * the first letter of each word in the input text.
 */
public class CapitalizeWordsTextCommand extends CapitalizeTextCommand {
  private String capitalizedWords = "";

  /**
   * Executes the command to capitalize the first letter of each word in the input text.
   *
   * @param text the input text to be processed
   * @return the modified text with the first letter of each word capitalized
   */
  @Override
  public String execute(String text) {
    String[] words = text.split(" ");

    for (String word : words) {
      capitalizedWords += word.substring(0, 1).toUpperCase() + word.substring(1) + " ";
    }
    return capitalizedWords;
  }
}