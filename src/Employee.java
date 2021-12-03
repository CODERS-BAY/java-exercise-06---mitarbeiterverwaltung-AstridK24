package application;

public class Employee {
  final Department dept;
  String firstname;
  String lastname;
  int id;



  public Employee( int id, String firstname, String lastname, Department dept) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.id = id;
    this.dept = dept;
  }

  public Employee() {
    this.dept = new Department();
    this.firstname = "Max";
    this.lastname = "Mustermann";
    this.id = 123;
  }

  public void print() {
    System.out.println("Der Mitarbeiter "+id+" "+firstname+" "+lastname+" arbeitet in der Abteilung "+dept.name+" in "+dept.city );
    //Der Mitarbeiter 123 Max Mustermanm arbeitet in der Abteilung Test in Gotham
    }

    public boolean isEquals(Employee other) {
      return (other.id == this.id);
    }

  @Override
  public String toString() {
    return "Employee{" +
            "dept=" + dept +
            ", firstname='" + firstname + '\'' +
            ", lastname='" + lastname + '\'' +
            ", id=" + id +
            '}';
  }
}

