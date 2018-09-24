package ua.lviv.lgs;

public class Application {

	public static void main(String[] args) {

		// task-1

		byte a = 1;
		short b = 2;
		int c = 101;
		long d = 202l;
		float e = 102;
		double f = 303;
		char g = 5;
		boolean r = true;

		// task-2

		System.out.println("Byte max value= " + Byte.MAX_VALUE);
		System.out.println("Byte min value= " + Byte.MIN_VALUE);

		System.out.println("Short max value= " + Short.MAX_VALUE);
		System.out.println("Short min value= " + Short.MIN_VALUE);

		System.out.println("Integer max value= " + Integer.MAX_VALUE);
		System.out.println("Integer min value= " + Integer.MIN_VALUE);

		System.out.println("Long max value= " + Long.MAX_VALUE);
		System.out.println("Long min value= " + Long.MIN_VALUE);

		System.out.println("Float max value= " + Float.MAX_VALUE);
		System.out.println("Float min value= " + Float.MIN_VALUE);

		System.out.println("Double max value= " + Double.MAX_VALUE);
		System.out.println("Double min value= " + Double.MIN_VALUE);

		System.out.println("Char max value= " + (int) Character.MAX_VALUE);
		System.out.println("Char min value= " + (int) Character.MIN_VALUE);

		System.out.println("Boolean does not have Boolean.SIZE, Boolean.MIN_VALUE, or Boolean.MAX_VALUE");
		System.out.println("Boolean has true or false");
		
		// task-3
		int[] array = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = i;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(" " + array[i]);
		}
		
		int max = array[0];
		int min = array[0];
		
		for (int i = 0; i < array.length; i++) {
			if (max < array[i])
				max = array[i];
		}
		System.out.println("Max value of array = " + max);
		
		for (int i = 0; i < array.length; i++) {
			if (min > array[i])
				min = array[i];
		}
		System.out.println("Min value of array = " + min);
	}
}
