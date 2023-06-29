package cn.lucanet.dynamicAPI.common;

public enum APITypeEnum {

    SELECT("SELECT"),
    UPDATE("UPDATE"),
    DELETE("DELETE"),
    INSERT("INSERT");

    private String type;

    APITypeEnum(String type){
        this.type = type;
    }

}
