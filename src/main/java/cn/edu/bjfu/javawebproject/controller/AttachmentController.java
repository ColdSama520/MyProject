package cn.edu.bjfu.javawebproject.controller;



import cn.edu.bjfu.javawebproject.pojo.Attachment;
import cn.edu.bjfu.javawebproject.service.AttachmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/Attachment")
public class AttachmentController {

    @Autowired
    AttachmentService attachmentService;

    @GetMapping("/addAttachment")
    public void addAttachment(Attachment attachment) {
        attachmentService.addAttachment(attachment);
    }

}
