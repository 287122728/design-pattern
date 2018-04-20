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
public class Decorator implements Person {
    private Person person;
    public Decorator(Person person){
        this.person=person;
    }
    @Override
    public void eat() {
        person.eat();
    }

    @Override
    public void drink() {
        person.drink();
    }
}
