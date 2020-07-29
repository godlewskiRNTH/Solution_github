class Main {
  public static void main(String[] args) {
    //This is a solution to a problem
    int cases = 1000;
    int count = 0;
    for(int x = 1; x < cases; x++)
    {
      if(x % 3 == 0 || x % 5 == 0)
      {
        count = count + x;
      }
    }
    System.out.println("The sum of all integers under " + cases + " and divisible by 3 or 5 is: " + count);
  }
  //check out this version change
}