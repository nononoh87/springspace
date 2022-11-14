package ex2_annotation;

import org.springframework.stereotype.Component;

@Component
public class MemberBean {
   private String name = "홍길동";
   private int age = 33;
   private String message = "오늘도 화이팅!";
   //constructor
//   public MemberBean(String name, int age, String message) {
//      super();
//      this.name = name;
//      this.age = age;
//      this.message = message;
//      System.out.println("constructor with parameters");
//   }
//   public MemberBean() {
//      System.out.println("basic constructor");
//   }
   
   public void output() {
	   System.out.println(name +"[" + age + "]" +message);
   }
   
   //setters and getters
//   public String getName() {
//      return name;
//   }
//   public void setName(String name) {
//      this.name = name;
//   }
//   public int getAge() {
//      return age;
//   }
//   public void setAge(int age) {
//      this.age = age;
//   }
//   public String getMessage() {
//      return message;
//   }
//   public void setMessage(String message) {
//      this.message = message;
//   }

}