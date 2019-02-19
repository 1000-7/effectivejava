package info.unclewang.chapter2.e01;

import java.util.ServiceLoader;

public class Main{
    public static void main(String[] args) {
        ServiceLoader<IService> serviceLoader = ServiceLoader.load(IService.class);
        for (IService service : serviceLoader) {
            System.out.println(service.getScheme() + "=" + service.sayHello());
        }
    }
}