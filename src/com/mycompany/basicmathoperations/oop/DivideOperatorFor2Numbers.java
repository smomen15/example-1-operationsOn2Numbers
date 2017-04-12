/**
 * 
 */
package com.mycompany.basicmathoperations.oop;

/**
 * @author shakib2013
 *
 */
public class DivideOperatorFor2Numbers extends OperatorFor2numbers implements Divide {
	
	public DivideOperatorFor2Numbers() {
		// TODO Auto-generated constructor stub
	}
	
	public DivideOperatorFor2Numbers(float _number1, float number2) {
		super(_number1,number2);	// NOTE 1st the parent's constructor executes
		System.out.println("parent's number1 is " + super.number1);
		System.out.println("_number1:" + _number1);
		System.out.println("number2 Sabrina says whatever:" + number2);
	}

	public DivideOperatorFor2Numbers(float number1, float number2, String junk) {
		this(number1, number2);	// NOTE 1st the constructor above runs
		Float someJunk = this.divide2numbers();
//		super(number1,number2);
//		System.out.println("number1:" + number1);
//		System.out.println("number2: Sabrina says whatever:" + number2);
		System.out.println("junk:" + junk);
	}

	/* (non-Javadoc)
	 * @see com.mycompany.basicmathoperations.oop.Divide#divide(int, int)
	 */
	@Override
	public int divide(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 / num2;
	}

	/* (non-Javadoc)
	 * @see com.mycompany.basicmathoperations.oop.Divide#divide(float, float)
	 */
	@Override
	public float divide(float num1, float num2) {
		// TODO Auto-generated method stub
		return num1 / num2;
	}

	/* (non-Javadoc)
	 * @see com.mycompany.basicmathoperations.oop.Divide#divide2numbers()
	 */
	@Override
	public float divide2numbers() {
		// TODO Auto-generated method stub
		return number1 / number2;
	}

}
