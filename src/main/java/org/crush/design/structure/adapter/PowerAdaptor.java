package org.crush.design.structure.adapter;

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
public class PowerAdaptor implements JP110VInterface{
    private CN220VInterface target;
    public PowerAdaptor(CN220VInterface cn220VInterface){
        this.target=cn220VInterface;
    }
    public void connection() {
        target.connection();
        System.out.println("开始适配");
    }
}
