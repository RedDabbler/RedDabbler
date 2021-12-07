#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author RedDabbler
 * @version 1.0
 * @date 2021/11/30
 */
@Getter
@NoArgsConstructor
@JsonInclude(value= JsonInclude.Include.NON_NULL)
public class Result<T> {
    private T data;
    private int code;
    private String message;
    private Page page;
    private long timestamp = System.currentTimeMillis();



    public static Result build(){
        return new Result();
    }

    public Result ok(){
        this.code = 200;
        return this;
    }
    public Result ok(T data){
        this.code = 200;
        this.data = data;
        return this;
    }

    public Result error(int code,Throwable throwable){
        this.code = code;
        this.message = throwable.getMessage();
        return this;
    }




}
