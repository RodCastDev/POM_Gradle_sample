package stepdefinitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.GuruHome;
import pages.GuruLogin;


public class stepdefinitions {

    GuruLogin loginPage;
    GuruHome homePage;

    @Before
    public void beforeTest (){
        System.out.println("@Before");
    }

    @Given("^Deseo ir a la pagina de \"([^\"]*)\"$")
    public  void deseoIrAlaPaginaDe(String strUrl){
        System.out.println("@Given " + strUrl);
        loginPage.navegateTo(strUrl);
    }

    @When("^Ingreso nombre de usuario \"([^\"]*)\" y password \"([^\"]*)\"$")
    public void ingresoNombreDeUsuarioYPassword(String strUserName, String strPass){
        System.out.println("@When " + strUserName + " " + strPass );
        loginPage.login(strUserName, strPass);
    }
    @Then("^Valido que el titulo sea \"([^\"]*)\"$")
    public void validoQueElTituloSea (String strMensaje){
        System.out.println("@Then " + strMensaje);
        homePage.validateTitle(strMensaje);
    }
    @After
    public void afterTest (){
        System.out.println("@After");
    }
}
