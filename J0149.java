import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Point { // no overrides
    private final int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int getX() { return x; }
    int getY() { return y; }
    
}

class Pt { // equals + hashCode + toString
    private final int x, y;

    Pt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Pt))
            return false;
        Pt p = (Pt) o;
        return x == p.x && y == p.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "Pt(" + x + "," + y + ")";
    }
}

// class EqOnly { // equals only, NO hashCode (intentional, for P11)
//     private final int x;

//      EqOnly(int x) {
//          this.x = x;
//      }

//     @Override
//     public boolean equals(Object o) {
//         return o instanceof EqOnly e && x == e.x;
//     }
// }

public class J0149 {
    public static void main(String[] args) {
        Point a = new Point(1, 2), b = new Point(1, 2);
        System.out.println(a == b);       // P1 false: different objects
        System.out.println(a.equals(b));  // P2 false: Object.equals compares identity
        System.out.println(a);            // P3 Point@hex: default Object.toString = ClassName@hexHashCode
        a.getX(); // P4 1
        b.getY(); // P5 2

        Pt c = new Pt(1, 2), d = new Pt(1, 2);
        System.out.println(c == d);       // P4 false: different objects
        System.out.println(c.equals(d));  // P5 true: x and y match
        System.out.println(c);            // P6 Pt(1,2): overridden toString
        //System.out.println(c.equals(null));  // P7 false: null instanceof Pt is false
        Object str = "hello";
        System.out.println(c.equals(str));   // P8 false: "hello" is not a Pt, instanceof fails

        Set<Point> s1 = new HashSet<>();
        s1.add(a);
        s1.add(b);
        System.out.println(s1.size());    // P9 2: identity hashCode and equals

        Set<Pt> s2 = new HashSet<>();
        s2.add(c);
        s2.add(d);
        System.out.println(s2.size());    // P10 1: different objects, but equal AND same hashCode, so duplicate

        //Set<EqOnly> s3 = new HashSet<>();
        //s3.add(new EqOnly(5));
        //s3.add(new EqOnly(5));
        //System.out.println(s3.size());    // P11 2 (usually): equal, but different hashCodes, so equals is never called
    }
}
//Output :
// false
// false
// Point@1dbd16a6
// false
// true
// Pt(1,2)
// false
// false
// 2
// 1
// 2