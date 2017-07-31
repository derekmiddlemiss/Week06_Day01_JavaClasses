public class User{
  private String name;
  private int age;
  private boolean borrowingRights; 
  private Book[] loans;

  public User( String name, int age, boolean borrowingRights){
    this.name = name;
    this.age = age;
    this.borrowingRights = borrowingRights;
    this.loans = new Book[10];
  }

  public String getName(){
    return this.name;
  }

  public int getAge(){
    return this.age;
  }
  
  public boolean getBorrowingRights(){
    return this.borrowingRights;
  }

  public void setBorrowingRights( boolean value ){
    this.borrowingRights = value;
  }

  public int loanCount(){
    int count = 0;
    for ( Book book : this.loans ){
      if ( book != null ){
        count++;
      }
    }
    return count;
  }

  public boolean loanSlotAvailable(){
    return !( loanCount() == loans.length );
  }

  public boolean borrow( Book book ){
    if ( loanSlotAvailable() == false || getBorrowingRights() == false ){
      return false;
    }
    loans[ loanCount() ] = book;
    return true;
  }

}