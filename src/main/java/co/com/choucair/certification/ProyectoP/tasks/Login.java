package co.com.choucair.certification.ProyectoP.tasks;

import co.com.choucair.certification.ProyectoP.userinterface.ChoucairLoginPage;
import cucumber.api.java.af.En;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


public class Login implements Task {
    private String stUser;
    private String stPassword;

    public static Login getOnThepage() {
        return onThepage;
    }

    public static void setOnThepage(Login onThepage) {
        Login.onThepage = onThepage;
    }

    public static Login onThepage;

    public String getStUser() {
        return stUser;
    }

    public void setStUser(String stUser) {
        this.stUser = stUser;
    }

    public String getStPassword() {
        return stPassword;
    }

    public void setStPassword(String stPassword) {
        this.stPassword = stPassword;
    }

    public static Login onThePage(String stUser, String stPassword){

        return Tasks.instrumented(Login.class,stUser,stPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
actor.attemptsTo(Click.on(ChoucairLoginPage.LOGIN_BUTTON),
        Enter.theValue(stUser).into(ChoucairLoginPage.INPUT_USER),
        Enter.theValue(stPassword).into(ChoucairLoginPage.INPUT_PASSWORD),
        Click.on(ChoucairLoginPage.ACCES_BUTTON)
);
    }
}
