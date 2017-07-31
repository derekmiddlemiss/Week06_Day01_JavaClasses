import static org.junit.Assert.assertEquals;
import org.junit.*;

public class UserTest{

  User byron;
  Book catcher;

  @Before
  public void before(){
    byron = new User( "Lord Byron", 22, false );
    catcher = new Book( "Catcher in the Rye" );
  }

  @Test
  public void bookHasTitle(){
    assertEquals( "Catcher in the Rye", catcher.getTitle() );
  }

}