public class ReplaceTextCommand implements TextCommand {
  protected String target;
  protected String replacement;

  public ReplaceTextCommand(String target, String replacement) {
    this.target = target;
    this.replacement = replacement;
  }

  public String execute(String text) {
    return text.replace(getTarget(), getReplacement());
  }

  public String getTarget() {
    return target;
  }

  public String getReplacement() {
    return replacement;
  }
}
