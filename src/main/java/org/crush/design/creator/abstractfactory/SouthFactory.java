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
public class SouthFactory extends  MultiProductFactory {
    public Fruit createFruit() {
        return new SouthFruit();
    }

    public Vegetable createVegetable() {
        return new SouthVegetable();
    }
}
