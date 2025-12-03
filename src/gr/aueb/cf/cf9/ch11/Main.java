package gr.aueb.cf.cf9.ch11;

public class Main {
    public static void main(String[] args) {
        int price;

        Users users = new Users();
        Users adreas22 = new Users(
                1L, "Andreas", "Papadopoulos", "andrew", "12345", true);

        System.out.println(adreas22.getUsername());
        System.out.println(adreas22.isActive());

        Student student = new Student();
        Student alice = new Student();
        Student bob = new Student();

        Student student2 = new Student(4, "John", "Doe");
        student2.setFirstName("Xrisostomos");
        Student student3 = new Student(5, "Lampros", "Ioannou");

//        alice.id =1;
//        bob.id = 2;
//        student.firstName = "George";

        alice.setId(1); //setter
        alice.setFirstName("Alice");
        alice.setLastName("Wonderland");

        bob.setId(2);
        bob.setFirstName("Bob");
        bob.setLastName("Marley");

        student.setId(3);
        student.setFirstName("Anna");
        student.setLastName("Karenina");

        System.out.println(alice.getId()); //getter
        System.out.println(alice.getFirstName());
        System.out.println(alice.getLastName());

        System.out.printf("Id: %d, Firstname: %s, Lastname: %s\n",
                alice.getId(), alice.getFirstName(), alice.getLastName());


    }
}
