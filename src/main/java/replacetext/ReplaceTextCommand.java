package replacetext;

import utility.TextCommand;

/**
 * The replacetext.ReplaceTextCommand class implements the utility.TextCommand interface
 * and provides functionality to replace occurrences of a target string
 * with a replacement string in a given text.
 */
public class ReplaceTextCommand implements TextCommand {
  protected String target;
  protected String replacement;

  /**
   * Constructs a replacetext.ReplaceTextCommand with the specified target and replacement strings.
   *
   * @param target the string to be replaced
   * @param replacement the string to replace the target with
   */
  public ReplaceTextCommand(String target, String replacement) {
    setTarget(target);
    setReplacement(replacement);
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
 * Sets the target string to be replaced.
 *
 * @param target the string to be replaced
 * @throws IllegalArgumentException if the target is null or empty
 */
public void setTarget(String target) {
  if (target == null || target.isEmpty()) {
    throw new IllegalArgumentException("NULL");
  }
  this.target = target;
}

/**
 * Sets the replacement string.
 *
 * @param replacement the string to replace the target with
 * @throws IllegalArgumentException if the replacement is null or empty
 */
public void setReplacement(String replacement) {
  if (replacement == null || replacement.isEmpty()) {
    throw new IllegalArgumentException("NULL");
  }
  this.replacement = replacement;
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
