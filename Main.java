
public class Main {

	public static void main(String[] args) {
		
		Student st1=new Student();
		st1.setId(1);
		st1.setName("Muhammet");
		st1.setSurname("KAZDAL");
		st1.setEmail("123456@gmail.com");
		st1.setPhone("05390000000");
		st1.setPass("123456");
		st1.setCategory("java");
		st1.setHomeWork("HomeWork3");
		st1.setIssue("Yazılım Geliştirme");
		
		
		Instructor ins1=new Instructor();
		ins1.setId(2);
		ins1.setName("Engin");
		ins1.setSurname("DEMİROĞ");
		ins1.setEmail("hoca@gmail.com");
		ins1.setPhone("123456789");
		ins1.setPass("123456");
		ins1.setCategory("Yazılım");
		ins1.setSalary(15000);
		
		UserManager userManager=new UserManager();
		userManager.addUser(st1);
		userManager.addUser(ins1);
		
		InstructorManager insManager=new InstructorManager();
		insManager.addCategory(ins1);
		
		StudentManager stuManager=new StudentManager();
		stuManager.addCategory(st1);

	}

}
