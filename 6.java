class NestedLoops{
  public static void main(String args[]){

    for(int i = 1;i<=6;i++)
    {
      for(int j = 1 ; j <= i ; j++)
      {
        System.out.print(j+" ");
      }
      System.out.println();
    }

    for(int a = 65; a<=67 ;a++)
    {
      for(char b = 'A' ; b <=a; b++ )
      {
        System.out.print(b + " ");
      }
      System.out.println();
    }

    for(int p = 0; p<=3; p++)
    {
      for(int q = 0; q <=3 ; q++)
      {
        if(p == 0 || p == 3)
        {
          System.out.print("*"+" ");
        }

        else if(q == 0 || q == 3)
        {
          System.out.print("*"+" ");
        }

        else
        {
          System.out.print("  ");
        }
      }
      System.out.println();
    }
  }
}
