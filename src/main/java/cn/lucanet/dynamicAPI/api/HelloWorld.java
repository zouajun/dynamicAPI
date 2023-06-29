package cn.lucanet.dynamicAPI.api;

import cn.lucanet.dynamicAPI.common.BaseResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping("/hello")
    public BaseResponse<String> hello(){
        return BaseResponse.success("hello");
    }

}
