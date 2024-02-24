package in.testonics.omni.models;

import java.awt.*;

public class MouseMover {

    public static void keepAliveByMouseMove() throws Exception {
        System.out.println("Keep Alive utility will stop after 10 seconds by default. Pass the timeoutInSeconds parameter to customize");
        keepAliveByMouseMove(10);
    }

    public static void keepAliveByMouseMove(int timeoutInSeconds) throws Exception {
        keepAliveByMouseMove(timeoutInSeconds,5);
    }

    public static void keepAliveByMouseMove(int timeoutInSeconds, int moveIntervalInSeconds) throws Exception {
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