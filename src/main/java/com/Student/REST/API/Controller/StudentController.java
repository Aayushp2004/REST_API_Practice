package com.Student.REST.API.Controller;
import com.Student.REST.API.Student;
import com.Student.REST.API.Service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<Student> createStudent(@RequestBody Student student){
        Student savedStudent = studentService.addStudent(student);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedStudent);
    }
//    GET ALL STUDENTS
    @GetMapping
    public ResponseEntity<List<Student>> getAllStudents() {
        return ResponseEntity.ok(studentService.getAllStudent());
    }
    //    READ STUDENT BY ID
    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable Long id) {
        Optional<Student> student = studentService.getStudentByID(id);
        return student.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
    // UPDATE STUDENTS
    @PutMapping("/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable Long id,
                                                 @RequestBody Student student) {

        Optional<Student> updatedStudent = Optional.ofNullable(studentService.updateStudent(id, student));
        return updatedStudent.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
    //DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable Long id) {
        boolean deleted = studentService.deleteStudent(id);
        if (!deleted) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("Student not found with id: " + id);
        }
        return ResponseEntity
                .status(HttpStatus.OK)
                .body("Student deleted successfully");
    }

}
