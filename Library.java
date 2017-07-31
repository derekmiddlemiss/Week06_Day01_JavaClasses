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

}

