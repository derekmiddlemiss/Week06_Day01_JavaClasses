import static org.junit.Assert.assertEquals;
import org.junit.*;

public class UserBookTest{

  User byron;
  Book catcher;

  @Before
  public void before(){
    byron = new User( "Lord Byron", 22, true );
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
  public void userCanBorrowBooks(){
    assertEquals( true, byron.getBorrowingRights() );
  }

  @Test
  public void noLoansToStartWith(){
    assertEquals( 0, byron.loanCount() );
  }

  @Test
  public void loanSlotAvailable(){
    assertEquals( true, byron.loanSlotAvailable() );
  }

  @Test
  public void borrowBook(){
    byron.borrow( catcher );
    assertEquals( 1, byron.loanCount() );
  }

  @Test
  public void borrowNoMoreThanTen(){
    for ( int i = 0; i < 15; i++){
      byron.borrow( catcher );
    }
    assertEquals( 10, byron.loanCount() );
  }

  @Test
  public void cannotBorrowNoRights(){
    byron.setBorrowingRights( false );
    byron.borrow( catcher );
    assertEquals( 0, byron.loanCount() );
  }

}