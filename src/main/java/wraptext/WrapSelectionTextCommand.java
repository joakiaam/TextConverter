package wraptext;

public class WrapSelectionTextCommand extends WrapTextCommand {
  private String selection;
  private String nyText = "";

  public WrapSelectionTextCommand(String opening, String end, String selection) {
    super(opening, end);
    this.selection = selection;
  }

  @Override
  public String execute(String text) {
    String[] parts = text.split(getSelection());

    for (String part : parts) {
      nyText += part + getOpening() + getSelection() + getEnd();
    }
    return nyText;
  }

  public String getSelection() {
    return selection;
  }
}
