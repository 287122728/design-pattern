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
public class CodeProxy  implements ICoder{
    private ICoder coder;
    public CodeProxy(ICoder coder){
        this.coder=coder;
    }
    @Override
    public void implDemand(String demand) {
        if(demand.contains("ADD")){
            System.out.println("No longer accept 'ADD' demand");
            return;
        }
        coder.implDemand(demand);
    }
}
