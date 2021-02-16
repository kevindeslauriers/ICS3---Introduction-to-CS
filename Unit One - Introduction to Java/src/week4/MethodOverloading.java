package week4;

public class MethodOverloading {
  public void one(int x){
    System.out.print(x);
  }

  public void one(int x, int y){
    System.out.print(x+y);
  }

  /* Cannot create this method because it would be a duplicate method. Argument list must be different
  public  void one(int y){
    System.out.print(y);
  }
  */
}
