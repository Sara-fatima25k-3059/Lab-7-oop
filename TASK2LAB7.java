public class TASK2LAB7 {
public static void main(String[] args){
    shape s1=new circle();
    shape s2=new rectangle();
    shape s3=new triangle();
    s1.area();
    s2.area();
    s3.area();
}
}
class shape{
    public void area(){
    }
}
class circle extends shape{
    private int radius=20;
    @Override
    public void area(){
        double area=3.14*radius*radius;
        System.out.println("area of circle is "+ area);
    }
}
class rectangle extends shape{
    private int length=20;
    private int width=10;
    @Override
    public void area(){
        int area=length*width;
        System.out.println("area of rectangle is "+ area);
    }
}
class triangle extends shape{
    private int height=20;
    private int breadth=30;
    @Override
    public void area(){
        double area=0.5*height*breadth;
        System.out.println("area of triangle is "+ area);
    }
}