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
public class PrototypeMain {
    public static void main(String ...argc) throws CloneNotSupportedException {
        normalDeep();
        shallow();
        deepWithSerializable();
    }
    private static void normalDeep() throws CloneNotSupportedException {
        DeepCopyHero deepHero=new DeepCopyHero();

        deepHero.setChild(new DeepCopyHero());
        deepHero.getChild().setAge(21);
        deepHero.getChild().setName("deep hero child");
        deepHero.getChild().addSkill("坑爹");

        deepHero.setName("deep hero");
        deepHero.setAge(20);
        deepHero.addSkill("榴霰弹");
        deepHero.addSkill("爆头");
        deepHero.addSkill("瞄准");
        deepHero.addSkill("暗杀");

        DeepCopyHero deepCopy = (DeepCopyHero) deepHero.clone();
        deepHero.addSkill("潜水");
        deepHero.getChild().addSkill("坑爹+1");

        System.out.println(deepCopy.toString());
        System.out.println(deepCopy==deepHero);
        System.out.println(deepHero.getName()==deepCopy.getName());
        System.out.println(deepHero.getSkills()==deepCopy.getSkills());
    }
    private static void shallow() throws CloneNotSupportedException{
        ShallowCopyHero shallowHero=new ShallowCopyHero();

        shallowHero.setChild(new ShallowCopyHero());
        shallowHero.getChild().setAge(21);
        shallowHero.getChild().setName("shallow hero child");
        shallowHero.getChild().addSkill("坑爹");


        shallowHero.setName("shallow hero");
        shallowHero.setAge(20);
        shallowHero.addSkill("榴霰弹");
        shallowHero.addSkill("爆头");
        shallowHero.addSkill("瞄准");
        shallowHero.addSkill("暗杀");

        ShallowCopyHero shallowCopy = (ShallowCopyHero) shallowHero.clone();

        shallowHero.addSkill("潜水");
        shallowHero.getChild().addSkill("坑爹+1");

        System.out.println(shallowCopy.toString());
        System.out.println(shallowCopy==shallowHero);
        System.out.println(shallowCopy.getName()==shallowHero.getName());//深拷贝
        System.out.println(shallowCopy.getSkills()==shallowHero.getSkills());//深拷贝
    }
    private static void deepWithSerializable(){
        DeepCopyHeroWithSerializable deepHeroWithS=new DeepCopyHeroWithSerializable();

        deepHeroWithS.setChild(new DeepCopyHeroWithSerializable());
        deepHeroWithS.getChild().setAge(21);
        deepHeroWithS.getChild().setName("deep hero child");
        deepHeroWithS.getChild().addSkill("坑爹");

        deepHeroWithS.setName("deep hero");
        deepHeroWithS.setAge(20);
        deepHeroWithS.addSkill("榴霰弹");
        deepHeroWithS.addSkill("爆头");
        deepHeroWithS.addSkill("瞄准");
        deepHeroWithS.addSkill("暗杀");

        DeepCopyHeroWithSerializable deepHeroCopyWithS = deepHeroWithS.deepClone();

        deepHeroWithS.addSkill("潜水");
        deepHeroWithS.getChild().addSkill("坑爹+1");

        System.out.println(deepHeroCopyWithS.toString());
        System.out.println(deepHeroCopyWithS==deepHeroWithS);
        System.out.println(deepHeroCopyWithS.getName()==deepHeroWithS.getName());//浅拷贝
        System.out.println(deepHeroCopyWithS.getSkills()==deepHeroWithS.getSkills());//浅拷贝
    }
}
