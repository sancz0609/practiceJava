class PreIncrementExample{
  public static void main(String args[]){
    int m = 4;
    int n = 5;

    m = ++n; //pre increment -> first it will increment (make n = 6) then it will assign the value(make m equal to n -> 6)

    System.out.println(m); //6
    System.out.println(n); //6
  }
}
