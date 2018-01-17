package com.example.demo.action;

import com.example.demo.model.Teacher;
import com.example.demo.service.TeacherService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/teachers")
public class TeacherCtrl extends BaseCtrl{

    private final static Log logger = LogFactory.getLog(TeacherCtrl.class);

    @Autowired
    private TeacherService teacherService;

    @RequestMapping(value = "",method = RequestMethod.GET)
    public Map<String,Object> queryTeachers(@RequestParam(required = false) String keyword){

        logger.info("查找教师集合 : keyword "+keyword);

        if(StringUtils.isEmpty(keyword)){
            logger.debug("query teachers keyword is empty");
            keyword = "%";
        }

        List<Teacher> teachers = teacherService.query(keyword);

        return success("获取教师列表",teachers);

    }

    @RequestMapping(value="/{teacherId}",method = RequestMethod.GET)
    public Map<String,Object> teacherInfo(@PathVariable final String teacherId){

        logger.info("获取教师( "+teacherId+" ) 信息");

        if (StringUtils.isEmpty(teacherId)){
            return error("请传递正确的教师ID");
        }

        Teacher teacher = teacherService.get(teacherId);

        if(null == teacher){
            return error("没有查找出教师资料");
        }

        return success("教师信息",teacher);
    }

}
