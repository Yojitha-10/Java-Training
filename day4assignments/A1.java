package day4assignments;

public class A1 {
		// Class A1 with a finalize method
		    @Override
		    protected void finalize() throws Throwable {
		        System.out.println("Finalize method called");
		        super.finalize();
		    }
		

}
