package org.crush.design.creator.simplefactory;

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
 * @date 18/4/16
 */
public class SimplePayFactoryTest {
    public static void main(String[] args){
        SimpleFactory mFactory = new SimpleFactory();

        //客户要产品A
        try {
            //调用工厂类的静态方法 & 传入不同参数从而创建产品实例
            mFactory.Manufacture("A").show();
        }catch (NullPointerException e){
            System.out.println("没有这一类产品");
        }

        //客户要产品B
        try {
            mFactory.Manufacture("B").show();
        }catch (NullPointerException e){
            System.out.println("没有这一类产品");
        }

    }
}
