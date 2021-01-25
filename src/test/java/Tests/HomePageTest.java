package Tests;

import Models.HomePageModel;
import com.thoughtworks.gauge.Step;

public class HomePageTest {
    HomePageModel homePageModel;

    public HomePageTest() {
        this.homePageModel=new HomePageModel();
    }

    @Step("Geri butonuna basılır.")
    public void clickBack(){
        homePageModel.clickBack();
    }

    @Step("Sepet butonuna basılır.")
    public void clickBasket(){
        homePageModel.clickBasket();
    }

}
