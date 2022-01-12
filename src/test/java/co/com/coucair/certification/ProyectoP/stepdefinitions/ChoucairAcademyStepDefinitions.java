package co.com.coucair.certification.ProyectoP.stepdefinitions;
import co.com.choucair.certification.ProyectoP.model.AcademyChoucairdata;
import co.com.choucair.certification.ProyectoP.questions.Answer;
import co.com.choucair.certification.ProyectoP.tasks.Login;
import co.com.choucair.certification.ProyectoP.tasks.OpenUp;
import co.com.choucair.certification.ProyectoP.tasks.Search;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.Before;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;


public class ChoucairAcademyStepDefinitions {



    @Before
public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Andres wants to learn financial analysis$")
    public void thanAndresWantsToLearnFinancialAnalysis(List<AcademyChoucairdata> academychoucairdata) throws Exception {
        OnStage.theActorCalled("Andres").wasAbleTo(OpenUp.thePage(), Login.
                onThePage(academychoucairdata.get(0).getStUser(),academychoucairdata.get(0).getStPassword()));


    }

    @When("^he search for the course (.*) on the choucair academy platform$")
    public void heSearchForTheCourseFinancialAnalysisOnTheChoucairAcademyPlatform(List<AcademyChoucairdata> academyChoucairdata )throws Exception {

    OnStage.theActorInTheSpotlight().attemptsTo(Search.the(academyChoucairdata.get(0).getCourse()));

    }

    @Then("^ge find the course called technical guide - (.*)$")
    public void geFindTheCourseCalledTechnicalGuideFinancialAnalysis(List<AcademyChoucairdata> academyChoucairdata )throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(academyChoucairdata.get(0).getCourse())));
    }


}
