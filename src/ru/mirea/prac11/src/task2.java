// приложение сравниваюшее текущее дату и время с введенными

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM");
        Calendar cal1 = Calendar.getInstance();

        Calendar cal2 = Calendar.getInstance();
        System.out.println("Введите день и месяц в формате (01 01)");
        Scanner sc = new Scanner(System.in);
        String nowdate = sc.nextLine();
        int day = Integer.parseInt(nowdate.substring(0, 2));
        int moth = Integer.parseInt(nowdate.substring(4));
        cal2.set(Calendar.DAY_OF_MONTH, day);
        cal2.set(Calendar.MONTH, moth - 1);

        if (cal1.compareTo(cal2) < 0) {
            System.out.println("Now after the input date");
        } else if (cal1.compareTo(cal2) > 0) {
            System.out.println("Now before the input date");
        } else {
            System.out.println("Now the date of input");
        }
    }
}
