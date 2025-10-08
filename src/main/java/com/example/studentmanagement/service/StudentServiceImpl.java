package com.example.studentmanagement.service;

import com.example.studentmanagement.entity.Student;
import com.example.studentmanagement.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        float total = student.getMarks1() + student.getMarks2() + student.getMarks3()
                + student.getMarks4() + student.getMarks5();
        float percentage = total / 5;
        student.setPercentage(percentage);

        if (percentage >= 60) {
            student.setDivision("First Division");
        } else if (percentage >= 50) {
            student.setDivision("Second Division");
        } else {
            student.setDivision("Fail");
        }

        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    @Override
    public Student updateStudent(Long id, Student studentDetails) {
        Student student = studentRepository.findById(id).orElse(null);
        if (student != null) {
            student.setName(studentDetails.getName());
            student.setAge(studentDetails.getAge());
            student.setMarks1(studentDetails.getMarks1());
            student.setMarks2(studentDetails.getMarks2());
            student.setMarks3(studentDetails.getMarks3());
            student.setMarks4(studentDetails.getMarks4());
            student.setMarks5(studentDetails.getMarks5());

            
            float total = student.getMarks1() + student.getMarks2() + student.getMarks3()
                    + student.getMarks4() + student.getMarks5();
            float percentage = total / 5;
            student.setPercentage(percentage);

            if (percentage >= 60) {
                student.setDivision("First Division");
            } else if (percentage >= 50) {
                student.setDivision("Second Division");
            } else {
                student.setDivision("Fail");
            }

            return studentRepository.save(student);
        }
        return null;
    }

    @Override
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
}
