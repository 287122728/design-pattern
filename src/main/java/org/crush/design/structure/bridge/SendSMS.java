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
public class SendSMS implements ISendMsg {
    @Override
    public void sendMsg(String msg, String toUser) {
        System.out.println("使用系统内短消息的方法，发送消息'"+msg+"'给"+toUser);
    }
}
