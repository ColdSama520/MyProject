package cn.edu.bjfu.javawebproject.controller;

import lombok.Value;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import javax.xml.transform.Result;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/File")
public class UploadController {


    @PostMapping("/upload")
    public void Upload(@RequestParam MultipartFile file) throws IOException {

        String fileName = file.getOriginalFilename();
        String filePath = "C:/Users/13606/Desktop/UpLoad-cs/" + fileName;
        File dest = new File(filePath);
        file.transferTo(dest);

    }



}


