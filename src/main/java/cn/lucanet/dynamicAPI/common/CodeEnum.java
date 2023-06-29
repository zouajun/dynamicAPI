package cn.lucanet.dynamicAPI.common;

public enum CodeEnum {

    SUCCESS("200","Success"),
    ERROR("500","ERROR");

    private final String code;
    private final String message;

    CodeEnum(String code , String message){
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

}
