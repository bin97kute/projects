package example_session6_4;

public class MainClass {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		Diep diep = new Diep();
		
		System.out.println("========== chó ===========");
		dog.age=1;
		dog.name="Milu";
		dog.eat();
		dog.say();
		System.out.println("========== Mèo ===========");
		cat.age=2;
		cat.name="Kitty";
		cat.eat();
		cat.say();
		System.out.println("========== Diệp ===========");
		diep.age=21;
		diep.name="Diệp ngáo";
		diep.eat();
		diep.say();
	}

}
