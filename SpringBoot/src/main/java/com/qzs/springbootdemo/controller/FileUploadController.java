package com.qzs.springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * 文件上传
 */
@RestController//有此注解此类所有返回值会转变成json格式
public class FileUploadController {

    /**
     * 处理文件上传controller
     */
    @RequestMapping("/fileUploadController")
    public Map<String,Object> fileUpload(MultipartFile filename) throws Exception{
        System.out.println("上传的文件是:" + filename.getOriginalFilename());
        filename.transferTo(new File("e:/" + filename.getOriginalFilename()));
        Map<String,Object> map = new HashMap<>();
        map.put("msg","文件" + filename.getOriginalFilename()+"上传成功");
        return map;
    }

}
