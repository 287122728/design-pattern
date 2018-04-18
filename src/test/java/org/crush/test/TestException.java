package org.crush.test;

import java.util.logging.Logger;

import static java.util.logging.Logger.*;
import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

/**
 * <p>
 * Title: TODO
 * </p>
 * <p>
 * Description: TODO
 * </p>
 * <p>
 * Copyright: Copyright (c) 2017
 * </p>
 * <p>
 * Company: 客如云
 * </p>
 *
 * @author crush_lee
 * @date 18/4/17
 */
public class TestException {
    private static Logger logger= getLogger(TestException.class.getName());
    private static int times=100000;
    public static void main(String ...argc){
        getStackTrace();
        notCatchExceptioin();
        //logStackTrace();
        //logStackTraceWithConvert();

    }
    private static void notCatchExceptioin() {
        long start = System.nanoTime();
        for (int i=0; i<times; ++i) {
            try {
                throw new RuntimeException("" + Math.random());
            } catch (Exception e) {
            }
        }
        System.out.println("time: " + convert((System.nanoTime() - start)));
    }
    private static long convert(long m){
        return m/1000000;
    }
    private static void getStackTrace() {
        long start = System.nanoTime();
        for (int i=0; i<times; ++i) {
            try {
                throw new RuntimeException("" + Math.random());
            } catch (Exception e) {
               StackTraceElement[] t = e.getStackTrace();
                log.print(t[0].toString());
            }
        }
        System.out.println("time: " + convert((System.nanoTime() - start)));
    }
    private static void logStackTrace() {
        long start = System.nanoTime();
        for (int i=0; i<times; ++i) {
            try {
                throw new RuntimeException("" + Math.random());
            } catch (Exception e) {
                log.print(e);
            }
        }
        System.out.println("time: " + convert((System.nanoTime() - start)));
    }
    private static void logStackTraceWithConvert() {
        long start = System.nanoTime();
        for (int i=0; i<times; ++i) {
            try {
                throw new RuntimeException("" + Math.random());
            } catch (Exception e) {
                StackTraceElement[] t = e.getStackTrace();
                log.print(convertLog(t));
            }
        }
        System.out.println("time: " + convert((System.nanoTime() - start)));
    }
    private static String convertLog(StackTraceElement[] stacks){
        String content=null;
        if (stacks != null && stacks.length > 0) {
            StackTraceElement stackTraceElement = stacks[0];
            if (stackTraceElement.getClassName().equals(
                    TestException.class.getName())
                    && stacks.length > 1) {
                content = getContent(stacks[1]);
            } else {
                content = getContent(stackTraceElement);
            }
        }
        return content;
    }
    private static String getContent(StackTraceElement stackTraceElement) {
        StringBuilder builder = new StringBuilder();
        builder.append(stackTraceElement.getClassName()).append(".")
                .append(stackTraceElement.getMethodName()).append("(")
                .append(stackTraceElement.getFileName()).append(":")
                .append(stackTraceElement.getLineNumber()).append(")");
        return builder.toString();
    }
}
