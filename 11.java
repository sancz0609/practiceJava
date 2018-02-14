class Outer{
  int a;      //member variable
  public void show(){         //member method

  }

  class Inner{            //member class

    public void display(){
      System.out.println("Inner Display");
    }

  }
}


class InnerClassDemo{
  public static void main(String args[]){

    Outer obj = new Outer();
    obj.show();

    Outer.Inner obj1 = obj.new Inner();
    obj1.display();


  }
}
