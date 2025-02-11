package wraptext;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WrapTextCommandTest {
  private WrapTextCommand wrappedText;

  @Before
  public void Before() {
    // Arrange
    wrappedText = new WrapTextCommand("<p>", "</p>");
  }

  @Test
  public void wrapTextTest() {
    // Act
    String result = wrappedText.execute("text to be wrapped");
    // Assert
    assertEquals("<p>text to be wrapped</p>", result);
  }

  @Test
  public void getOpeningTest() {
    assertEquals("<p>", wrappedText.getOpening());
  }

  @Test
  public void getEndingTest() {
    assertEquals("</p>", wrappedText.getEnd());
  }
}
