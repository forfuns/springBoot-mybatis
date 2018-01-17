package com.example.demo.action;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/students")
public class StudentCtrl extends BaseCtrl{

    private final static Log logger = LogFactory.getLog(StudentCtrl.class);

    @Autowired
    private StudentService studentService;

    /**
     * 获取所有学生信息
     * @return
     */
    @RequestMapping(value="",method = RequestMethod.GET)
    public Map<String,Object> allStudents(){

        logger.info("获取所有学生集合");

        List<Student> students = studentService.all();

        return success("获取学生列表",students);
    }

    @RequestMapping(value="/{studentId}",method = RequestMethod.GET)
    public Map<String,Object> studentInfo(@PathVariable final String studentId){

        logger.info("获取学生( "+studentId+" ) 信息");

        if (StringUtils.isEmpty(studentId)){
            return error("请传递正确的学生ID");
        }

        Student student = studentService.get(studentId);

        if(null == student){
            return error("没有找到该学生");
        }

        return success("获取学生",student);
    }
}
