package jay.chd123.problem.service;

import com.baomidou.mybatisplus.extension.service.IService;
import jay.chd123.global.entity.BasePageReturn;
import jay.chd123.problem.entity.db.Problem;

import java.util.List;

public interface ProblemService extends IService<Problem> {
    Integer createProblem(Problem problem);

    Integer updateProblem(Problem problem);

    Problem getProblemDetail(Integer id, String problemId);

    BasePageReturn<Problem.ProblemItem> getProblemPage(int page, int pageSize, List<String> tags);
}
