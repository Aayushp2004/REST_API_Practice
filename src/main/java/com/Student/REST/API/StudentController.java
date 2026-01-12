package com.Student.REST.API;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    // CREATE-STUDENT
    @PostMapping
    public Student createStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }

//    GET ALL STUDENTS
    @GetMapping
    public List<Student> getAllStudents(){
        return studentService.getAllStudent();
    }

//    READ STUDENT BY ID
    @GetMapping("/{id}")
    public Optional<Student> getStudent(@PathVariable Long id){
        return studentService.getStudentByID(id);
    }

    // UPDATE STUDENTS
    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Long id,
                                 @RequestBody Student student){
        return studentService.updateStudent(id, student);
    }

    //DELETE
    @DeleteMapping("/{id}")
    public String deleteStudents(@PathVariable Long id){
         studentService.deleteStudent(id);
         return "Student Deleted Successfully." ;

    }




}
