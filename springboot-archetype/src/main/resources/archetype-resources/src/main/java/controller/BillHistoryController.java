#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.controller;


import ${package}.common.Page;
import ${package}.common.Result;
import ${package}.entity.BillHistory;
import ${package}.service.BillHistoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * @author RedDabbler
 * @version 1.0
 * @date 2021/11/30
 */
@RequestMapping("/api/v1/")
@RestController
@Api(value = "处理账单")
public class BillHistoryController {

    @Autowired
    private BillHistoryService billHistoryService;

    @ApiOperation(value="获取账单列表", notes="")
    @ApiImplicitParams({
            @ApiImplicitParam(name="type",value="类型",required=true,paramType="form",dataType="int"),
            @ApiImplicitParam(name="source",value="来源",required=true,paramType="form",dataType="int")
    })
    @GetMapping(value = "/bill",produces = MediaType.APPLICATION_JSON_VALUE)
    public Result<?> list(@RequestParam(required = false) BillHistory billHistory){
        List<BillHistory> billHistoryList =  billHistoryService.list(billHistory);
        return Result.build().ok(billHistoryList);
    }

    @GetMapping(value = "/bill/page",produces = MediaType.APPLICATION_JSON_VALUE)
    public Result<?> page(@RequestParam(required = false) BillHistory billHistory,@RequestParam(name="pageNo", defaultValue="1") Integer pageNo,
                          @RequestParam(name="pageSize", defaultValue="10") Integer pageSize){
        Page<BillHistory> page =  billHistoryService.page(billHistory,pageNo,pageSize);
        return Result.build().ok(page);
    }

    @PutMapping(value = "/bill",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public Result<?> put(@RequestBody BillHistory billHistory){
        billHistoryService.saveOrUpdate(billHistory);
        return Result.build().ok();
    }

    @PostMapping(value = "/bill",produces =MediaType.APPLICATION_JSON_VALUE)
    public Result post(@RequestBody BillHistory billHistory){
        billHistoryService.save(billHistory);
        return Result.build().ok();
    }

    @DeleteMapping(value = "/bill/{id}",produces =MediaType.APPLICATION_JSON_VALUE)
    public Result delete(@PathVariable String id){
        billHistoryService.removeById(id);
        return Result.build().ok();
    }

    @RequestMapping(value = "/bill",method = RequestMethod.OPTIONS,produces =MediaType.APPLICATION_JSON_VALUE)
    public Result<?> getOption(){
        ResponseEntity responseEntity =  ResponseEntity.ok().allow(HttpMethod.DELETE,HttpMethod.GET,
                HttpMethod.POST,HttpMethod.PUT,HttpMethod.OPTIONS).build();
        return Result.build().ok(responseEntity);

    }
}
