/*
 * Created on May 9, 2018
 *
 */
package main;

import test.Test;

public class Main {

    public static void main(String[] args) {
        Test t = new Test();
//        t.simpleDelay();
//        t.waitDelay();
//        t.loopDelay();
//        t.threadWaitDelay();
        t.testSingInThreads();
    }

}
