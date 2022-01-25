package cn.edu.bjfu.javawebproject.controller;

import lombok.Value;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.transform.Result;
import java.io.*;
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

    @GetMapping("/download")
    public void logDownload(String name, HttpServletResponse response) throws Exception {
//        File file = new File("C:/Users/13606/Desktop/UpLoad-cs/" + File.separator + name);
        File file = new File(File.separator + name);
        if (!file.exists()) {
            System.out.println(name + "文件不存在");
        }
        response.setContentType("application/force-download");
        response.addHeader("Content-Disposition", "attachment;fileName=" + name);

        byte[] buffer = new byte[1024];
        try (FileInputStream fis = new FileInputStream(file);
             BufferedInputStream bis = new BufferedInputStream(fis)) {

            OutputStream os = response.getOutputStream();

            int i = bis.read(buffer);
            while (i != -1) {
                os.write(buffer, 0, i);
                i = bis.read(buffer);
            }
        }
    }


}


