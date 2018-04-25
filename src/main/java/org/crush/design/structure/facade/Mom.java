package org.crush.design.structure.facade;

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
 * @date 18/4/23
 */
public class Mom {
    Material material;
    Pan pan;
    Flavouring flavouring;
    public Mom(){
        this.material = new Material();
        this.pan = new Pan();
        this.flavouring = new Flavouring();
    }
    public void makeDish(){
        material.prepare();
        pan.wash();
        flavouring.add();
    }
}
