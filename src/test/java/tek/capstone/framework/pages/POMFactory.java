package tek.capstone.framework.pages;

import tek.bdd.guardians.base.BaseSetup;

public class POMFactory extends BaseSetup {
	private RetailHomePage homePage;
	public POMFactory() {
		this.homePage = new RetailHomePage();
		
	}
	public RetailHomePage homePage() {
		return this.homePage;
	}

}
