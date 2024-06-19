package day4assignments;

public class TestFinalize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating and reassigning objects of A1
        A1 a = new A1();
        a = new A1();
        a = new A1();
        
        // Suggesting the JVM to run garbage collector
        Runtime.getRuntime().gc();

        // Giving some time for the garbage collector to run
        try {
            Thread.sleep(1000); // Sleep for 1 second
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

	}

}
