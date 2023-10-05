package HW3;

//Разработайте и протестируйте метод numberInInterval, который проверяет,
//попадает ли переданное число в интервал (25;100). (код приложен в презентации)

public class Task2 {
    public static boolean numberInInterval(int n) {
        if ((25 < n)&&(n < 100)) return true;
        else return false;
    }
}
