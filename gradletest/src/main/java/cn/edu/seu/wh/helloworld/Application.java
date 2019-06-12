/*
 * @author: wanghuan
 * @github:https://github.com/njustwh2014
 */

package cn.edu.seu.wh.helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class Application {
    
    public static void main(String[] args){  
        @SuppressWarnings("resource")
        ApplicationContext context=new AnnotationConfigApplicationContext(Application.class);
        MessagePrinter messagePrinter=context.getBean(MessagePrinter.class);
        messagePrinter.printMessage();
    }
}
