public class ExerciseOOPjava2{
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint();
        MyPoint p2 = new MyPoint(5, 5);

        System.out.println("X is = "+p1.getX());
        System.out.println("Y is = "+p1.getY());
        System.out.println("X is = "+p2.getX());
        System.out.println("Y is = "+p2.getY());
        System.out.println(p1.distance(p2));
        System.out.println(p1.distance(1,0));
        
        
    }



}

class MyPoint{
    double x;
    double y;
    MyPoint(){
        x = 0;
        y = 0;
        
        
    }
    MyPoint(double x, double y){
        this.x = x;
        this.y = y;
    }

    double getX(){
        return x;
    }
    double getY(){
        return y;
    }
    void setX(double x){
        this.x = x;
    }
    void setY(double y){
        this.y = y;
    }
    double distance(double x, double y){
        return Math.sqrt((this.x - x)* (this.x - x)+(this.y-y)* (this.y-y));
    }
    double distance(MyPoint point){
        return distance(point.x, point.y);

    }
}