class A{

  public void show(){
    System.out.println("in A");
  }

}


class B extends A{
  @Override
  public void show(){
    System.out.println("in B");       //B will override method in class A
  }
}

class DynamicMethodDispatch{
  public static void main(String args[]){
    A obj1 = new B();   //reference of A and object of B
    obj1.show();
  }
}
