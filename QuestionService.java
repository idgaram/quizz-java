import java.util.Scanner;

public class QuestionService {

   Question[] questions = new Question[5];
   String selection[] = new String[5];


   public QuestionService(){
    questions[0] = new Question(1, "quel est nom de moi", "lorys", "leuri", "daniel", "antoine", "lorys");
    questions[1] = new Question(2, "quel est couleur de moi", "lorys", "leuri", "jaune", "antoine", "jaune");
    questions[2] = new Question(3, "quel est age de moi", "28", "leuri", "daniel", "antoine", "28");
    questions[3] = new Question(4, "quel est taille de moi", "lorys", "leuri", "daniel", "1m85", "1m85");
    questions[4] = new Question(5, "quel est sens de la vie", "plaisir", "leuri", "daniel", "antoine", "plaisir");

    
   }
   
   public void playQuizz(){

      int i = 0;
for (Question q : questions) {

   System.out.println("question number: " + q.getId());
   System.out.println(q.getQuestion());
   System.out.println(q.getOpt1());
   System.out.println(q.getOpt2());
   System.out.println(q.getOpt3());
   System.out.println(q.getOpt4());

   Scanner sc = new Scanner(System.in);
   selection[i] = sc.nextLine();
   // sc.close();
   i++;
}
for (String answer : selection) {
    System.out.println(answer);
}

   }
   public void displayScore(){
      int score = 0;

      for (int i = 0; i < questions.length; i++) {
          Question q = questions[i];
          String answer = q.getAnswer();
          
          String userAnswer = selection[i];
          if(answer.equals(userAnswer)){
            score++;
          }
         }
         System.out.println("score is " + score);
   }
    
}
