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
    public void testShowElems(){
        // Arrange
        // sut = System Under Test
        RPN sut = new RPN("2 3 +");
        // Act
        // Assert
        assertEquals("2".charAt(0), sut.showElems());
    }

    RPN nowy = new RPN("2 3 +");
    nowy.oblicz()
}
