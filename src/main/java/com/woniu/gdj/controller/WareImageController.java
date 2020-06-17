package com.woniu.gdj.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.woniu.gdj.entity.Ware;
import com.woniu.gdj.entity.Wareimage;
import com.woniu.gdj.service.IWareImageService;
import com.woniu.gdj.service.IWareService;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.util.*;

/**
 * @author cjw
 * @create 2020/06/10 17:33:01
 */
@RestController
@RequestMapping("/wareImage")
public class WareImageController {
    @Resource
    private IWareImageService wareImageServiceImpl;
    @Resource
    private IWareService wareServiceImpl;
    @GetMapping("/findAll")
    public Map findAll(PageInfo<Wareimage> page,Wareimage wareimage){
        /*开启分页插件拦截器*/
        PageHelper.startPage(page.getPageNum(), page.getPageSize());
        List<Wareimage> wareImageList = wareImageServiceImpl.findAll(wareimage);
        for (Wareimage wareimage1 : wareImageList) {
            Ware ware = wareimage1.getWare();
            System.out.println(ware.toString());
        }
        List<Ware> wareList = wareServiceImpl.list();
        //用 PageInfo 对查询结果进行包装
        PageInfo<Wareimage> pageInfo = new PageInfo(wareImageList);
        Map map = new HashMap<>();
        map.put("wareList",wareList);
        map.put("wareImageList",wareImageList);
        map.put("pageInfo",pageInfo);
        return map;
    }
    @GetMapping("/wareList")
    public List wareList(){
        List<Ware> wareList = wareServiceImpl.list();
        return wareList;
    }
    @PostMapping("/save")
    public void save(Wareimage wareimage, @RequestParam(value="file",required=false) MultipartFile multipartFile,HttpServletRequest request){
        //获得上传文件的名字
        //getOriginalFilename()可以获得文件的名字
        String fileName = multipartFile.getOriginalFilename();
        //获得上传文件的后缀
        String suffix = fileName.substring(fileName.lastIndexOf("."));
        //通过request获得"/"项目发布位置的绝对路径
        //声明文件保存的位置
//        String realPath = request.getServletContext().getRealPath("/upload");
//        System.out.println(realPath);
        String filePath = System.getProperty("user.dir") + "\\src\\main\\resources\\static\\image\\";
//        String realPath = "C:\\Users\\26053\\Desktop\\gdj\\images";
        //获得项目发布后保存上传文件目录的File对象
        File file = new File(filePath);
        //file.exists()判断File对象是否存在
        if (file.exists()) {
            //不存在则创建
            file.mkdirs();
        }
        //声明一个新的文件名（不重复）
        //文件名不重复 00847636-5c86-4202-a8b9-8b340a0875c4.png
        //可以使用当前时间的毫秒数，将本方法变成线程安全的。
        String newFileName = UUID.randomUUID()+suffix;
        //声明一个新的文件(上传文件的目标对象)
        File target = new File(file,newFileName);
        try {
            //将上传的临时文件写入指定位置
            multipartFile.transferTo(target);
        } catch (Exception  e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        wareimage.setUrl(newFileName);
        wareimage.setIsdelete(1);
        wareimage.setCreatedt(new Date());
        wareImageServiceImpl.save(wareimage);
    }
    @PostMapping("/update")
    public void update(Wareimage wareimage,@RequestParam(value="file",required=false) MultipartFile multipartFile,HttpServletRequest request){
//获得上传文件的名字
        //getOriginalFilename()可以获得文件的名字
        String fileName = multipartFile.getOriginalFilename();
        //获得上传文件的后缀
        String suffix = fileName.substring(fileName.lastIndexOf("."));
        //通过request获得"/"项目发布位置的绝对路径
        //声明文件保存的位置
//        String realPath = request.getServletContext().getRealPath("/upload");
//        System.out.println(realPath);
        String filePath = System.getProperty("user.dir") + "\\src\\main\\resources\\static\\image\\";
        //String realPath = "C:\\Users\\26053\\Desktop\\gdj\\images";
        //获得项目发布后保存上传文件目录的File对象
        File file = new File(filePath);
        //file.exists()判断File对象是否存在
        if (file.exists()) {
            //不存在则创建
            file.mkdirs();
        }
        //声明一个新的文件名（不重复）
        //文件名不重复 00847636-5c86-4202-a8b9-8b340a0875c4.png
        //可以使用当前时间的毫秒数，将本方法变成线程安全的。
        String newFileName = UUID.randomUUID()+suffix;
        //声明一个新的文件(上传文件的目标对象)
        File target = new File(file,newFileName);
        try {
            //将上传的临时文件写入指定位置
            multipartFile.transferTo(target);
        } catch (Exception  e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        wareimage.setUrl(newFileName);
        wareImageServiceImpl.update(wareimage);
    }
    @GetMapping("/delete")
    public void delete(int wareimageid){
        wareImageServiceImpl.delete(wareimageid);
    }
    @GetMapping("/findById")
    public Map findById(int wareimageid){
        List<Ware> wareList = wareServiceImpl.list();
        Map map = new HashMap();
        Wareimage wareimage = wareImageServiceImpl.findById(wareimageid);
        map.put("wareList",wareList);
        map.put("wareimage",wareimage);
        return map;
    }
}
