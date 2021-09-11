package Test_0911;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        String s_year = "";
        String s_month = "";
        String s_day = "";
        int year = 0;
        int month = 0;
        int day = 0;
        boolean flag = false;
        boolean isErrorDay = false;

        Scanner input = new Scanner(System.in);

        try {
            s_year = input.nextLine();
            s_month = input.nextLine();
            s_day = input.nextLine();

            year = Integer.parseInt(s_year);
            month = Integer.parseInt(s_month);
            day = Integer.parseInt((s_day));
        } catch (Exception e) {
            flag = true;
            System.out.println("N/A");
            System.exit(0);
        }

        if (year < 1900 || year > 2050) {
            System.out.println("年值不在指定范围之内");
            flag = true;
        }
        if (month > 12 || month < 1) {
            System.out.println("月值不在指定范围之内");
            flag = true;
        }
        if (day > 31 || day < 1) {
            System.out.println("日值不在指定范围之内");
            flag = true;

        }


        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                if (day == 31) {
                    day = 1;
                    month = month + 1;
                } else {
                    day = day + 1;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (day == 30) {
                    day = 1;
                    month = month + 1;
                } else if (day == 31) {
                    isErrorDay = true;
                } else {
                    day = day + 1;
                }
                break;
            case 12:
                if (day == 31) {
                    day = 1;
                    month = 1;
                    year = year + 1;
                } else {
                    day = day + 1;
                }
                break;
            case 2: {
                if (((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
                    // 闰年
                    if (day == 29) {
                        day = 1;
                        month = 3;
                    } else if (day < 29) {
                        day = day + 1;
                    } else {
                        isErrorDay = true;

                        // day超过29
                    }
                } else {
                    // 非闰年
                    if (day == 28) {
                        day = 1;
                        month = 3;
                    } else if (day < 28) {
                        day = day + 1;
                    } else {
                        isErrorDay = true;
                    }
                }

            }
            break;
            default:
        }
        if (flag) {
            System.exit(0);
        } else {
            if (isErrorDay) {
                System.out.println("日期错误");
            } else {
                System.out.println(year + "年" + month + "月" + day + "日");
            }
        }
    }

}
