package com.developer.studentManagement;


import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class StudentController {

    Map<Integer, Student> hm = new HashMap<>();

    //GetMapping is used to read the present data
    //localhost:8080/get?id=admnNo
    @GetMapping("/get")
    Student getStudent(@RequestParam("id") int admnNo) {
        return hm.get(admnNo);
    }


    //PostMapping is used to add the new data
    // when we take an object as input then take use RequestBody().
    //localhost:8080/add
    @PostMapping("/add")
    String addStudent(@RequestBody() Student student) {
        hm.put(student.getAdmnNo(), student);
        return "new Student data added";
    }


    //DeleteMapping is used to delete the present data
    @DeleteMapping("/delete/{id}")
    String deleteStudent(@PathVariable("id") int admnNo) {
        hm.remove(admnNo);
        return "Student data deleted";
    }


//    @PutMapping("/update")
//    String updateStudent(@RequestParam("id"))

}