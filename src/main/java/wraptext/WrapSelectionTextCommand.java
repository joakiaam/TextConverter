package wraptext;

/**
 * The `WrapSelectionTextCommand` class is responsible for wrapping the selected text
 * within the input text with the specified opening and ending strings.
 */
public class WrapSelectionTextCommand extends WrapTextCommand {
  private String selection;

  /**
   * Constructs a new `WrapSelectionTextCommand` with the specified opening, ending strings, and selection.
   *
   * @param opening the string to prepend to the selection
   * @param end the string to append to the selection
   * @param selection the text selection to be wrapped
   */
  public WrapSelectionTextCommand(String opening, String end, String selection) {
    super(opening, end);
    this.selection = selection;
  }

  /**
   * Executes the command to wrap the selected text within the input text with the specified opening and ending strings.
   *
   * @param text the input text to be processed
   * @return the modified text with the selection wrapped with the opening and ending strings
   */
  @Override
  public String execute(String text) {
    String[] parts = text.split(getSelection());
    StringBuilder wrappedSelectionBuilder = new StringBuilder();

    for (String part : parts) {
      wrappedSelectionBuilder.append(part).append(getOpening()).append(getSelection()).append(getEnd());
    }
    return wrappedSelectionBuilder.toString();
  }

  /**
   * Gets the text selection to be wrapped.
   *
   * @return the text selection
   */
  public String getSelection() {
    return selection;
  }
}