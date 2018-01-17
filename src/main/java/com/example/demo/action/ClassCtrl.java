package com.example.demo.action;

import com.example.demo.model.Class;
import com.example.demo.service.ClassService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/classes")
public class ClassCtrl extends BaseCtrl {

    private final static Log logger = LogFactory.getLog(ClassCtrl.class);

    @Autowired
    private ClassService classService;

    @RequestMapping(value = "",method = RequestMethod.GET)
    public Map<String,Object> allClasses(){

        logger.info("获取所有学生集合");

        List<Class> classes = classService.all();

        return success("获取班级列表",classes);
    }

    @RequestMapping(value = "/{classId}",method = RequestMethod.GET)
    public Map<String,Object> classInfo(@PathVariable final String classId){

        logger.info("获取班级( "+classId+" ) 信息");

        if (StringUtils.isEmpty(classId)){
            return error("请传递正确的班级ID");
        }

        // 班级级别信息
        Class clazz = classService.get(classId);

        if(null == clazz){
            return error("没有查找出班级信息");
        }

        // 班级学生总数
        int studentCount = classService.studentCount(classId);

        Map<String,Object> clazzDetail = new HashMap();
        BeanUtils.copyProperties(clazz,clazzDetail);

        clazzDetail.put("count",studentCount);

        return success("班级详情",clazzDetail);
    }

    @RequestMapping(value = "",method = RequestMethod.POST)
    public Map<String,Object> createClass(@RequestBody Class clazz){
        classService.save(clazz);
        return success("成功保存班级");
    }

}
