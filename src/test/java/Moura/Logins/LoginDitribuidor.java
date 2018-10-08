package Moura.Logins;

import Moura.core.BasePage;
import static Moura.core.DriverFactory.getDriver;

public class LoginDitribuidor extends BasePage  {



	public void acessarTelaInicial() {
		getDriver().get("http://201.68.172.120:9020/#/admin-distribuidor/login");
	}


}



