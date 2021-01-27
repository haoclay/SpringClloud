package com.softeem.feigninterface.fallback;

import com.softeem.feigninterface.IStudentClient;
import com.softeem.pojo.Student;
import org.springframework.stereotype.Component;

/**
 * Author : sgq
 * Date : 2021/1/13 15:27
 */
//@Component
public class StudentClientFallback implements IStudentClient {
    @Override
    public Object findById(Integer id) {
        return null;
    }
}
