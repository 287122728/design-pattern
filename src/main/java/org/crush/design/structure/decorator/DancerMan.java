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
public class DancerMan extends  Decorator {
    public DancerMan(Person person) {
        super(person);
    }

    @Override
    public void drink() {
        super.drink();
        System.out.println("喝酒要跳舞");
    }
}
