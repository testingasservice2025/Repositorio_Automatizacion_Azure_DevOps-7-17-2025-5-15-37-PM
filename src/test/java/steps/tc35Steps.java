package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc35Page;

public class tc35Steps {

    tc35Page page = new tc35Page();

    @Given("^el operador accede al módulo de operaciones pasivas$")
    public void el_operador_accede_al_módulo_de_operaciones_pasivas() {
        page.navigateToOperationsModule();
    }

    @Then("^el módulo se carga sin errores$")
    public void el_módulo_se_carga_sin_errores() {
        Assert.assertTrue(page.isModuleLoaded());
    }

    @When("^el sistema presenta opciones claras para consulta y sincronización$")
    public void el_sistema_presenta_opciones_claras_para_consulta_y_sincronización() {
        Assert.assertTrue(page.areOptionsVisible());
    }

    @Then("^las opciones son visibles y accesibles$")
    public void las_opciones_son_visibles_y_accesibles() {
        Assert.assertTrue(page.areOptionsAccessible());
    }

    @When("^el operador interactúa con diferentes funcionalidades del módulo$")
    public void el_operador_interactúa_con_diferentes_funcionalidades_del_módulo() {
        page.interactWithModuleFunctionalities();
    }

    @Then("^el sistema responde con rapidez y sin fallos$")
    public void el_sistema_responde_con_rapidez_y_sin_fallos() {
        Assert.assertTrue(page.isSystemResponsive());
    }
}