
public class StudentManager  {
	public void addCategory(Student st) {
		System.out.println(st.getName() + " Adl� ��rencinin " + st.getHomeWork() + " �devi sisteme eklendi...");
	}
	
	public void deleteCategory(Student st) {
		System.out.println(st.getName() + "Adl� ��rencinin " + st.getHomeWork() + " �devi sistemden silindi...");
	}
	
	public void updateCategory(Student st) {
		System.out.println(st.getName() + "Adl� ��rencinin " + st.getHomeWork() + " �devi g�ncellendi...");
	}
}
