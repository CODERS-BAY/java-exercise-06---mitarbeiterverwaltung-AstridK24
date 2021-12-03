package application;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Department default1 = new Department();
    Employee default2 = new Employee();
    System.out.println(default1);
    System.out.println(default2);



    List<Employee> empList = new ArrayList<>();
    int id =1;
    String jn = "n";
    do {
      System.out.println("Bitte legen Sie eine Abteilung an: ");
      System.out.print("Name ");
      String deptName = scanner.nextLine();
      System.out.print("Land ");
      String land = scanner.nextLine();
      System.out.print("Stadt ");
      String stadt = scanner.nextLine();
      Department myDept = new Department(deptName,id,land,stadt);


      System.out.println("Bitte legen Sie einen Mitarbeiter an: ");
      System.out.print("Vorname ");
      String vName = scanner.nextLine();
      System.out.print("Nachname ");
      String nName = scanner.nextLine();
      Employee myEmp = new Employee(id,vName,nName,myDept);
      myEmp.print();
      id++;
      empList.add(myEmp);

      System.out.println("Möchten Sie noch einen Mitarbeiter anlegen?");
      System.out.println("j für ja und n für beenden");
      jn = scanner.nextLine();
    }while (jn.equalsIgnoreCase("j"));
    System.out.println("Auf Wiedersehen!");
    System.out.println(empList);
  }


  /*
  * for the bonus task
  *
  * private static int generateID() {}
  *
  */

  /*
   * for the console application
   *
   * private static void application() {}
   *
   */

}
