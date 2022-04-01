import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RPNTest {
    @Test
    public void testShow(){
        // Arrange
        // sut = System Under Test
        RPN sut = new RPN("2 3 +");
        // Act
        // Assert
        assertEquals("2 3 +", sut.show());
    }

    @Test
    public void testAddition(){
        // Arrange
        // sut = System Under Test
        RPN sut = new RPN("1 2 /");
        // Act
        // Assert
        assertEquals(0.5, sut.calculate(), 0.01);
    }

}