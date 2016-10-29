public class Person {

  public String name;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String name() {
    return this.name;
  }

  public static void main(String[] args) {
    Person teacher = new Person("Michael", 28);
    System.out.println(teacher.name());
    int results = teacher.age();
    System.out.println(results);
  }

}
