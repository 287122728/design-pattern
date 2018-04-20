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
public class JP110VInterfaceImpl implements JP110VInterface {
    @Override
    public void connection() {
        System.out.print("连接电源,开始工作");
    }
}
