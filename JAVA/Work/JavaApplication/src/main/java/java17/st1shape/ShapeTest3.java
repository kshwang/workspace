package java17.st1shape;

public class ShapeTest3 {
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        //클래스 하향 형변환
        Shape s = new Rectangle();
        Rectangle r = (Rectangle) s;
        r.x = 10;
        r.y = 10;
        r.wight  = 200;
        r.height = 200;
        
        System.out.println("s"+s.toString());
        System.out.println("r"+r.toString());
        
    }
    
}
