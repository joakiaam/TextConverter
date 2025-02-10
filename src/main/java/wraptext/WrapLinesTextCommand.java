package wraptext;

public class WrapLinesTextCommand extends WrapTextCommand {
  private String nyText = "";

  public WrapLinesTextCommand(String opening, String end) {
    super(opening, end);
  }

  @Override
  public String execute(String text) {
    String[] parts = text.split("\n");

    for (String part : parts) {
      nyText += getOpening() + part + getEnd() + "\n";
    }
    return nyText;
  }
}
