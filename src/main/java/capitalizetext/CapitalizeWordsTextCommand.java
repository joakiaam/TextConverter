package capitalizetext;

/**
 * The `CapitalizeWordsTextCommand` class is responsible for capitalizing
 * the first letter of each word in the input text.
 */
public class CapitalizeWordsTextCommand extends CapitalizeTextCommand {

  /**
   * Executes the command to capitalize the first letter of each word in the input text.
   *
   * @param text the input text to be processed
   * @return the modified text with the first letter of each word capitalized
   */
  @Override
  public String execute(String text) {
    String[] words = text.split(" ");
    StringBuilder capitalizedWordsBuilder = new StringBuilder();

    for (String word : words) {
      capitalizedWordsBuilder.append(word.substring(0, 1).toUpperCase()).append(word.substring(1)).append(" ");
    }
    return capitalizedWordsBuilder.toString();
  }
}