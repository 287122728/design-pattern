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
public class FacadeMain {
    public static void main(String...argc){
        Mom mom=new Mom();
        System.out.println("肚子饿了");
        mom.makeDish();
        System.out.println("出锅，可以吃饭了");
    }
}
