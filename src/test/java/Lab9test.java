import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Lab9test {
    Lab9 lab9 = new Lab9();
    @Test
    public void equals(){
        assertEquals(false, lab9.equalsLength("Shrek","Donkey"));
    }
    @Test
    public void equals2(){
        assertEquals(true,lab9.equalsLength("Car","Dog"));
    }
    @Test
    public void equals3(){
        assertEquals(true,lab9.equalsLength("Zombi","Frankenstein"));
    }

    @Test
    public void Test1 (){
        assertEquals(120,lab9.calculateFactorial(5));
    }
    @Test
    public void Test2 (){
        assertEquals(362880,lab9.calculateFactorial(9));
    }
    @Test
    public void Test3 (){
        assertEquals(9,lab9.calculateFactorial(3));
    }
    @Test
    public void Test4 (){
        assertEquals(720,lab9.calculateFactorial(6));
    }

}
