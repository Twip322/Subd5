package com.diman.subd.repository;

public class ExamNameWithCount {
    private String examName;
    private Long count;

    @Override
    public String toString() {
        return "{" +
                "examName" + examName +
                ", count" + count + '\'' +
                '}';
    }

    public ExamNameWithCount(String examName,
                             Long count){
        this.examName=examName;
        this.count=count;
    }
    public String getExamName()
    {
        return examName;
    }
    public void setExamName(String examName)
    {
        this.examName=examName;
    }

    public Long getCount()
    {
        return count;
    }

    public void setCount(Long count)
    {
        this.count=count;
    }
}
