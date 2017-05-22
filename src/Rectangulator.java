public class Rectangulator {
   public static void main(String[] args) {
     int l = Integer.parseInt(args[0]);
     int w = Integer.parseInt(args[1]);

     Rectangle myR = new Rectangle(l,w);
     System.out.println("Area Value is",myR.getArea());
     System.out.println("Perimeter Value is",myR.getPerimeter());
   }
}
