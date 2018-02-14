class Abc{
  public int add(int ... i){    //1,2,3,4,5
    int sum = 0;
    for(int j : i){
      sum = sum + j;
    }
    return sum;
  }
}


class VarargsDemo{
  public static void main(String args[]){
      Abc obj = new Abc();
      System.out.println(obj.add(1,2,3,4,5));
  }
}
