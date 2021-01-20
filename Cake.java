import java.util.*;

class Cake {
  public static void main(String[] args) {
    Scanner kbd = new Scanner(System.in);
    int n,v,h;
    n=kbd.nextInt();
    v=kbd.nextInt();
    h=kbd.nextInt();
    System.out.print(Math.max(v,n-v)*Math.max(h,n-h)*4);
    
  }
}
