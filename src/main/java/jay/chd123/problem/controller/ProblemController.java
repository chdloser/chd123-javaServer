package jay.chd123.problem.controller;

import jay.chd123.global.customException.BusinessException;
import jay.chd123.global.entity.BasePageReturn;
import jay.chd123.global.entity.BaseViewParam;
import jay.chd123.global.entity.Result;
import jay.chd123.problem.entity.reqParam.ReqProblemList;
import jay.chd123.problem.service.ProblemService;
import jay.chd123.problem.entity.db.Problem;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/game/problem")
public class ProblemController {
    private final ProblemService problemService;

    public ProblemController(ProblemService problemService) {
        this.problemService = problemService;
    }

    @GetMapping()
    public Result<String> getProblems(){
        return Result.success("测试接口联通");
    }

    @PostMapping("/list")
    public Result<BasePageReturn<Problem.ProblemItem>> getProblemList(@RequestBody ReqProblemList req) {
        int page = req.getCurrentPage();
        int pageSize = req.getPageSize();
        List<String> tags = req.getTags();
        BasePageReturn<Problem.ProblemItem> pages = problemService.getProblemPage(page, pageSize, tags);
        return Result.success(pages);
    }

    @PostMapping("/detail")
    public Result<Problem> getProblem(@RequestBody BaseViewParam req) {
        int id = req.getId();
        String code = req.getCode();
        Problem problem = problemService.getProblemDetail(id,code);
        return Result.success(problem);
    }

    @PostMapping("/create")
    public Result<Map<String,Object>> addProblem(@RequestBody Problem problem) {
        if(problem.getInputs().size() != problem.getOutputs().size()){
            throw new BusinessException(-1,"用例数量不一致");
        }
        Integer id = problemService.createProblem(problem);
        HashMap<String,Object> result = new HashMap<>();
        result.put("id",id);
        return Result.success(result);
    }

    @PostMapping("/delete")
    public Result<String> deleteProblem(@RequestBody BaseViewParam req) {
        Integer id = req.getId();
        if(id == null){
            throw new BusinessException(-1,"缺少参数");
        }
        problemService.removeById(id);
        return Result.success("delete success");
    }

    @PostMapping("/update")
    public Result<String> updateProblem(@RequestBody Problem problem) {
        if(problem.getId() == null){
            throw new BusinessException(-1,"缺少参数");
        }
        problemService.updateProblem(problem);
        return Result.success("update success");
    }
}
