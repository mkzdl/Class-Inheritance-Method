
public class UserManager  {
	public void addUser(User user) {
		System.out.println(user.getName() + "Kullanýcý Eklendi...");
	}
	
	public void deleteUser(User user) {
		System.out.println(user.getName() + "Kullanýcý Silindi...");
	}
	
	public void updateUser(User user) {
		System.out.println(user.getName() + "Kullanýcý Güncellendi...");
	}
}
