
public class StudentManager  {
	public void addCategory(Student st) {
		System.out.println(st.getName() + " Adlý Öðrencinin " + st.getHomeWork() + " Ödevi sisteme eklendi...");
	}
	
	public void deleteCategory(Student st) {
		System.out.println(st.getName() + "Adlý Öðrencinin " + st.getHomeWork() + " ödevi sistemden silindi...");
	}
	
	public void updateCategory(Student st) {
		System.out.println(st.getName() + "Adlý Öðrencinin " + st.getHomeWork() + " ödevi güncellendi...");
	}
}
