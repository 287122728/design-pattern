package org.crush.design.action.templatemethod;

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
 * @date 18/4/25
 */
public abstract class AbstractTemplate {
    private String name;
    public AbstractTemplate(String name){
        this.name=name;
    }
    public void question(){
        System.out.print(name + ":1 + 1 = ");
        System.out.print(answer());
        System.out.println();
    }
    public abstract int answer();
}
