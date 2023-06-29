package cn.lucanet.dynamicAPI.common;

import java.io.Serializable;

public interface DynamicAPI extends Serializable {

    String getName();

    String getSQL();

    APITypeEnum getType();

}
