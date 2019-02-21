package info.unclewang.chapter02.e01;

public class LocalService implements IService {
    @Override
    public String sayHello() {
        return "Hello LocalService";
    }

    @Override
    public String getScheme() {
        return "local";
    }
}