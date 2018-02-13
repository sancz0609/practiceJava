class Calculator{
  int num1;       //by default value here is 0
  int num2;       //by default value here is 0
  int result;     //by default value here is 0

  public void perform(){      //public is access specifier and void is the return type
      result = num1 + num2;
  }
}


class ObjectDemo{
  public static void main(String args[]){

    Calculator obj;       //reference
    obj = new Calculator();   //how much memory you will need is defined by constructor

    /*
    Calculator obj = new Calculator;
    */
    obj.num1 = 5;
    obj.num2 = 10;

    obj.perform();

    System.out.println(obj.result);
  }
}
