package capitalizetext;

public class CapitalizeSelectionTextCommand extends CapitalizeTextCommand {
  private String selection;
  private String nyText = "";

  public CapitalizeSelectionTextCommand(String selection) {
    this.selection = selection;
  }

  @Override
  public String execute(String text) {
    String[] parts = text.split(getSelection());

    for (String part : parts) {
      nyText += part + getSelection().toUpperCase();
    }
    return nyText;
  }

  public String getSelection() {
    return selection;
  }
}
