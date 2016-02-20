
public class CalulatorTest {
	@Test
	public void testAdd(){
		MyCalculator calc = new MyCalculator();
		float actual = calc.add(1, 2);
		assertEquals("Expected 1+2=3", 3, actual, 0.0);
		actual = calc.add(3, -2);
		assertEquals("Expected 3+(-2)=1", 1, actual, 0.0);
		actual = calc.add(-3, 2);
		assertEquals("Expected -3+2=-1", -1, actual, 0.0);
		actual = calc.add(-3, -2);
		assertEquals("Expected (-3)+(-2)=-5", -5, actual, 0.0);
	}
	@Test
	public void testSubtract(){
		MyCalculator calc = new MyCalculator();
		float actual = calc.subtract(3, 2);
		assertEquals("Expected 3-2=1", 1, actual, 0.0);
		actual = calc.subtract(-3, 2);
		assertEquals("Expected -3-2=-5", -5, actual, 0.0);
		actual = calc.subtract(3,-2);
		assertEquals("Expected 3-(-2)=5", 5, actual, 0.0);
		actual = calc.subtract(-3,-2);
		assertEquals("Expected -3-(-2)=-1", -1, actual, 0.0);
	}
	@Test
	public void testMultiply(){
		MyCalculator calc = new MyCalculator();
		float actual = calc.multiply(2, 2);
		assertEquals("Expected 2*2=4", 4, actual, 0.0);
		actual = calc.multiply(2, -2);
		assertEquals("Expected 2*-2=-4", -4, actual, 0.0);
		actual = calc.multiply(-2,-2);
		assertEquals("Expected -2*-2", 4, actual, 0.0);
		actual = calc.multiply(-2,0);
		assertEquals("Expected -2*0=0", 0, actual, 0.0);
	}
	@Test
	public void testDivide(){
		MyCalculator calc = new MyCalculator();
		float actual = calc.divide(4, 2);
		assertEquals("Expected 4/2=2", 2, actual, 0.0);
		actual = calc.divide(4, -2);
		assertEquals("Expected 4/-2=-2", -2, actual, 0.0);
		actual = calc.divide(0, 4);
		assertEquals("Expected 0/4=0", 0, actual, 0.0);
	}
	@Test
	public void testSquare(){
		MyCalculator calc = new MyCalculator();
		float actual = calc.square(5);
		assertEquals("Expected 5^2=25", 25, actual, 0.0);
		actual = calc.square(-2);
		assertEquals("Expected (-2)^2=4", 4, actual, 0.0);
	}
	@Test
	public void testCube(){
		MyCalculator calc = new MyCalculator();
		float actual = calc.cube(3);
		assertEquals("Expected 3^3=27", 27, actual, 0.0);
		actual = calc.cube(-3);
		assertEquals("Expected (-3)^3=-27", -27, actual, 0.0);
	}
	@Test
	public void testNfactorial(){
		MyCalculator calc = new MyCalculator();
		float actual = calc.nfactorial(4);
		assertEquals("Expected 4! = 24", 24, actual, 0.0);
		actual = calc.nfactorial(0);
		assertEquals("Expected 0! = 1", 1, actual, 0.0);
	}
	@Test
	public void testBinarySearch(){
		MyCalculator calc = new MyCalculator();
		int[] foo = {1,2,3,4,5,6};
		float actual = calc.binarySearch(foo,7);
		assertEquals("Expected location = -1", -1, actual, 0.0);
		actual = calc.binarySearch(foo, 4);
		assertEquals("Expected location = 3", 3, actual, 0.0);
	}	
}
