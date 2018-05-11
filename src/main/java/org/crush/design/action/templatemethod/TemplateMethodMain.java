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
public class TemplateMethodMain {
    public static void main (String ...argc){
        AbstractTemplate a= new StudentATemplate("小红");
        AbstractTemplate b= new StudentBTemplate("小明");

        a.question();
        b.question();
    }
}
