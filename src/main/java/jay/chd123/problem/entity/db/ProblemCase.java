package jay.chd123.problem.entity.db;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("problem_cases")
public class ProblemCase {
    public enum TYPE {
        EXAMPLE,
        JUDGE
    }
    private Integer id;
    private Integer sId;
    private String problemId;
    private String input;
    private String output;
    private String type;
}
