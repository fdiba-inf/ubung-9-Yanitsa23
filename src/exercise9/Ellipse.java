package exercise9;

public class Ellipse {
  private Point point1;
  private double a;
  private double b;

  public Ellipse() {
    point1 = new Point(0, 0);
    a = 1;
    b = 1;
  }

  public Ellipse(Point point1, double a, double b) {
    this.point1 = new Point(point1);
    this.a = a;
    this.b = b;
  }

  public Ellipse(Ellipse otherEllipse) {
    point1 = new Point(otherEllipse.point1);
    a = otherEllipse.a;
    b = otherEllipse.b;
  }

  public boolean isValid() {
    return a > 0 && b > 0;
  }

  public void initialize() {
    do {
      
       System.out.println("Point1: ");
       point1.initialize();
       System.out.print("A: ");
       a = Utils.INPUT.nextDouble();
       System.out.print("B: ");
       b = Utils.INPUT.nextDouble();

    } while(!isValid());
  }

    public double calculatePerimeter() {
       return Math.PI * (3 * (a + b) - Math.sqrt((3 * a + b) *(a + 3 * b)));
      
    }

    public double calculateArea() {
      return Math.PI * a * b;
    }
    
    public String getType() {
      return (a == b) ? "Circle" : "Ellipse";
    }

    public String toString() {
      return String.format("%s-[%s, %s], %s, P=%s, A=%s", point1, a, b, getType(), calculatePerimeter(), calculateArea());
    }

    public boolean equal(Ellipse otherEllipse) {
        boolean a1 = Utils.equals(a, otherEllipse.a);
        boolean b1 = Utils.equals(b, otherEllipse.b);
        boolean a1Reversed = Utils.equals(a, otherEllipse.b);
        boolean b1Reversed = Utils.equals(b, otherEllipse.a);

        return (a1 && b1) || (a1Reversed && b1Reversed);
    }
    

    
  
}
