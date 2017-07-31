import static org.junit.Assert.assertEquals;
import org.junit.*;

public class UserBookTest{

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

  @Test
  public void userHasName(){
    assertEquals( "Lord Byron", byron.getName() );
  }

  @Test
  public void userHasAge(){
    assertEquals( 22, byron.getAge() );
  }

  @Test
  public void userCannotBorrowBooks(){
    assertEquals( false, byron.getBorrowingRights() );
  }

  @Test
  public void noLoansToStartWith(){
    assertEquals( 0, byron.loanCount() );
  }

}