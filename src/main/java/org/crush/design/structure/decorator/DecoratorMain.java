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
public class DecoratorMain {
    public static void main(String ...argc){
        Man man =new Man();

        SingerMan singerMan = new SingerMan(man);

        DancerMan dancerMan =new DancerMan(singerMan);

        dancerMan.drink();
    }
}
