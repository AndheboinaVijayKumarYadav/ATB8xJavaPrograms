package PassbyValueReference;

public class TestPassByReference {
    public static void main(String[] args) {
        Point newObj = new Point(4,5);

        // static methods can be access with class.staticMethodName
        System.out.println("Before Passing the obj in move method " + newObj);
        TestPassByReference.move(newObj);
        System.out.println("After Passing the obj in move method " + newObj);

    }

    public static void move(Point p){
        p.x++;
        p.y++;
        System.out.println("In move method " + p);
    }

    public static class Point {

        int x;
        int y;

        Point(int x, int y){
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("Point{");
            sb.append("x=").append(x);
            sb.append(", y=").append(y);
            sb.append('}');
            return sb.toString();
        }
    }
}
