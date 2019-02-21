package info.unclewang.chapter02.e02;

import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;

public class Builder {
    public static void main(String[] args) {
        //这个更像静态工厂方法，不同的参数构造器转换成append方法。
        new StringBuilder("asd").append("asda").append("safsa");

        QueryBuilder rangeQuery1 = QueryBuilders.rangeQuery("price")
                .from(5)
                .to(10)
                .includeLower(true)
                .includeUpper(false);

    }
}
