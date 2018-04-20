package org.crush.design.creator.builder;

/**
 * <p>
 * Title: 重叠构造器（telescoping constructor）
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
public class Student4Construct {
    private int id;
    private String name;
    private String sex;
    private String password;
    private String address;
    private String phone;
    private String desc;

    public Student4Construct(int id) {
        this.id = id;
    }

    public Student4Construct(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student4Construct(int id, String name, String sex) {
        this.id = id;
        this.name = name;
        this.sex = sex;
    }

    public Student4Construct(int id, String name, String sex, String password) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.password = password;
    }

    public Student4Construct(int id, String name, String sex, String password, String address) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.password = password;
        this.address = address;
    }

    public Student4Construct(int id, String name, String sex, String password, String address,
            String phone) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.password = password;
        this.address = address;
        this.phone = phone;
    }

    public Student4Construct(int id, String name, String sex, String password, String address,
            String phone, String desc) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.password = password;
        this.address = address;
        this.phone = phone;
        this.desc = desc;
    }
}
