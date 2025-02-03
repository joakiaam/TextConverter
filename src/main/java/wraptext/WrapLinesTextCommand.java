package wraptext;

public class WrapLinesTextCommand extends WrapTextCommand {

  public WrapLinesTextCommand(String opening, String end) {
    super(opening, end);
  }
  @Override
  public String execute(String text) {
    return text;
  }
}
