package org.crush.design.creator.prototype;

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
 * @date 18/4/19
 */
public class ShallowCopyHero extends  Hero {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
