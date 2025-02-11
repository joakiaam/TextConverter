package utility;

import capitalizetext.CapitalizeSelectionTextCommand;
import org.junit.Before;
import org.junit.Test;
import replacetext.ReplaceTextCommand;
import wraptext.WrapLinesTextCommand;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class ScriptTest {
  private Script script;

  @Before
  public void Before() {
    script = new Script(List.of(new WrapLinesTextCommand("<p>", "</p>"),
        new CapitalizeSelectionTextCommand("selection"),
        new ReplaceTextCommand("new", "old")));
  }

  @Test
  public void scriptTest() {
    String result = script.execute("A text with a selection.\nAnd a new line.");

    assertEquals("<p>A text with a Selection.</p>\n<p>And a old line.</p>",
        result);
  }
}
