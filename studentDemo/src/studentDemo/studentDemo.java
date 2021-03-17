package studentDemo;

public class studentDemo {
	public static void main(String[] args) {
		Student one = new Student("李马克", 22);
		one.room = "NCT 练习室";
		System.out.println("Name: " + one.getName() + "\nAge: " 
							+ one.getAge() + "\nClassroom: " + one.room + "\nID: " + one.getId());
		
		System.out.println("===================================================================");
		
		Student two = new Student("黄仁俊", 21);
		System.out.println("Name: " + two.getName() + "\nAge: " 
							+ two.getAge()+ "\nClassroom: " + two.room + "\nID: " + two.getId());

	}
}
