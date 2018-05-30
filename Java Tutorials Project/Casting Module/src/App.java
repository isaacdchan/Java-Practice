public class App {
	public static void main(String[] args) {
		//can only have value between -128 and 127
		byte byteValue = 20;
		//half the length of integer (16 bits so 2 bytes?)
		short shortValue = 69;
		//whole number that has max value 2^31 - 1
		int intValue = 1000000000;
		//whole number that can have max value of 2^63 - 1
		long longValue = 1000000000;

		//don't use floats. the f at the end of the number converts to float
		//equivalent to adding an f at the end is adding (float) in parentheses in front
		//unsure if it works with other data types
		float floatValue = 19.3f;
		float floatValue2 = (float)39.1;
		//use doubles instead. bigger version of float
		double doubleValue = 123.456;

		//can use 'DataType'.MAX_VALUE amd .MIN_VALUE
		System.out.println(Byte.MIN_VALUE);

		//casting is converting a value from one numerical type to another
		//have to ensure the value will fit in the new data type
		//still have to specify which type you're casting as in parentheses
		intValue = (int)longValue;
		//can also cast int values to double values. will just add .0 to the end. int is more restricted than double and casting to a more complex type is easier
		doubleValue = intValue;
		// when casting more complex to less, can cause complications. may have to simplify/chop numbers
		//does not round, chops
		intValue = (int)floatValue;
		System.out.println(intValue);

		//won't work since 128 is larger than the MAX_VALUE of byte of 127
		//instead wraps around and outputs -128 instead
		byteValue = (byte)128;
	}
}
