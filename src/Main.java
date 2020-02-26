public class Main {
    public static void main(String[] args) {

        Employee[] userArr = new Employee[5];
        userArr[0] = new Employee("Евсюков", "Александр", "Олегович","инженер",
                "grijgut@mail.ru","89245365774",41000,33);
        userArr[1] = new Employee("Камалдинов", "Павел", "Алесандрович","специалист",
                "kgfajksf@mail.ru","89248965774",35000,42);
        userArr[2] = new Employee("Юшкевич", "Данил", "Юрьевич","инженер",
                "xcvnbre@mail.ru","89245365787",48000,54);
        userArr[3] = new Employee("Самарина", "Полина", "Владимировна","инженер",
                "pktitmg@mail.ru","89245915774",39000,26);
        userArr[4] = new Employee("Богатенко", "Петр", "Иванович","бухгалтер",
                "tchenemf@mail.ru","89855365774",35000,47);

        for (int i=0; i<5; i++){
            if(userArr[i].getAge()>40){
                userArr[i].employeeInfo();
            }
        }

    }
}