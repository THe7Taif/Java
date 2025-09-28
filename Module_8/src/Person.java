import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Person {
    private String name;
    private int age;
    private String city;

    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public String getCity() { return city; }

    @Override
    public String toString() {
        return name + " - " + age + " - " + city;
    }
}

 class Task1Comparator {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Alice", 30, "New York"));
        persons.add(new Person("Bob", 22, "Los Angeles"));
        persons.add(new Person("Anna", 27, "Chicago"));
        persons.add(new Person("John", 35, "New York"));
        persons.add(new Person("Eve", 28, "Los Angeles"));

        // Sort by age using Comparator.comparingInt
        persons.sort(Comparator.comparingInt(Person::getAge));

        // Filter by city "New York"
        persons.removeIf(p -> !p.getCity().equals("New York"));

        // Print results
        for (Person p : persons) {
            System.out.println(p);
        }
    }
}
