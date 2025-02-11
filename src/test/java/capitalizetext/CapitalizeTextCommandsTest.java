package capitalizetext;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CapitalizeTextCommandsTest {
  private CapitalizeTextCommand capitalizeTextCommand;

  @Before
  public void Before() {
    capitalizeTextCommand = new CapitalizeTextCommand();
  }

  @Test
  public void capitalizeTextTest() {
    String result = capitalizeTextCommand.execute("text to be capitalized");

    assertEquals("Text to be capitalized", result);
  }
}
