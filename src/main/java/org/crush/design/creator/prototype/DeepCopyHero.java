package org.crush.design.creator.prototype;

import java.util.ArrayList;

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
public class DeepCopyHero extends Hero {
    @Override
    public Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        try {
            Hero hero = (Hero) super.clone();
            hero.name = new String(this.name);
            hero.age = this.age;
            hero.skills = (ArrayList<String>) this.skills.clone();
            hero.child = child==null?null:(Hero) child.clone();
            return hero;
        } catch (CloneNotSupportedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }
}
