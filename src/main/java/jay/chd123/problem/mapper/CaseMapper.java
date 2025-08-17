package jay.chd123.problem.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import jay.chd123.problem.entity.db.ProblemCase;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CaseMapper extends BaseMapper<ProblemCase> {
}
