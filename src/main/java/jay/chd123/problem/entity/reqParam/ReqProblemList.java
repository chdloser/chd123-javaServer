package jay.chd123.problem.entity.reqParam;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class ReqProblemList{
    private Integer currentPage;
    private Integer pageSize;
    private List<String> tags;
    private Map<String,Object> conditions;
}
