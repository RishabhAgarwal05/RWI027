package methodoverridding;
public class one {
   // Method to be overridden
    void makeSound() {
        System.out.println("Animal makes a sound");
   }
    }
class two extends one{
void makeSound() {
 System.out.println("Animal makes a voice");
}

public static void main(String[]args) {
two j =new two();
j.makeSound();
}
}
