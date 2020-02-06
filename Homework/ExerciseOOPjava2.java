public class ExerciseOOPjava2{
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint();
        MyPoint p2 = new MyPoint(5, 5);
        MyPoint p3 = new MyPoint(10,10);

        System.out.println("X is = "+p1.getX());
        System.out.println("Y is = "+p1.getY());
        System.out.println("X is = "+p2.getX());
        System.out.println("Y is = "+p2.getY());
        System.out.println(p1.distance(p2));
        System.out.println(distance(p3,p1));
        
        
    }
    public static double distance(MyPoint p_1, MyPoint p_2){
        return Math.sqrt((p_2.x - p_1.x)* (p_2.x - p_1.x)+(p_2.y-p_1.y)* (p_2.y-p_1.y));


        
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

    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public void setX(double x){
        this.x = x;
    }
    public void setY(double y){
        this.y = y;
    }
    public double distance(double x, double y){
        return Math.sqrt((this.x - x)* (this.x - x)+(this.y-y)* (this.y-y));
    }
    
    public double distance(MyPoint point){
        return distance(point.x, point.y);
    
    }
}