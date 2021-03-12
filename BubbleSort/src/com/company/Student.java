package com.company;



public class Student implements Comparable<Student> {
   private String name;
   private int age;
   private String sex;

   public Student (String name, int age, String sex){
    this.age = age;
    this.name = name;
    this.sex = sex;

   }
   public void setSex(String sex) {this.sex= sex; }
   public void setName(String name) {this.name = name; }
   public void setAge(int age) {this.age = age; }

   public String getName() {return name; }
   public String getSex() {return sex; }
   public int getAge() {return age; }

    @Override
    public int compareTo(Student o) {
        return this.getName().compareTo(o.getName());
    }
}
