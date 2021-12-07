#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import ${package}.entity.BillHistory;

/**
* @author Administrator
* @description 针对表【_t_bill_history(账单历史记录表)】的数据库操作Mapper
* @createDate 2021-11-29 13:47:40
* @Entity com.redDabbler.review.demo.${artifactId}.entity.BillHistory
*/
public interface BillHistoryMapper extends BaseMapper<BillHistory> {

}




