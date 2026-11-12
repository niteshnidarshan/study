package org.example;

import org.example.dto.StudentDto;
import org.example.model.Student;
import org.example.repo.StudentRepo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Jai Ram G ki!
 * Hello world!
 *
 * map vs flatMap
 * Both are intermediate stream operation and return another stream as method output.
 *
 * map can be used to convert one type of object to another type of object
 *  For e.g. Sometime we do not expose directly our model object to network,
 *  we convert model object to dto object then we send through network
 *
 * flatMap can be used to flatten multiple objects to a single object
 *  For e.g. We are having 3 different Integer list,
 *  we want a single list of having all those values.
 *
 *
 *
 */
public class App 
{
    /**
     * Converting Student to StudentDto & returning StudentDto list
     * input: Student list
     * output: StudentDto list
     */
    public static void streamConvert() {
        List<Student> studentList = StudentRepo.getStudentList();
        List<StudentDto> dtoList = studentList.stream().map(s->{
            StudentDto dto = new StudentDto(s.getId(), s.getName(), s.getAge());
            return dto;
        }).collect(Collectors.toList());
        dtoList.stream().forEach(dto-> System.out.println(dto.getDtoName()));
    }

    public static void flatMapExample() {
        List<String> list = Arrays.asList("Geeks", "GFG",
                "GeeksforGeeks", "gfg");

        // Using Stream flatMap(Function mapper)
        list.stream().map(str ->
                        str.charAt(2)).
                forEach(System.out::println);

        System.out.println("#########");
        list.stream().flatMap(str ->
                        Stream.of(str.charAt(2))).
                forEach(System.out::println);
    }

    static void printInFormat(float a, float b){
        float result = a/b;
        // Your code here to print upto 3 decimal places
        System.out.format(result+" = "+"%.3f",result);

    }

    //common interview question
    public static boolean validate() {
        try {
            int x = 5/0;
            System.out.println("try");
            return false;
        }catch(ArithmeticException ae){
            System.out.println("catch1");
            return true;
        }catch(Exception ex) {
            System.out.println("catch2");
            return false;
        }finally{
            System.out.println("finally!");
            //return false;
        }
    }

    //String Pool question
    public static void validateString(String s1) {

        String s2 = "java";
        String s3 = new String("java");
        String s4 = "java";
        System.out.println(s2 == s3); //false
        System.out.println(s2 == s4); //true
        System.out.println(s2 == s1); //true
    }

    public static void main( String[] args )
    {
        System.out.println("Jai Ram G Ki!");
        System.out.println( "Hello World!" );
        validateString("java");
        //System.out.println(validate());

        /*streamConvert();
        flatMapExample();
        printInFormat(5.43f, 2.653f);

        Stream s = Stream.of("Jai", "Ram",  "G", "Ki");
        s.forEach(x->{
            System.out.println(x);
        });*/
    }

}
