
import java.util.*;

// class Employee {
//    int Salary;
//    String Name;

//    public int getSalary() {
//       return Salary;
//    }

//    public String getName() {
//       return Name;
//    }

//    public String SetName() {

//       return Name;
//    }

// }

// class mobilephone {
//    public void ringing() {
//       System.out.println("ringing.......");
//    };

//    public void Vibrate() {
//       System.out.println("vibrating.......");
//    };

// }

class square {

   int side;

   public int area() {

      int s = side * side;

      return s;
   }

   public int param() {

      int a = side * 3;

      return a;
   }
}

public class PracticeSet8 {

   public static void main(String[] args) {

      // Employee employee = new Employee();
      // Scanner getName = new Scanner(System.in);
      // System.out.print("Enter Your name: ");
      // String name = getName.nextLine();
      // employee.Name = name;

      // System.out.println("The name of the employee is: " + name);
      // System.out.print("Enter your new name: ");
      // String newName = getName.nextLine();
      // employee.Name = newName;
      // String n = employee.getName();
      // System.out.println("The name of the employee is: " + n);

      // getName.close();

      square area = new square();
      area.side = 9;
      System.out.println(area.area());
      System.out.println(area.param());
      Random random = new Random();
      int Random = random.nextInt(6);
      System.out.println(Random);
   }

}
