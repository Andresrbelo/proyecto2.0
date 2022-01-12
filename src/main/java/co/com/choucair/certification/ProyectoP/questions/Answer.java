package co.com.choucair.certification.ProyectoP.questions;

import co.com.choucair.certification.ProyectoP.userinterface.SearchCoursePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {
    private String question;

    public Answer(String question){
        this.question=question;

    }

    public static Answer toThe(String question){
        return new Answer(question);
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String BUTTON_S = actor.getName();
        if (question.equals(BUTTON_S)){
            result=true;
        }else {
            result=false;
        }
        return result;
    }
}
