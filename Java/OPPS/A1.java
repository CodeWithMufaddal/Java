
class Employee {

   int id;
   String name;

   public void getDetails() {
      System.out.println("id is: " + id);
      System.out.println("Name is: " + name);
   }

}

public class A1 {
   public static void main(String[] args) {
      Employee hello = new Employee();
      // hello.name = "name";
      // hello.id = 1;
      hello.getDetails();

   }
}
