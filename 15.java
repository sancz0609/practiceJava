class EnhancedFor{
  public static void main(String args[]){

    int a[] = {1,2,3,4,5};

    for(int i : a){
      System.out.print(i+" ");      //the value of first element of a goes to a , then the second value of a and so on
    }

    System.out.println();
    int d[][] = {
              {1,2,3,4},
              {2,4,6},
              {5,6,7,8,9}
            };

    for(int k[] : d){  //k should be array here as first element of d is an array
      for(int m : k)
      {
        System.out.print(m + " ");
      }
      System.out.println();
    }
  }
}
