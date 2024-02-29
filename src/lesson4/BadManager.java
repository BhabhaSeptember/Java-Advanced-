package lesson4;

public class BadManager extends Employee {
    private String deptName;

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public BadManager(int empId, String name, String ssn, double salary, String dept) {
        super(empId, name, ssn, salary);
        deptName = dept;
    }


    @Override
    //Below line will not compile. Overriding method cannot be less accessible than method in parent class
//    private String getDetails() {
        public String getDetails() { //Will now compile
            return super.getDetails() +
                    " Dept: " + deptName;
        }



//    @Override
//    public String getAllDetails() {
//      return super.getDetails () +
//        " Dept: " + deptName;
//    }

}

