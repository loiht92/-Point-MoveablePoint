public class Test {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println();

        point = new Point(2,3);
        System.out.println(point);

        MovablePoint movablePoint = new MovablePoint();
        System.out.println(movablePoint);
        movablePoint =new MovablePoint(1,2,3,4);
        System.out.println(movablePoint);

        movablePoint.setSpeed(3,5);
        movablePoint.move();
        System.out.println(movablePoint.toString());


    }
}
