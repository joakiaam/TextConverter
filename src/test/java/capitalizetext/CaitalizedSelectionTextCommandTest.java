package capitalizetext;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CaitalizedSelectionTextCommandTest {
  private CapitalizeSelectionTextCommand capitalizeSelection;

  @Before
  public void Before() {
    capitalizeSelection = new CapitalizeSelectionTextCommand("selection");
  }

  @Test
  public void capitalizeSelectionTest() {
    String result = capitalizeSelection.execute("text with selection and another selection");

    assertEquals("text with Selection and another Selection", result);
  }

  @Test
  public void getSelectionTest() {
    assertEquals("selection", capitalizeSelection.getSelection());
  }
}
