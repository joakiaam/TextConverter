package replacetext;

/**
 * The replacetext.ReplaceFirstTextCommand class extends the replacetext.ReplaceTextCommand class
 * and provides functionality to replace the first occurrence of a target
 * string with a replacement string in a given text.
 */
public class ReplaceFirstTextCommand extends ReplaceTextCommand {

  /**
   * Constructs a new replacetext.ReplaceFirstTextCommand with the specified target and replacement strings.
   *
   * @param target the string to be replaced
   * @param replacement the string to replace the target with
   */
  public ReplaceFirstTextCommand(String target, String replacement) {
    super(target, replacement);
  }

  /**
   * Executes the replace first command on the given text.
   * Replaces the first occurrence of the target string with the replacement string.
   *
   * @param text the text in which the replacement is to be made
   * @return the text with the first occurrence of the target string replaced by the replacement string
   */
  @Override
  public String execute(String text) {
    return text.replaceFirst(getTarget(), getReplacement());
  }
}