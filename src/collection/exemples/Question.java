package collection.exemples;

import java.util.List;

public class Question {
    private String questionText;
    private List<String> variantas;
    private int answer;


    public Question(String questionText, List<String> variantas, int answer) {
        this.questionText = questionText;
        this.variantas = variantas;
        this.answer = answer;
    }

    public String getQuestionText() {
        return questionText;
    }

    public List<String> getVariantas() {
        return variantas;
    }

    public int getAnswer() {
        return answer;
    }
}
