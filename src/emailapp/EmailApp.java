package emailapp;

public class EmailApp {
   public static void main(String[] args) {
	   Email em1 = new Email("john" , "smith");
	   
//	   em1.setAlternateEmail("kunmun@gmail.com");
//	   System.out.println("YOUR ALTERNATE EMAIL IS : "+ em1.getAlternateEmail());

	     System.out.println(em1.showInfo());
	   }
}
