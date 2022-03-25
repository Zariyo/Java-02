import java.lang.Math;
import org.junit.*;

import static org.junit.Assert.*;

public class StackTest {
    @Test
    public void testIsEmpty(){
        // Arrange
        // sut = System Under Test
        Stack sut = new Stack(5);
        // Act
        // Assert
        assertTrue("x.isEmpty()", sut.isEmpty());
    }
    @Test
    public void testPush(){
        // Arrange
        // sut = System Under Test
        Stack sut = new Stack(5);
        // Act
        sut.push(10);
        // Assert
        assertFalse("x.isEmpty()", sut.isEmpty());
    }

    @Test
    public void testPop(){
        // Arrange
        // sut
        Stack sut = new Stack(5);
        // Act
        sut.push(10);
        sut.push(2);
        // Assert
        assertEquals("x.pop()",2, sut.pop());
    }

    @Test
    public void testPeek(){
        // Arrange
        // sut
        Stack sut = new Stack(3);
        // Act
        sut.push(10);
        sut.push(2);
        // Assert
        assertEquals("x.peek()",2, sut.peek());
    }


}