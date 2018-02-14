//Single level inheritence

class Calc{                                      //super-java/parent-oops/base-c++ class
  public int add(int i,int j)
  {
    return i+j;
  }
}

class CalcAdv extends Calc{               //Sub/child/derived Class

  public int sub(int i,int j)
  {
    return i-j;
  }
}

class Inheritance{
  public static void main(String args[]){

    CalcAdv c1 = new CalcAdv();
    int result1 = c1.add(2,3);
    int result2 = c1.sub(3,2);

    System.out.println(result1);
    System.out.println(result2);
  }
}
