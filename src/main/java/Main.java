import replacetext.ReplaceFirstTextCommand;
import replacetext.ReplaceTextCommand;
import wraptext.WrapLinesTextCommand;
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
  }
}
