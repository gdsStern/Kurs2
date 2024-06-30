package pro.sky.Kurs2;

import pro.sky.Kurs2.controllers.ExamController;
import pro.sky.Kurs2.services.ExaminerServiceImpl;
import pro.sky.Kurs2.services.JavaQuestionService;

public class Programm {
    public static void main(String[] args) {
        ExaminerServiceImpl examinerService = new ExaminerServiceImpl(new JavaQuestionService());
        System.out.println(examinerService.getQuestions(5));
    }
}
