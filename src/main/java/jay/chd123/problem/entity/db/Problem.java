package jay.chd123.problem.entity.db;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
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
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String code;
    private String title;
    private String description;

    /**
     * 题目难度
     * @see DIFFICULTY
     */
    private String difficulty;
    @TableField(exist = false)
    private List<String> tags = new ArrayList<>();
    @TableField(exist = false)
    private List<String> inputs = new ArrayList<>();
    @TableField(exist = false)
    private List<String> outputs = new ArrayList<>();
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime operateTime;

    @Data
    public static class ProblemItem{
        public ProblemItem(Problem problem){
            this.id = problem.id;
            this.code = problem.code;
            this.title = problem.title;
            this.tags = problem.tags;
            this.difficulty = problem.difficulty;
        }
        private Integer id;
        private String code;
        private String title;
        private String difficulty;
        private List<String> tags;
    }
    public enum DIFFICULTY{
        /**
         * 入门
         */
        begin,
        /**
         * 简单
         */
        easy,
        /**
         * 中等
         */
        medium,
        /**
         * 困难
         */
        hard
    }
}
