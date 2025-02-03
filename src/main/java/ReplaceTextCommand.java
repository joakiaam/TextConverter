/**
 * The ReplaceTextCommand class implements the TextCommand interface
 * and provides functionality to replace occurrences of a target string
 * with a replacement string in a given text.
 */
public class ReplaceTextCommand implements TextCommand {
  protected String target;
  protected String replacement;

  /**
   * Constructs a ReplaceTextCommand with the specified target and replacement strings.
   *
   * @param target the string to be replaced
   * @param replacement the string to replace the target with
   */
  public ReplaceTextCommand(String target, String replacement) {
    this.target = target;
    this.replacement = replacement;
  }

  /**
   * Executes the replace command on the given text.
   *
   * @param text the text in which to replace occurrences of the target string
   * @return the text with the target string replaced by the replacement string
   */
  @Override
  public String execute(String text) {
    return text.replace(getTarget(), getReplacement());
  }

  /**
   * Returns the target string to be replaced.
   *
   * @return the target string
   */
  public String getTarget() {
    return target;
  }

  /**
   * Returns the replacement string.
   *
   * @return the replacement string
   */
  public String getReplacement() {
    return replacement;
  }
}
