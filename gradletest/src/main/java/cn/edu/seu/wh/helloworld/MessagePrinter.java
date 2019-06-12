/*
 * @author: wanghuan
 * @github:https://github.com/njustwh2014
 */

package cn.edu.seu.wh.helloworld;

import cn.edu.seu.wh.helloworld.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessagePrinter {
    final private MessageService messageService;

    @Autowired
    public MessagePrinter(MessageService messageService) {
        this.messageService = messageService;
    }

    public void printMessage(){
        System.out.println(messageService.getMessage());
    }


}
