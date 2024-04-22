public class APLine
{
  private int A, B, C;
  public APLine(int a, int b, int c){
    A = a;
    B = b;
    C = c;
  }
  private double getSlope(){
    return (double)-A/B;
  }
  private boolean isOnLine(int x, int y){
    if (A*x+B*y+C == 0)
      return true;
    return false;
  }
}
