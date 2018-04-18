package org.crush.design.creator.simplefactory;

import org.crush.design.creator.factorymethod.Product;
import org.crush.design.creator.factorymethod.ProductA;
import org.crush.design.creator.factorymethod.ProductB;

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
public class SimpleFactory {
    public static Product Manufacture(String productName){
        //工厂类里用switch语句控制生产哪种商品；
        //使用者只需要调用工厂类的静态方法就可以实现产品类的实例化。
        if (productName.equals("A")) {
            return new ProductA();
        } else if (productName.equals("B")) {
            return new ProductB();
        } else {
            return null;
        }
    }
}
