package cn.edu.bjfu.javawebproject.service;


import cn.edu.bjfu.javawebproject.mapper.AttachmentMapper;
import cn.edu.bjfu.javawebproject.pojo.Attachment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttachmentService {

    @Autowired
    AttachmentMapper attachmentMapper;

    public void addAttachment(Attachment attachment) {
        attachmentMapper.addAttachment(attachment);
    }

}
