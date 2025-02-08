import capitalizetext.CapitalizeTextCommand;
import capitalizetext.CapitalizeWordsTextCommand;
import replacetext.ReplaceFirstTextCommand;
import replacetext.ReplaceTextCommand;
import wraptext.WrapLinesTextCommand;
import wraptext.WrapSelectionTextCommand;
import wraptext.WrapTextCommand;

public class Main {
  public static void main(String[] args) {
    String replaceAll = new ReplaceTextCommand("target", "replacement")
        .execute("text with target and target");

    System.out.println("##### Replace all target words #####");
    System.out.println(replaceAll);
    System.out.println(" ");

    String replaceFirst = new ReplaceFirstTextCommand("target", "replacement")
        .execute("text with target and target");

    System.out.println("##### Replace first target word #####");
    System.out.println(replaceFirst);
    System.out.println(" ");

    // Wrap the enitre text
    System.out.println("##### Wrap the text #####");
    String wrapped = new WrapTextCommand("#", "#")
        .execute("text to be wrapped");

    System.out.println(wrapped);
    System.out.println(" ");


    // Wrap each line in text
    System.out.println("##### Wrap each line #####");
    String lineWrapped = new WrapLinesTextCommand("<p>", "</p>")
        .execute("1. This is the first line.\n2. This is the second line.\n3. This is the third line.");

    System.out.println(lineWrapped);
    System.out.println(" ");

    // Wrap selection
    System.out.println("##### Wrap selection #####");
    String selectionWrap = new WrapSelectionTextCommand("<p>", "</p>", "selection")
        .execute("text with selection, it also has another selection");
    System.out.println(selectionWrap);
    System.out.println(" ");

    // Capitalize entire text
    System.out.println("##### Capitalize all text #####");
    String capitalizeEntireText = new CapitalizeTextCommand()
        .execute("this should be uppercase");
    System.out.println(capitalizeEntireText);
    System.out.println(" ");

    // Capitalize each word
    System.out.println("##### Capitalize first letter of each word #####");
    String capitalizeEachWord = new CapitalizeWordsTextCommand()
        .execute("first letter of the word should be capitalized");
    System.out.println(capitalizeEachWord);
    System.out.println(" ");
  }
}
