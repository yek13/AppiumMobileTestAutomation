package Models;

import org.openqa.selenium.By;

public class HomePageModel extends BaseModel {
    public By backBtn = By.id("com.getir.casestudy.dev:id/ga_toolbar_leftIconImageView");
    public By basketBtn = By.id("com.getir.casestudy.dev:id/ga_toolbar_getir10GABasketButton");

    public HomePageModel(){

    }

    public void clickBack(){
        clickElement(backBtn);
    }

    public void clickBasket(){
        clickElement(basketBtn);
    }
}
