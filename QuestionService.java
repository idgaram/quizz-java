public class QuestionService {

   Question[] questions = new Question[5];

   public QuestionService(){
    questions[0] = new Question(1, "quel est nom de moi", "lorys", "leuri", "daniel", "antoine", "lorys");
    questions[1] = new Question(2, "quel est couleur de moi", "lorys", "leuri", "jaune", "antoine", "jaune");
    questions[2] = new Question(3, "quel est age de moi", "28", "leuri", "daniel", "antoine", "28");
    questions[3] = new Question(4, "quel est taille de moi", "lorys", "leuri", "daniel", "1m85", "1m85");
    questions[4] = new Question(5, "quel est sens de la vie", "plaisir", "leuri", "daniel", "antoine", "lorys");

    
   }
   
   public void playQuizz(){

for (Question q : questions) {
   System.out.println("question number: " + q.getId());
   System.out.println(q.getQuestion());
   System.out.println(q.getOpt1());
   System.out.println(q.getOpt2());
   System.out.println(q.getOpt3());
   System.out.println(q.getOpt3());
}
   //  System.out.println(questions[0].getQuestion());
   }
    
}
