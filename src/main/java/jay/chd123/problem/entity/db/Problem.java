package jay.chd123.problem.entity.db;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
public class Problem implements Serializable {
    private static final long serialVersionUID = 1L;
    @TableId
    private Integer id;
    private String problemId;
    private String title;
    private String description;
    @TableField(exist = false)
    private List<String> tags = new ArrayList<>();
    @TableField(exist = false)
    private List<String> inputs = new ArrayList<>();
    @TableField(exist = false)
    private List<String> outputs = new ArrayList<>();
    @TableField(fill = FieldFill.INSERT_UPDATE)
    LocalDateTime operateTime;

    @Data
    public static class ProblemItem{
        public ProblemItem(Problem problem){
            this.id = problem.id;
            this.problemId = problem.problemId;
            this.title = problem.title;
            this.tags = problem.tags;
        }
        private Integer id;
        private String problemId;
        private String title;
        private List<String> tags;
    }
}
