package org.crush.design.creator.factorymethod;

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
public class FactoryA extends Factory {
    public Product manufacture() {
        return new ProductA();
    }
}
