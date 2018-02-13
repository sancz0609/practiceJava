class PostIncrementExample{
  public static void main(String args[]){
    int m = 4;
    int n = 5;

    m = n++; //post increment -> first it will assign the value (make m equal to n -> 5) then it will increment(make n 6)

    System.out.println(m); //5
    System.out.println(n); //6
  }
}
