abstract class shape1 {
    abstract void draw();
}
class rectangle extends shape1{
    void draw(){
        System.out.println("i am child1");
    }
}
class circle extends shape1{
    void draw(){
        System.out.println("i am child2");
    }
}
class test{
    public static void main(String[]args) {
       // shape s;
      circle s=new circle();
      rectangle a=new rectangle();
        s.draw();
        a.draw();
        
    }
}