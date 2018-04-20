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
public class ElectricCooker {
    private JP110VInterface jp110VInterface;
    public ElectricCooker(JP110VInterface jp110VInterface){
        this.jp110VInterface=jp110VInterface;
    }
    public void cook(){
        jp110VInterface.connection();
        System.out.println("开始煮饭");
    }
}
