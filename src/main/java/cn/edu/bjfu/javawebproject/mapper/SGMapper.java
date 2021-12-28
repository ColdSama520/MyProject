package cn.edu.bjfu.javawebproject.mapper;



import cn.edu.bjfu.javawebproject.pojo.SC;
import org.springframework.stereotype.Repository;

@Repository
public interface SGMapper {

    void deleteSGByGroupId(String group_id);

}
