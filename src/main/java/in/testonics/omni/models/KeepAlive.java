package in.testonics.omni.models;

import java.awt.*;

public class KeepAlive {

    public static void keepAliveByMouseMove() throws Exception {
        int defaultTimeInSeconds = 3600;
        System.out.println("Keep Alive utility will stop after " + defaultTimeInSeconds + " seconds by default. Pass the timeoutInSeconds parameter to customize.");
        keepAliveByMouseMove(defaultTimeInSeconds);
    }

    public static void keepAliveByMouseMove(int timeoutInSeconds) throws Exception {
        System.out.println("Keep Alive utility started with a timeout of " + timeoutInSeconds + " seconds");
        int moveIntervalInSeconds = 5;
        long sleepTime = moveIntervalInSeconds* 1000L;
        Robot robot = new Robot();
        long currentTimeInMillis = System.currentTimeMillis();
        long timeout = currentTimeInMillis + (timeoutInSeconds * 1000L);
        while (System.currentTimeMillis() < timeout) {
            Point point = MouseInfo.getPointerInfo().getLocation();
            robot.mouseMove(point.x, point.y);
            Thread.sleep(sleepTime);
        }
        System.out.println("Keep Alive utility stopped");
    }
}