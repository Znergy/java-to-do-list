import org.junit.*;
import static org.junit.Assert.*;

public class ToDoTest {

  // testing constructor
  @Test
  public void ToDo_instantiatesCorrectly_true() {
    ToDo myTask = new ToDo("Mow the lawn");
    assertEquals(true, myTask instanceof ToDo);
  }
  // test description getter
  @Test
  public void ToDo_instantiatesWithDescription_String() {
    ToDo myTask = new ToDo("Mow the lawn");
    assertEquals("Mow the lawn", myTask.getDescription());
  }
  
}
