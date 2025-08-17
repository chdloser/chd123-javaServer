package jay.chd123.problem.service.servieImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import jay.chd123.problem.entity.db.ProblemCase;
import jay.chd123.problem.mapper.CaseMapper;
import jay.chd123.problem.service.CaseService;
import org.springframework.stereotype.Service;

@Service
public class CaseServiceImpl extends ServiceImpl<CaseMapper, ProblemCase> implements CaseService {
}
