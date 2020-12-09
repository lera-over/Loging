import org.junit.Assert;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class LogTest {
    public static Scanner scan = new Scanner(System.in);

    @org.junit.jupiter.api.Test
    void main() {
        int res = 1;
        int R = scan.nextInt();
        int expect = Log.taskRelease(res,R);
        int actual = 4;
        Assert.assertEquals(expect, actual);
    }


}