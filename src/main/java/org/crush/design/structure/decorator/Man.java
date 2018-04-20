package org.crush.design.structure.decorator;

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
 * @date 18/4/20
 */
public class Man implements Person {
    @Override
    public void eat() {
        System.out.println("男人在吃饭");
    }

    @Override
    public void drink() {
        System.out.println("男人在喝酒");
    }
}
