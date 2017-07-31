class Library{
  private User[] users;
  private Book[] stock;

  public Library(){
    this.users = new User[10];
    this.stock = new Book[10];
  }
 
  public int stockCount(){
    int count = 0;
    for ( Book book : this.stock ){
      if ( book != null ){
        count++;
      }
    }
    return count;
  }

  public int usersCount(){
    int count = 0;
    for ( User user : this.users ){
      if ( user != null ){
        count++;
      }
    }
    return count;
  }

  public boolean stockSlotAvailable(){
    return !( stockCount() == stock.length );
  }

  public boolean usersSlotAvailable(){
    return !( usersCount() == users.length );
  }

  public void addUser( User user ){
    if ( usersSlotAvailable() == false ) {
      return;
    }
    users[ usersCount() ] = user;
  }

  public void addBook( Book book ){
    if ( stockSlotAvailable() == false ) {
      return;
    }
    stock[ stockCount() ] = book;
  }

  public void deleteBook( Book searchBook){
    int position = 0;
    boolean found = false;
    for ( Book book : this.stock ){

      if ( book == searchBook ){
        found = true;
      }

      if ( found == true && position < stock.length - 1 ){
        stock[ position ] = stock[ position + 1 ];
      }

      position++;

    }
  }

  public boolean userInUsers( User searchUser){
    for ( User user : this.users ){
      if ( user == searchUser){
        return true;
      }
    }
    return false;
  }

  public void lendBook( User user, Book book ){

    // System.out.println("Got to 1");

    if ( this.userInUsers( user ) ){

      // System.out.println("Got to 2");

      boolean borrowed;
      borrowed = user.borrow( book );

      if ( borrowed ){
        this.deleteBook( book );
      }

    }
  }

}

