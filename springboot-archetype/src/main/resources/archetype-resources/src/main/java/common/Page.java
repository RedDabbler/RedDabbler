#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.common;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.metadata.OrderItem;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author RedDabbler
 * @version 1.0
 * @date 2021/12/1
 */
@NoArgsConstructor
public class Page<T> implements IPage {
    // 默认从1开始表示第一页
    private List<T> records;


    /**
     * 总数
     */
    protected long total = 0;
    /**
     * 每页显示条数，默认 10
     */
    protected long size = 10;

    /**
     * 当前页
     */
    protected long current = 1;


    public Page(int current, int size) {
        if(current<=0){
            throw new IllegalArgumentException("pageSize必须大于0");
        }
        if(current<0){
            throw new IllegalArgumentException("pageNo不合法");
        }
        this.current = current;
        this.size = size;
    }

    public Page(int current, int size, int total) {
        this(current,size);
        this.total = total;
    }






    public boolean hasPrevious() {
        return this.current > 1;
    }


    /**
     * 是否存在下一页
     *
     * @return true / false
     */
    public boolean hasNext() {
        return this.current < this.getPages();
    }

    @Override
    public long getPages() {
        return IPage.super.getPages();
    }


    @Override
    public List<OrderItem> orders() {
        return null;
    }

    @Override
    public List<T> getRecords() {
        return records;
    }

    @Override
    public IPage setRecords(List records) {
        int size = records.size();
        setSize(size);
        this.records = records;
        return this;
    }

    @Override
    public long getTotal() {
        return total;
    }

    @Override
    public IPage setTotal(long total) {
        this.total = total;
        return this;
    }

    @Override
    public long getSize() {
        return size;
    }

    @Override
    public IPage setSize(long size) {
        this.size = size;
        return this;
    }

    @Override
    public long getCurrent() {
        return current;
    }

    @Override
    public IPage setCurrent(long current) {
        this.current = current;
        return this;
    }
}
