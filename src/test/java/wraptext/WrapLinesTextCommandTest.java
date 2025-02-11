package wraptext;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WrapLinesTextCommandTest {
  private WrapLinesTextCommand wrappedLines;

  @Before
  public void Before() {
    wrappedLines = new WrapLinesTextCommand("<p>", "</p>");
  }

  @Test
  public void wrappedLinesTest() {
    String result = wrappedLines.execute("first line\nsecond line");

    assertEquals("<p>first line</p>\n<p>second line</p>", result);
  }
}
