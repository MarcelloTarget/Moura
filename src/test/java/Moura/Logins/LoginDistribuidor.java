package Moura.Logins;

import Moura.core.BasePage;
import static Moura.core.DriverFactory.getDriver;

public class LoginDistribuidor extends BasePage  {



	public void acessarTelaInicial() {
		getDriver().get("http://201.43.117.245:9020/#/admin-distribuidor/login");
	}


}



