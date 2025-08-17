package jay.chd123.problem.service.servieImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import jay.chd123.problem.entity.db.ProblemTag;
import jay.chd123.problem.mapper.TagMapper;
import jay.chd123.problem.service.TagService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagServiceImpl extends ServiceImpl<TagMapper, ProblemTag> implements TagService {
    @Override
    public List<Integer> findProblemIdsByTags(List<String> tagList){
        List<Integer> ids = baseMapper.findProblemIdsWithAnyTags(tagList);
        return ids;
    }
}
