
public class InstructorManager {
	
	public void addCategory(Instructor ins) {
		System.out.println(ins.getName() + "Adlý Eðitmene " + ins.getCategory() + " eðitimi tanýmlandý...");
	}
	
	public void deleteCategory(Instructor ins) {
		System.out.println(ins.getName() + " Adlý Eðitmenin " + ins.getCategory() + "eðitimi silindi...");
	}
	
	public void updateCategory(Instructor ins) {
		System.out.println(ins.getName() + " Adlý Eðitmenin " + ins.getCategory() + "eðitimi güncellendi...");
	}
	

}
