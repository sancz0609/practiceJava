class StaticOuter{
  int a;      //member variable
  public void show(){         //member method

  }

  static class StaticInner{            //member class

    public void display(){
      System.out.println("Inner Display");
    }

  }
}


class StaticInnerClassDemo{
  public static void main(String args[]){

    StaticOuter obj = new StaticOuter();
    obj.show();

    StaticOuter.StaticInner obj1 = new StaticOuter.StaticInner();   //we dont need object here
    obj1.display();

  }
}
