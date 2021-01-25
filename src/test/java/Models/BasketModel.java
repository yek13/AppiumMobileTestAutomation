package Models;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class BasketModel extends BaseModel {

    public By totalCountParent = By.id("com.getir.casestudy.dev:id/totalCountParent");
    public By btnRemove = By.id("com.getir.casestudy.dev:id/btnRemove");
    public By btnAddProduct = By.id("com.getir.casestudy.dev:id/btnAdd");
    public Random random = new Random();

    public BasketModel(){
    }

    public boolean checkBasketProduct(){
        return isElementDisplayed(totalCountParent);

    }

    public void clickRemoveButton() {
        while (isElementVisible(btnRemove)){
            clickElement(btnRemove);
        }

    }

    public void clickAddToRandomProduct() {
        List<WebElement> productlist = findElements(btnAddProduct);
        int randomProductNumber = random.nextInt(productlist.size());
        clickElement(productlist.get(randomProductNumber));
    }

    public void addMoreThanProduct(int product) {
        List<WebElement> productlist = findElements(btnAddProduct);
        for (int i=0;i<product;i++){
            clickElement(productlist.get(i));

        }
    }
    public void productIncreased() {
        List<WebElement> addButtonList = findElements(btnAddProduct);
        for (int i = 0; i < addButtonList.size(); i++) {
            clickElement(addButtonList.get(i));
        }
    }
}
