package cn.lucanet.dynamicAPI.common;

import lombok.Data;

@Data
public class BaseResponse<T> {

    private String code;

    private String message;

    private T data;

    private BaseResponse(String code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public BaseResponse(CodeEnum codeEnum, T data) {
        this.code = codeEnum.getCode();
        this.message = codeEnum.getMessage();
        this.data = data;
    }

    public static <T> BaseResponse<T> success(T data){
        return new BaseResponse(CodeEnum.SUCCESS ,data);
    }

    public static <T> BaseResponse<T> error(T data){
        return new BaseResponse(CodeEnum.ERROR ,data);
    }


}
