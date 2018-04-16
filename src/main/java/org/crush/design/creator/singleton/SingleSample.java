package org.crush.design.creator.singleton;

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
 * @date 18/4/13
 */
public class SingleSample {
    private static SingleSample singleSample;
    private static SingleSample singleSample2=new SingleSample();
    private volatile static SingleSample singleSample4;
    private static class SingleSampleHolder{
        public static SingleSample singleSample3=new SingleSample();
    }

    /**
     * 懒汉模式（非线程安全）
     * @return
     */
    public synchronized static SingleSample getInstance1(){
        if(singleSample==null){
            singleSample=new SingleSample();
        }
        return singleSample;
    }

    /**
     * 恶汉模式
     * @return
     */
    public static SingleSample getInstance2(){
        return singleSample2;
    }

    /**
     * 静态内部类（懒汉变种，显示调用才会被初始化）
     * @return
     */
    public static SingleSample getInstance3(){
        return SingleSampleHolder.singleSample3;
    }

    /**
     * 双重校验锁
     * @return
     */
    public static SingleSample getInstance4(){
        if(singleSample4==null){
            synchronized (SingleSample.class){
                if(singleSample4==null){
                    singleSample4=new SingleSample();
                }
            }
        }
        return singleSample4;
    }

    /**
     * 枚举(实际是恶汉模式的变种)
     * @return
     */
    public static SingletonDemo getInstance5(){
        return SingletonDemo.INSTANCE;
    }
    enum SingletonDemo{
        INSTANCE;
        public void otherMethods(){
            System.out.println("Something");
        }
    }
}
