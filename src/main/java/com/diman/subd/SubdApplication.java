package com.diman.subd;

import com.diman.subd.repository.*;
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

	@Autowired
	public SubdApplication(
			ClassroomRepository classroomRepository,
			CourseRepository courseRepository,
			ExaminationRepository examinationRepository,
			ExaminerRepository examinerRepository,
			MatriculantRepository matriculantRepository,
			SheetRepository sheetRepository){
		this.classroomRepository=classroomRepository;
		this.courseRepository=courseRepository;
		this.examinationRepository=examinationRepository;
		this.examinerRepository=examinerRepository;
		this.matriculantRepository=matriculantRepository;
		this.sheetRepository=sheetRepository;
	}


	public static void main(String[] args) {
		SpringApplication.run(SubdApplication.class, args);
	}
	@EventListener(ApplicationReadyEvent.class)
	public void onStart()
	{
		readClassroom();
		readCourse();
		readExamination();
		readExaminer();
		readMatriculant();
		readSheet();
		//firstRequest();
		//secondRequest();
	}

	/*public void firstRequest() {
		Timestamp start = new Timestamp(System.currentTimeMillis());
		List<CourseNameWithCount> resultFirst = courseRepository.getNameCourseCount();
		Timestamp end = new Timestamp(System.currentTimeMillis());
		System.out.println("Время выполнения запроса: " + (end.getTime() - start.getTime()) + " мс");
		for (CourseNameWithCount model : resultFirst) {
			System.out.println("model = " + model);
		}
	}*/

	/*public void secondRequest()
	{
		Timestamp start = new Timestamp(System.currentTimeMillis());
		List<ExamNameWithCount> resultSecond = sheetRepository.getExamName();
		Timestamp end = new Timestamp(System.currentTimeMillis());
		System.out.println("Время выполнения запроса: " + (end.getTime() - start.getTime()) + " мс");
		for (ExamNameWithCount model : resultSecond) {
			System.out.println("model = " + model);
		}
	}*/

	private void createClassroom()
	{
		Classroom classroom =new Classroom(null,128,3);
		classroomRepository.save(classroom);
	}

	private void delClassroom(){classroomRepository.deleteById(1);}

	private void updateClassroom()
	{
		Classroom classroom=new Classroom(1,111,1);
		classroomRepository.save(classroom);
	}

	private void readClassroom()
	{
		for(Classroom classroom: classroomRepository.findAll(PageRequest.of(0,3, Sort.unsorted())).toList()){
			System.out.println(classroom);
		}
	}
	private void readCourse()
	{
		for(Course course: courseRepository.findAll(PageRequest.of(0,3, Sort.unsorted())).toList()){
			System.out.println(course);
		}
	}
	private void readExamination()
	{
		for(Examination examination: examinationRepository.findAll(PageRequest.of(0,3, Sort.unsorted())).toList()){
			System.out.println(examination);
		}
	}
	private void readExaminer()
	{
		for(Examiner examiner: examinerRepository.findAll(PageRequest.of(0,3, Sort.unsorted())).toList()){
			System.out.println(examiner);
		}
	}
	private void readMatriculant()
	{
		for(Matriculant matriculant: matriculantRepository.findAll(PageRequest.of(0,3, Sort.unsorted())).toList()){
			System.out.println(matriculant);
		}
	}
	private void readSheet()
	{
		for(Sheet sheet: sheetRepository.findAll(PageRequest.of(0,3, Sort.unsorted())).toList()){
			System.out.println(sheet);
		}
	}
}
