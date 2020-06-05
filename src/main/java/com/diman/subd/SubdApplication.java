package com.diman.subd;

import com.diman.subd.repository.*;
import com.diman.subd.services.Interfaces.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.diman.subd.entity.*;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.sql.Timestamp;
import java.util.List;

@SpringBootApplication
public class SubdApplication {

    private final ClassroomRepository classroomRepository;
    private final CourseRepository courseRepository;
    private final ExaminationRepository examinationRepository;
    private final ExaminerRepository examinerRepository;
    private final MatriculantRepository matriculantRepository;
    private final SheetRepository sheetRepository;
    private final ClassroomService classroomService;
    private final CourseService courseService;
    private final ExaminationService examinationService;
    private final ExaminerService examinerService;
    private final MatriculantService matriculantService;
    private final SheetService sheetService;

    @Autowired
    public SubdApplication(ClassroomRepository classroomRepository,
                           CourseRepository courseRepository,
                           ExaminationRepository examinationRepository,
                           ExaminerRepository examinerRepository,
                           MatriculantRepository matriculantRepository,
                           SheetRepository sheetRepository,
                           ClassroomService classroomService,
                           CourseService courseService,
                           ExaminationService examinationService,
                           ExaminerService examinerService,
                           MatriculantService matriculantService,
                           SheetService sheetService) {
        this.classroomRepository = classroomRepository;
        this.courseRepository = courseRepository;
        this.examinationRepository = examinationRepository;
        this.examinerRepository = examinerRepository;
        this.matriculantRepository = matriculantRepository;
        this.sheetRepository = sheetRepository;
        this.classroomService = classroomService;
        this.courseService = courseService;
        this.examinationService = examinationService;
        this.examinerService = examinerService;
        this.matriculantService = matriculantService;
        this.sheetService = sheetService;
    }

    public static void main(String[] args) {
        SpringApplication.run(SubdApplication.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void onStart() {
        System.out.println(classroomService.getAll());
        System.out.println(courseService.getAll());
        System.out.println(examinationService.getAll());
        System.out.println(examinerService.getAll());
        System.out.println(matriculantService.getAll());
        System.out.println(sheetService.getAll());
        firstRequest();
        secondRequest();
        thirdRequest();
    }

    public void firstRequest() {
        Timestamp start = new Timestamp(System.currentTimeMillis());
        List<GetNameMatriculant> resultFirst = matriculantRepository.getNameMatriculants();
        Timestamp end = new Timestamp(System.currentTimeMillis());
        System.out.println("Время выполнения запроса: " + (end.getTime() - start.getTime()) + " мс");
        resultFirst.forEach(getNameMatriculant -> {
            System.out.print("Имя: " + getNameMatriculant.getName() + " ");
            System.out.println(("Фамилия: " + getNameMatriculant.getSurname()));
        });
    }

	public void secondRequest()
	{
		Timestamp start = new Timestamp(System.currentTimeMillis());
		List<CourseNameWithCount> resultSecond = courseRepository.getNameWithCount();
		Timestamp end = new Timestamp(System.currentTimeMillis());
		System.out.println("Время выполнения запроса: " + (end.getTime() - start.getTime()) + " мс");
		resultSecond.forEach(getNameWithCount->{
		    System.out.print("Название направления: "+ getNameWithCount.getCourseName()+" ");
		    System.out.println("Количество: "+ getNameWithCount.getCount());
        });
	}
	public void thirdRequest()
    {
        Timestamp start = new Timestamp(System.currentTimeMillis());
        List<CountSheetThroughExam> resultThird = sheetRepository.getSheetThroughExam();
        Timestamp end = new Timestamp(System.currentTimeMillis());
        System.out.println("Время выполнения запроса: " + (end.getTime() - start.getTime()) + " мс");
        resultThird.forEach(getSheetThroughExam->{
            System.out.print("Название экзамена: "+getSheetThroughExam.getExamName());
            System.out.println("Количество пятерок: "+getSheetThroughExam.getCount());
        });
    }
}
