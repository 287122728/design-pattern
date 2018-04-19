package org.crush.design.creator.builder;

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
public class BuilderMain {
    public static void main(String... argc) {
        Student s = new Student.Builder(123, "test").setAddress("东旭").setDesc("desc").setPassword
                ("password").setSex("male").build();
    }
}
