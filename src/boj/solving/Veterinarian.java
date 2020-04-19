package boj.solving;

import java.util.LinkedList;
import java.util.Queue;

public class Veterinarian {
	private Queue<String> pets = new LinkedList<>(); 
    public void accept(String petName) {
        pets.offer(petName);
    }

    public String heal() {
        return pets.poll();
    }
    
    public static void main(String[] args) {
        Veterinarian veterinarian = new Veterinarian();
        veterinarian.accept("Barkley");
        veterinarian.accept("Mittens");
        System.out.println(veterinarian.heal());
        System.out.println(veterinarian.heal());
    }
}
