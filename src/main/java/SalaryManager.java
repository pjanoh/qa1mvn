public class SalaryManager {

    public static boolean isDayOff = false;

    public static int getDaySalary(int monthSalary) {
        int baseDaySalary = monthSalary / 20;
        if (isDayOff) {
            return 2 * baseDaySalary;
        } else {
            return baseDaySalary;
        }
    }
}
