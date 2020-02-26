public class Employee {
    private String name;
    private String middleName;
    private String surname;
    private String position;
    private String email;
    private String telephone;
    private int salary;
    private int age;

    public Employee(String name, String middleName, String surname, String position, String email,
                    String telephone, int salary, int age){
        this.name=name;
        this.middleName=middleName;
        this.surname=surname;
        this.position=position;
        this.email=email;
        this.telephone=telephone;
        this.salary=salary;
        this.age=age;
    }

    public void employeeInfo(){
        System.out.println(name+" "+middleName+" "+surname+" "+position+" "+email+
                " "+telephone+" "+salary+" "+age);
    }

    public int getAge() {
        return age;
    }
}