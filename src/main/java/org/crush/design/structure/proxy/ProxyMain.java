package org.crush.design.structure.proxy;

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
public class ProxyMain {
    public static void main(String ...argc){
        ICoder coder=new JavaCoder("crush");
        CodeProxy codeProxy=new CodeProxy(coder);
        codeProxy.implDemand("test");

        codeProxy.implDemand("ADD demand");
    }
}
