package cn.xtrui.mbp.temp;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyTest {
    public static void main(String[] args) {
        TimeTest tt = new TimeTest();
        Hehe t =  (Hehe) Proxy.newProxyInstance(tt.getClass().getClassLoader(), tt.getClass().getInterfaces(), new InvocationHandler() {
        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            method.invoke(tt,args);
            System.out.println("代理成功");
            return null;
            }
         });
        t.p();

    }



}
