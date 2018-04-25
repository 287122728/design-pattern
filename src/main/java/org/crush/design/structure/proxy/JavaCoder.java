package org.crush.design.structure.proxy;

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
public class JavaCoder implements ICoder {
    private String name;
    public JavaCoder(String name){
        this.name=name;
    }
    @Override
    public void implDemand(String demand) {
        System.out.println(name+" implements "+ demand +" in Java");
    }
}
