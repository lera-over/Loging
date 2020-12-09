import java.io.FileInputStream;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.Scanner;

public class Log {

    public static Scanner scan = new Scanner(System.in);


    public static class initLogger {
    }

    private static Logger logger;

    static {
        try (FileInputStream configFile = new FileInputStream("C:\\Users\\User\\IdeaProjects\\Andreeva_log\\src\\logger_config")) {
            LogManager.getLogManager().readConfiguration(configFile);
            logger = Logger.getLogger(initLogger.class.getName());
        } catch (Exception ignore) {
            ignore.printStackTrace();
        }
    }

    public static void main(String[] args) {

        logger.log(Level.INFO, "Начало работы программы, объявление переменных");
        int m1 = 0;
        int m2 = 0;
        int m3a = 0;
        int m3b = 0;
        int r1;
        int r2;
        int res;
        int R;
        int n = scan.nextInt();

        logger.log(Level.INFO, "Старт работы цикла с предусловием");
        for (int i = 0; i < n; i++) {
            int r = scan.nextInt();

            switch (r) {

                case 1:
                    if (r % 3 == 0) {
                        if (r > m3b) {
                            m3b = m3a;
                            m3a = r;
                        } else if (r > m3b) {
                            m3b = r;
                        }
                    }
                    break;
                case 2:
                    if (r % 3 == 1) {
                        m1 = r;
                    }
                    break;
                case 3:
                    if (r % 3 == 2) {
                        m2 = r;
                    }
                    break;
                default:
                    break;
            }
        }
        if (m1 > 0 && m2 > 0) {
            r1 = m1 + m2;
        } else r1 = 1;
        if (m3a > 0 && m3b > 0) {
            r2 = m3a + m3b;
        } else r2 = 1;
        if (r1 > r2) {
            res = r1;
        } else res = r2;


    }

    public static int taskRelease(int res, int R) {
        System.out.println("Вычисленное контрольное значение:" + res);
        logger.log(Level.INFO, "Проверка значений + вариативный вывод");
        if (R == res) {
            System.out.println("Контроль пройден");
        } else System.out.println("Контроль не пройден");
        return res;
    }
}

