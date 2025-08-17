package jay.chd123.global.entity;

import lombok.Data;

import java.util.List;

@Data
public class BasePageReturn<T> {
    public Integer totalCount;
    public Integer currentPage;
    public Integer pageSize;
    public Integer totalPage;
    public List<T> records;
    public BasePageReturn(int currentPage,int pageSize,int totalCount) {
        this.currentPage = currentPage;
        this.pageSize = pageSize;
        this.totalCount = totalCount;
        if(totalCount % pageSize == 0) {
            this.totalPage = totalCount / pageSize;
        }else{
            this.totalPage = totalCount / pageSize + 1;
        }
    }
}
