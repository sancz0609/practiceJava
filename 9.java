class Casio{

      int num1;
      int num2;
      String operation;

      public Casio(){
        num1 = 0;
        num2 = 0;
        operation = "Nothing";
      }

      public Casio(int i){
        num1 = i;
        num2 = 0;
        operation = "Nothing";
      }

      public Casio(int i, int j){
        num1 = i;
        num2 = j;
        operation = "Nothing";
      }

        public Casio(int i, int j,String op){
          num1 = i;
          num2 = j;
          operation = op;
      }
  }


  class ConstructorOverloading{
    public static void main(String args[]){

      Casio obj1 = new Casio();
      Casio obj2 = new Casio(4);
      Casio obj3 = new Casio(5,6);
      Casio obj4 = new Casio(8,9,"hello");


      System.out.println(obj1.num1);
      System.out.println(obj1.num2);
      System.out.println(obj1.operation);
      System.out.println(obj2.num1);
      System.out.println(obj2.num2);
      System.out.println(obj2.operation);
      System.out.println(obj3.num1);
      System.out.println(obj3.num2);
      System.out.println(obj3.operation);
      System.out.println(obj4.num1);
      System.out.println(obj4.num2);
      System.out.println(obj4.operation);

    }
  }
