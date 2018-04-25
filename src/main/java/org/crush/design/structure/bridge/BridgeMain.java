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
public class BridgeMain {
    public static void main(String...argc){
        ISendMsg sendMsg=new SendMail();
        AbstractSendMsg abstractSendMsg=new CommonSendMsg(sendMsg);

        abstractSendMsg.sendMsg("加班申请速批","李总");

        sendMsg=new SendSMS();

        abstractSendMsg=new UrgencySendMsg(sendMsg);

        abstractSendMsg.sendMsg("加班申请速批","李总");
    }
}
