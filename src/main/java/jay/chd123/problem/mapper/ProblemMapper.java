package jay.chd123.problem.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import jay.chd123.problem.entity.db.Problem;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProblemMapper extends BaseMapper<Problem> {
}
