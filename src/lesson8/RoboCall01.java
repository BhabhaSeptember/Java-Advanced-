package lesson8;

import java.util.List;

/**
 *
 * @author MikeW
 * 
 * This is a basic class with a lot of redundancy.
 */
public class RoboCall01 {
  
  public void callDrivers(List<Person> pl){
    for(Person p : pl){
      if (p.getAge() >= 16){
        roboCall(p);
      }
    }
  }
  
  public void emailDraftees(List<Person> pl){
    for(Person p : pl){
      if (p.getAge() >= 18 && p.getAge() <= 25 && p.getGender() == Gender.MALE){
        roboEmail(p);
      }
    }
  }
  
  public void mailPilots(List<Person> pl){
    for(Person p : pl){
      if (p.getAge() >= 23 && p.getAge() <= 65){
        roboMail(p);
      }
    }
  }
  
  
  public void roboCall(Person p){
    System.out.println("-Calling: " + p.getGivenName() + " " + p.getSurName() + "\nAge: " + p.getAge() + " \nat: " + p.getPhone() + "\n");
  }
  
  public void roboEmail(Person p){
    System.out.println("-EMailing: " + p.getGivenName() + " " + p.getSurName() + "\nAge: " + p.getAge() + "\nat: " + p.getEmail() + "\n");
  }
  
  public void roboMail(Person p){
    System.out.println("-Mailing: " + p.getGivenName() + " " + p.getSurName() + "\nAge: " + p.getAge() + "\nat: " + p.getAddress() + ", " + p.getCity() + ", " + p.getState() + " " + p.getCode() + "\n");
  }

}
