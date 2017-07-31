import static org.junit.Assert.assertEquals;
import org.junit.*;

public class LibraryTest{

  User byron;
  User shelley;
  Book cuckoo;
  Book catch22;
  Library beatRomantics;

  @Before
  public void before(){
    byron = new User( "Lord Byron", 22, true );
    shelley = new User( "Percy Shelley", 24, true );
    cuckoo = new Book( "One Flew Over the Cuckoo's Nest" );
    catch22 = new Book( "Catch 22" );
    beatRomantics = new Library();
  }

  @Test
  public void usersEmptyAtConstruction(){
    assertEquals( 0, beatRomantics.usersCount() );
  }

  @Test
  public void stockEmptyAtConstruction(){
    assertEquals( 0, beatRomantics.stockCount() );
  }

  @Test
  public void stockSlotAvailable(){
    assertEquals( true, beatRomantics.stockSlotAvailable() );
  }

  @Test
  public void usersSlotAvailable(){
    assertEquals( true, beatRomantics.usersSlotAvailable() );
  }

  @Test
  public void addAUser(){
    beatRomantics.addUser( byron );
    assertEquals( 1, beatRomantics.usersCount() );
  }

  @Test
  public void addABook(){
    beatRomantics.addBook( cuckoo );
    assertEquals( 1, beatRomantics.stockCount() );
  }

}