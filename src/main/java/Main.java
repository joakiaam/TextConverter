import replacetext.ReplaceFirstTextCommand;
import replacetext.ReplaceTextCommand;
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

    String wrapped = new WrapTextCommand("#", "#")
        .execute("text to be wrapped");

    System.out.println("##### Wrap the text #####");
    System.out.println(wrapped);
    System.out.println(" ");
  }
}
