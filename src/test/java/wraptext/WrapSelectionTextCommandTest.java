package wraptext;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WrapSelectionTextCommandTest {
  private WrapSelectionTextCommand wrappedSelection;

  @Before
  public void Before() {
    wrappedSelection = new WrapSelectionTextCommand("<p>", "</p>", "selection");
  }

  @Test
  public void wrapSelection() {
    String result = wrappedSelection.execute("text with selection");

    assertEquals("text with <p>selection</p>", result);
  }

  @Test
  public void getSelectionTest() {
    assertEquals("selection", wrappedSelection.getSelection());
  }
}
