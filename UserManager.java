
public class UserManager  {
	public void addUser(User user) {
		System.out.println(user.getName() + "Kullan�c� Eklendi...");
	}
	
	public void deleteUser(User user) {
		System.out.println(user.getName() + "Kullan�c� Silindi...");
	}
	
	public void updateUser(User user) {
		System.out.println(user.getName() + "Kullan�c� G�ncellendi...");
	}
}
