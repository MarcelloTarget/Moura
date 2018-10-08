package Page.Aprovacao.Balconista.Gerente;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Moura.core.DriverFactory.getDriver;

import java.util.concurrent.TimeUnit;

import Moura.core.BasePage;

public class AprovacaoGerente extends BasePage {
	
	public void InformeCNPJ() throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(getDriver(), 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("cnpj"))).click();
		
	}
	
	
	

}
