
public class InstructorManager {
	
	public void addCategory(Instructor ins) {
		System.out.println(ins.getName() + "Adl� E�itmene " + ins.getCategory() + " e�itimi tan�mland�...");
	}
	
	public void deleteCategory(Instructor ins) {
		System.out.println(ins.getName() + " Adl� E�itmenin " + ins.getCategory() + "e�itimi silindi...");
	}
	
	public void updateCategory(Instructor ins) {
		System.out.println(ins.getName() + " Adl� E�itmenin " + ins.getCategory() + "e�itimi g�ncellendi...");
	}
	

}
