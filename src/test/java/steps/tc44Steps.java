package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.tc44Page;

public class tc44Steps {

    tc44Page page = new tc44Page();

    @Given("El operador está en la pantalla de visualización de anexos")
    public void el_operador_esta_en_la_pantalla_de_visualizacion_de_anexos() {
        // Aquí se navega a la pantalla inicial de visualización de anexos
        page.navigateToAnexosScreen();
    }

    @When("El operador accede a la opción de visualizar el archivo anexo relacionado")
    public void el_operador_accede_a_la_opcion_de_visualizar_el_archivo_anexo_relacionado() {
        // Acceder a la visualización del archivo anexo
        page.viewAttachedFile();
    }

    @Then("El sistema carga el archivo sin corrupción de datos")
    public void el_sistema_carga_el_archivo_sin_corrupcion_de_datos() {
        // Verificación de la carga sin corrupción
        Assert.assertTrue(page.isFileLoadedWithoutCorruption());
    }

    @Then("El sistema analiza el contenido del archivo")
    public void el_sistema_analiza_el_contenido_del_archivo() {
        // Analizar el contenido del archivo
        Assert.assertTrue(page.analyzeFileContent());
    }

    @Then("El análisis confirma que los datos son correctos")
    public void el_analisis_confirma_que_los_datos_son_correctos() {
        // Verificación de la integridad mediante análisis
        Assert.assertTrue(page.isDataIntegrityConfirmed());
    }

    @When("El operador finaliza la revisión")
    public void el_operador_finaliza_la_revision() {
        // Acción de finalizar la revisión
        page.finishReview();
    }

    @When("El operador confirma la integridad de los datos presentados")
    public void el_operador_confirma_la_integridad_de_los_datos_presentados() {
        // Confirmación de integridad por parte del operador
        page.confirmDataIntegrity();
    }

    @Then("El sistema registra la validación de integridad sin incidencias")
    public void el_sistema_registra_la_validacion_de_integridad_sin_incidencias() {
        // Verificación de que la validación se registró correctamente
        Assert.assertTrue(page.isValidationRecordedSuccessfully());
    }
}