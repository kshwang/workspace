package java22.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestRect {
    private static Rect rt = null;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        //Rect 클래스의 인스턴스를 만들고
        //인스턴스의 width = 2, height = 30 설정
        rt = new Rect();
        rt.setWidth(2);
        rt.setHeight(30);
    }
    
    @Before
    public void setUp() throws Exception {
        System.out.println();
    }
    
    @Test
    public void test_area() {
  
        int a = rt.area();
        assertEquals(60, a);
        assertNotEquals(80, a);
    }
    
    @Test
    public void test_perimeter() {
        //Rect 클래스의 인스턴스를 만들고
        //생성자를 이용하여 필드에 width=2,height=30 설정
        Rect rt = new Rect(2, 30);
        
        int p = rt.perimeter();
        assertNotEquals(120, p);
        assertEquals(64,p);
    }

}