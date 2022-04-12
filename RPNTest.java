import Operations.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
        assertEquals(3, sut.calculate(), 0.0001);
    }

    @Test
    public void testMultiplication(){
        // Arrange
        builder.setExpression("2 4 *");
        builder.addOperation(new Product());
        // sut = System Under Test
        RPN sut = builder.getRPN();
        // Act
        // Assert
        assertEquals(8, sut.calculate(), 0.0001);
    }

    @Test
    public void testDivision(){
        // Arrange
        builder.setExpression("3 2 /");
        builder.addOperation(new Division());
        // sut = System Under Test
        RPN sut = builder.getRPN();
        // Act
        // Assert
        assertEquals(1.5, sut.calculate(), 0.0001);
    }

    @Test
    public void testDifference(){
        // Arrange
        builder.setExpression("3 2 -");
        builder.addOperation(new Difference());
        // sut = System Under Test
        RPN sut = builder.getRPN();
        // Act
        // Assert
        assertEquals(1, sut.calculate(), 0.0001);
    }

    @Test
    public void testLongExpression(){
        // Arrange
        builder.setExpression("3 2 - 5 +");
        builder.addOperation(new Difference());
        builder.addOperation(new Sum());
        // sut = System Under Test
        RPN sut = builder.getRPN();
        // Act
        // Assert
        assertEquals(6, sut.calculate(), 0.0001);
    }

    @Test
    public void testLongerExpression(){
        // Arrange
        builder.setExpression("12 2 3 4 * 10 5 / + * +");
        builder.addOperation(new Difference());
        builder.addOperation(new Sum());
        builder.addOperation(new Product());
        builder.addOperation(new Division());
        // sut = System Under Test
        RPN sut = builder.getRPN();
        // Act
        // Assert
        assertEquals(40, sut.calculate(), 0.0001);
    }

    @Test
    public void testPowerTwo(){
        // Arrange
        builder.setExpression("12 2 + ^2");
        builder.addOperation(new Sum());
        builder.addOperation(new PowerTwo());
        // sut = System Under Test
        RPN sut = builder.getRPN();
        // Act
        // Assert
        assertEquals(196, sut.calculate(), 0.0001);
    }

}