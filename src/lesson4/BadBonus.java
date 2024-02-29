package lesson4;

//Below code is not easy to read and can result in duplicated code
public class BadBonus {
  public double calcBonus(Employee e){
    return e.getSalary() * 0.03;
  }

  public double calcBonus(Manager m){
    return m.getSalary() * 0.03;
  }

  public double calcBonus(Engineer eng){
    return eng.getSalary() * 0.03;
  }

  public double calcBonus(Director d){
    return d.getSalary() * 0.03;
  }
}
