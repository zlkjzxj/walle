package junit;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/7/6.
 */
public class CaculateTest {

    @Test
    public void Test(){

    }
//    @Test
//    public void add(){
//        assertEquals(6,new Caculate().add(3,3) );
//    }
    @Test
    public void subtract(){
        assertEquals(7,new Caculate().add(4,3) );
    }
}
