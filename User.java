class User{
  private String name;
  private int age;
  private boolean overdues; 
  private Book[] loans;

  public User( String name, int age, boolean overdues){
    this.name = name;
    this.age = age;
    this.overdues = overdues;
    this.loans = new Book[10];
  }

  public String getName(){
    return this.name;
  }

  
  


}