package capitalizetext;

/**
 * The `CapitalizeSelectionTextCommand` class is responsible for capitalizing
 * the selected text within a given string.
 */
public class CapitalizeSelectionTextCommand extends CapitalizeTextCommand {
  private String selection;

  /**
   * Constructs a new `CapitalizeSelectionTextCommand` with the specified selection.
   *
   * @param selection the text selection to be capitalized
   */
  public CapitalizeSelectionTextCommand(String selection) {
    this.selection = selection;
  }

  /**
   * Executes the command to capitalize the selected text within the given string.
   *
   * @param text the input text in which the selection will be capitalized
   * @return the modified text with the selection capitalized
   */
  @Override
  public String execute(String text) {
    String[] parts = text.split(getSelection());
    StringBuilder capitalizedSelectionBuilder = new StringBuilder();

    for (String part : parts) {
      capitalizedSelectionBuilder.append(part).append(getSelection().toUpperCase());
    }

    return capitalizedSelectionBuilder.toString();
}

  /**
   * Gets the text selection to be capitalized.
   *
   * @return the text selection
   */
  public String getSelection() {
    return selection;
  }
}