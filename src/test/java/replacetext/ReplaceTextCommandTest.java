package replacetext;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ReplaceTextCommandTest {
  static ReplaceTextCommand replaceAll;

  @Before
  public void before() {
    // Arrange
    replaceAll = new ReplaceTextCommand("target", "replacement");
  }

  @Test
  public void replaceTextTest() {
    // Act
    String result = replaceAll.execute("text with target and target");
    // Assert
    assertEquals("text with replacement and replacement", result);
  }

  @Test
  public void getTargetTest() {
    assertEquals("target", replaceAll.getTarget());
  }

  @Test
  public void getReplacementTest() {
    assertEquals("replacement", replaceAll.getReplacement());
  }

}
