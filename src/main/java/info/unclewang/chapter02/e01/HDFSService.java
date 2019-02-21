package info.unclewang.chapter02.e01;

public class HDFSService implements IService {

    @Override
    public String sayHello() {
        return "Hello HDFSService";
    }

    @Override
    public String getScheme() {
        return "hdfs";
    }

}