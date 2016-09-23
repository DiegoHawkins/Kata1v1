package kata1.pkg1;

import java.util.Date;

public class Kata11 {

    public static void main(String[] args) {
        Person person = new Person("Diego", "Hawkins", new Date(92,5,11));
        System.out.println(person.getName()+ person.getSurname()+ " tiene "+ person.getAge() + " años");
    }
}
