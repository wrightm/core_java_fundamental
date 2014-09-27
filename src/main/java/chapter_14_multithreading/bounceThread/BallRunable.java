package chapter_14_multithreading.bounceThread;

import java.awt.*;

/**
 * Created by wrightm on 27/09/2014.
 */
class BallRunnable implements Runnable {
    private Ball ball;
    private Component component;
    public static final int STEPS = 1000;
    public static final int DELAY = 5;

    /**
     * Constructs the runnable.
     *
     * @param aBall      the ball to bounce
     * @param aComponent the component in which the ball bounces
     */
    public BallRunnable(Ball aBall, Component aComponent) {
        ball = aBall;
        component = aComponent;
    }

    public void run() {
        try {
            for (int i = 1; i <= STEPS; i++) {
                ball.move(component.getBounds());
                component.repaint();
                Thread.sleep(DELAY);
            }
        } catch (InterruptedException e) {
        }
    }
}