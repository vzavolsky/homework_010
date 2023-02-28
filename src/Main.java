public class Main {
    public static void main(String[] args) {
        String  firstName = "Ivan",
                middleName = "Ivanovich",
                lastName = "Ivanov",
                fullName = lastName + " " + firstName + " " + middleName;

        task01(fullName);
        task02(fullName);
        task03("Иванов Семён Семёнович");

    }

    private static void task03(String fullName) {
        System.out.println("Данные ФИО сотрудника — " + fullName.replace("ё","е"));
    }

    private static void task02(String fullName) {
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());
    }

    private static void task01(String fullName) {
        System.out.println("ФИО сотрудника — " + fullName);
    }

}