package io;


public class App 
{
    public static void main( String[] args )
    {
         StudentDao studnetDao = new  Daoimpl();
         for(Student student:studnetDao.getAllStudent()) {
        	 System.out.println("Name"+student.getName()+"\n Roll:\n"+student.getRoll()+"Age:"+student.getAge());
         }
         
         Student student = studnetDao.getstudent(0);
         student.setAge(25);
         student.setName("Radhe");
         student.setRoll(1);
         studnetDao.upadteStudent(student);
         student = studnetDao.getstudent(0);
    	 System.out.println("Name"+student.getName()+"\n Roll:\n"+student.getRoll()+"Age:"+student.getAge());
         
    
    
    
    }
   
}
