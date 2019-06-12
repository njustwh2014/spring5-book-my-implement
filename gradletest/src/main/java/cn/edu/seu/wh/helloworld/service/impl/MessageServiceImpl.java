/*
 * @author: wanghuan
 * @github:https://github.com/njustwh2014
 */

package cn.edu.seu.wh.helloworld.service.impl;

import cn.edu.seu.wh.helloworld.service.MessageService;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl implements MessageService {

    @Override
    public String getMessage() {
        return "hello world!";
    }
}
