//super keyword

class A{
  public A(){

  }

  public A(int i){

  }
}

class B extends A{
  public B(){
    super();    //calls the constructor of super class - default constructor
}

  public B(int i){
    super(int i); //calls the parameterized constructor of super class
  }

}

class SuperDemo{
  public static void main(String args[]){

  }
}
