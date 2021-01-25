package Tests;

import Models.BasketModel;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;

public class BasketTest {

    BasketModel basketModel;

    public BasketTest() {
        this.basketModel=new BasketModel();
    }

    @Step("Sepetin boş olup olmadığının kontrolünü yapar")
    public void checkBasketProduct(){
        Assert.assertFalse("Sepette ürün bulunmaktadır.",basketModel.checkBasketProduct());
    }
    @Step("Sepetteki tüm ürünler silinir.")
    public void clickRemoveButton(){
        basketModel.clickRemoveButton();
    }

    @Step("Kategoriden rastgele <key> ürün seçilir")
    public void addRandomProductToBasket(int randomPruduct){
        for (int i=0;i<randomPruduct;i++){
            basketModel.clickAddToRandomProduct();
        }
    }

    @Step("Kategorisinden <key> üründen <key> tane eklenir")
    public void addMoreThanProduct(int product,int numberOfProducts){
        for (int i=0;i<numberOfProducts;i++){
            basketModel.addMoreThanProduct(product);
        }
    }

    @Step("Sepet ekranında eklenen ürünler birer tane arttırılır")
    public void productIncreased(){
        basketModel.productIncreased();
    }

}
