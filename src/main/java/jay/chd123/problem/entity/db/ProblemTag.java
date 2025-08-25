package jay.chd123.problem.entity.db;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("problem_tags")
public class ProblemTag {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private Integer sId;
    private String sCode;
    private String tagName;
}
