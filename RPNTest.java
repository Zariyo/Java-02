import Operations.Sum;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RPNTest {
    private RPNBuilder builder;

    @Before
    public void setUp() {
        builder = new RPNBuilder();
    }
    @Test
    public void testShow(){
        // Arrange
        builder.setExpression("2 3 +");
        builder.addOperation(new Sum());
        // sut = System Under Test
        RPN sut = builder.getRPN();
        // Act
        // Assert
        assertEquals("2 3 +", sut.show());
    }

    @Test
    public void testAddition(){
        // Arrange
        builder.setExpression("2 1 +");
        builder.addOperation(new Sum());
        // sut = System Under Test
        RPN sut = builder.getRPN();
        // Act
        // Assert
        assertEquals(3, sut.calculate(), 0.1);
    }

}