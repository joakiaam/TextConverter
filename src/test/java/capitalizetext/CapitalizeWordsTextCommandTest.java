package capitalizetext;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CapitalizeWordsTextCommandTest {
  private CapitalizeWordsTextCommand capitalizeWordsTextCommand;

  @Before
  public void Before() {
    capitalizeWordsTextCommand = new CapitalizeWordsTextCommand();
  }

  @Test
  public void capitalizeWordsTest() {
    String result = capitalizeWordsTextCommand.execute("text to be capitalized");

    assertEquals("Text To Be Capitalized", result);
  }
}
