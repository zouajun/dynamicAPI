package cn.lucanet.dynamicAPI.common;

import java.io.Serializable;

public interface DynamicAPI extends Serializable {

    String getName();


    //测试

    String getSQL();

    APITypeEnum getType();

}
