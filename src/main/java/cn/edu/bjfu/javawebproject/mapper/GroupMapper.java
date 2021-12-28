package cn.edu.bjfu.javawebproject.mapper;



import org.springframework.stereotype.Repository;

@Repository
public interface GroupMapper {

    void deleteGroup(String project_id);

}
