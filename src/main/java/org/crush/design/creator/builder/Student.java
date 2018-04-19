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
public class Student {
    private int id;
    private String name;
    private String sex;
    private String password;
    private String address;
    private String phone;
    private String desc;
    private Student(Builder builder){
        this.id=builder.id;
        this.name=builder.name;
        this.sex=builder.sex;
        this.password=builder.password;
        this.address=builder.address;
        this.phone=builder.phone;
        this.desc=builder.desc;
    }

    public static class Builder{
        private int id;
        private String name;
        private String sex;
        private String password;
        private String address;
        private String phone;
        private String desc;
        public Builder(int id,String name){
            this.id=id;
            this.name=name;
        }

        public Builder setSex(String sex) {
            this.sex = sex;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public Student build(){
            return new Student(this);
        }
    }
}

