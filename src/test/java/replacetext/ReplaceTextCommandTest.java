package replacetext;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;


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
  public void setTargetPositiveTest() {
    replaceAll.setTarget("test");
    assertEquals("test", replaceAll.getTarget());
  }

  @Test
  public void setTargetNegativeTest() {
    Exception error = assertThrows(IllegalArgumentException.class, () ->
        replaceAll.setTarget(""));
    assertEquals("NULL" , error.getMessage());
  }

  @Test
  public void setReplacementPositiveTest() {
    replaceAll.setReplacement("test");
    assertEquals("test", replaceAll.getReplacement());
  }

  @Test
  public void setReplacementNegativeTest() {
    Exception error2 = assertThrows(IllegalArgumentException.class, () ->
        replaceAll.setReplacement(""));
    assertEquals("NULL" , error2.getMessage());
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
