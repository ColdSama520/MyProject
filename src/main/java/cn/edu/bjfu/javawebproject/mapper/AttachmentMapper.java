package cn.edu.bjfu.javawebproject.mapper;


import cn.edu.bjfu.javawebproject.pojo.Attachment;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AttachmentMapper {

    void addAttachment(Attachment attachment);

}
