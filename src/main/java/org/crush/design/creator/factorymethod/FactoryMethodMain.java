package org.crush.design.creator.factorymethod;

/**
 * <p>
 * Title: TODO
 * </p>
 * <p>
 * Description: 工厂方法模式，又称工厂模式、多态工厂模式和虚拟构造器模式
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
public class FactoryMethodMain {
    public static void main(String ...argc){
        Product a=new FactoryA().manufacture();
        a.show();

        Product b=new FactoryB().manufacture();
        b.show();
    }
}
