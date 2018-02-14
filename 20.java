class A{
  public void show(){
    System.out.println("in A");
  }

}


class B extends A{
  @Override
  public void show(){
    super.show();
    System.out.println("in B");       //B will override method in class A
  }
}

class OverridingDemo{
  public static void main(String args[]){
    B obj1 = new B();
    obj1.show();
  }
}
