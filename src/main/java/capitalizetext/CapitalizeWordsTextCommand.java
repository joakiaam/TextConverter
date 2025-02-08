package capitalizetext;

public class CapitalizeWordsTextCommand extends CapitalizeTextCommand {
  private String capitalizedWords = "";

  @Override
  public String execute(String text) {
    String[] words = text.split(" ");

    for (String word : words) {
      capitalizedWords += word.substring(0, 1).toUpperCase() + word.substring(1) + " ";
    }
    return capitalizedWords;
  }
}