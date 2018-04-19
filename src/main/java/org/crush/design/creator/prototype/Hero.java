package org.crush.design.creator.prototype;

import java.io.Serializable;
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
public class Hero implements Cloneable,Serializable {
    private static final long serialVersionUID = -6043729426933141792L;
    protected String name;
    protected int age;
    protected ArrayList<String> skills = new ArrayList<String>();
    protected Hero child;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<String> getSkills() {
        return skills;
    }
    public void addSkill(String skill){
        if(!skills.contains(skill)){
            skills.add(skill);
        }
    }

    public void setSkills(ArrayList<String> skills) {
        this.skills = skills;
    }

    public Hero getChild() {
        return child;
    }

    public void setChild(Hero child) {
        this.child = child;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("name[").append(name).append("],");
        sb.append("age[").append(age).append("],");
        sb.append("skill[").append(skills).append("],");
        sb.append("child[").append(child==null?"":child.toString()).append("]");
        return sb.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
