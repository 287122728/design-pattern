package org.crush.design.structure.adapter;

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
public class AdapterMain {
    public static void main(String ...argc){
        CN220VInterface cn220VInterface=new CN220VInterfaceImpl();

        PowerAdaptor powerAdaptor=new PowerAdaptor(cn220VInterface);
        //日本电饭煲想使用中国电源
        ElectricCooker cooker=new ElectricCooker(powerAdaptor);
        cooker.cook();
    }
}
