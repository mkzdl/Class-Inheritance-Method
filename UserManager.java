
public class UserManager  {
	public void addUser(User user) {
		System.out.println(user.getName() + "Kullanıcı Eklendi...");
	}
	
	public void deleteUser(User user) {
		System.out.println(user.getName() + "Kullanıcı Silindi...");
	}
	
	public void updateUser(User user) {
		System.out.println(user.getName() + "Kullanıcı Güncellendi...");
	}
}
