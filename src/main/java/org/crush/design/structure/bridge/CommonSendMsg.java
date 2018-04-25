package org.crush.design.structure.bridge;

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
public class CommonSendMsg extends AbstractSendMsg {
    public CommonSendMsg(ISendMsg iSendMsg) {
        super(iSendMsg);
    }

    @Override
    public void sendMsg(String msg, String toUser) {
        super.sendMsg(msg, toUser);
    }
}
