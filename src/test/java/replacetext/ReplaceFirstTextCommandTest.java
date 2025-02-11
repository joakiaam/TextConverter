package replacetext;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReplaceFirstTextCommandTest {
  ReplaceFirstTextCommand replaceFirstTextCommand;

  @Before
  public void Before() {
    // Arrange
    replaceFirstTextCommand = new ReplaceFirstTextCommand("target", "replacement");
  }

  @Test
  public void replaceFirstTextCommandTest() {
    // Act
    String result = replaceFirstTextCommand.execute("text with target and target");
    // Assert
    assertEquals("text with replacement and target", result);
  }
}
