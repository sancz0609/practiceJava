class Emp{
  int empId;
  int salary;
  static String ceo;

  static{
    ceo = "Larry";
  }

  public Emp(){
    empId = 1;
    salary = 9000;
  }

  public void show(){
    System.out.println(empId + " : "+salary + " : " + ceo);
  }
}


class StaticDemo{
  public static void main(String args[]){

    Emp navin = new Emp();
    // navin.empId = 1;
    // navin.salary = 4000;
    // Emp.ceo = "Mahesh";

    Emp rahul = new Emp();
    // rahul.empId = 2;
    // rahul.salary = 5000;
    // rahul.ceo = "Nikita"; //will be updated for every object and not just for rahul

    Emp ram = new Emp();
    // ram.empId = 3;
    // ram.salary = 6000;
    //
    // Emp.ceo = "Shayam"; // you can use class name here insted of object name

    navin.show();   //ceo will be shayam and not mahesh as ceo is static. it will be updated for all the objects
    rahul.show();   //ceo will be shayam and not nikita as ceo is static. it will be updated for all the objects
    ram.show();
  }
}
