package com.codingdojo.java.objectmaster1;

public class HumanTest {

	public static void main(String[] args) {
			Human ninja1 = new Human("Edison");
			Human samurai1 = new Human("Newton");
			Human wizard1 = new Human("Hawkings");
			
			wizard1.attack(ninja1);
			samurai1.attack(ninja1);
			ninja1.attack(samurai1);
	}
}