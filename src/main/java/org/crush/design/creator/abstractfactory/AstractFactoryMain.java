package org.crush.design.creator.abstractfactory;

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
 * @date 18/4/18
 */
public class AstractFactoryMain {
    public static void main(String ...argc){
        MultiProductFactory north=new NorthFactory();
        MultiProductFactory south=new SouthFactory();

        north.createFruit().fruitInfo();
        north.createVegetable().vegetableInfo();

        south.createFruit().fruitInfo();
        south.createVegetable().vegetableInfo();
    }
}
