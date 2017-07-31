import static org.junit.Assert.assertEquals;
import org.junit.*;

public class LibraryTest{

  User byron;
  User shelley;
  Book catcher;
  Book catch22;
  Library romantics;

  @Before
  public void before(){
    byron = new User( "Lord Byron", 22, false );
    shelley = new User( "Percy Shelley", 24, true );
    catcher = new Book( "Catcher in the Rye" );
    catch22 = new Book( "Catch 22" );
    romantics = new Library();
  }

  @Test
  public void usersEmptyAtConstruction(){
    assertEquals( 0, romantics.usersCount() );
  }

  @Test
  public void stockEmptyAtConstruction(){
    assertEquals( 0, romantics.stockCount() );
  }

  @Test
  public void stockSlotAvailable(){
    assertEquals( true, romantics.stockSlotAvailable() );
  }

  @Test
  public void usersSlotAvailable(){
    assertEquals( true, romantics.usersSlotAvailable() );
  }

}