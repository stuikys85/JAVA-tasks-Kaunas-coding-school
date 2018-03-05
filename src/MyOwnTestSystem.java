import collection.exemples.Question;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class MyOwnTestSystem
{
 public static void main (String[]args){
     MyOwnTestSystem myOwnTestSystem = new MyOwnTestSystem();
     Map<Integer, Question> questionMap = myOwnTestSystem.readQuestions();
     List<Integer>questions = new ArrayList<>();


   /*  for(Integer key : questionMap.keySet()) {
         Question q = questionMap.get(key);
         System.out.println(q.getQuestionText());
         for (String v : q.getVariantas()){
             System.out.println(v);
         }
     }*/
  Scanner sc = new Scanner(System.in);
  int correctAnswerCount = 0;
   for(int i = 0; i<10; i++)
   {    int numb;
       while(true){
           Random random = new Random();
           numb = random.nextInt(questionMap.size()) +1;
           if (!questions.contains(numb)){
               break;
           }
       }
       questions.add(numb);

      /* Random random = new Random();// naudojama generuoti random skaicius
        int numb = random.nextInt(questionMap.size())+1;// grazina skaicius random nuo 1iki map ilgio
       if(questions.contains(numb)) {

       }*/
       Question question = questionMap.get(numb);
       System.out.println(question.getQuestionText());
       for(String variant : question.getVariantas()) {
           System.out.println(variant);
       }
           System.out.println("Iveskite savo pasirinkta atsakyma>>");
           int userAnswer = sc.nextInt();
           if(userAnswer == question.getAnswer()){
               correctAnswerCount++;

           }


   }
     System.out.println("jusu testo balas yra>>>"+ correctAnswerCount + "<<<<<");


 }


 private Map<Integer, Question> readQuestions(){

     Map<Integer, Question> questionMap = new HashMap<>();
     try {
         BufferedReader bf = new BufferedReader(new FileReader(new File("questions.txt")));
        String line;
        int key = 1;
         while((line = bf.readLine())!=null)//skaitome po eilute is failo
         {
             String[] items = line.split(";");//skaitome per ;
             String[] examples = items[1].split(" ");// iskaidome variantus per tarpus
             List<String> myItems = Arrays.asList(examples);// sudedame visus variantus i listus utils pagalba
             int answer = Integer.valueOf(items[2].trim());// convertuoja ats is String into Integer remove all empty space

             Question question = new Question(items[0],myItems, answer);// sudedam items i objekta
             questionMap.put(key++, question);
         }

     } catch (java.io.IOException e) {
         e.printStackTrace();
     }
     return  questionMap;

 }
}
