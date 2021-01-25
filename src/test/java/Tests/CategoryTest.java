package Tests;

import Models.CategoryModel;
import com.thoughtworks.gauge.Step;

public class CategoryTest {
    CategoryModel categoryModel;

    public CategoryTest() {
        this.categoryModel=new CategoryModel();
    }

    @Step("<key> kategorisine tıklanır")
    public void setUser(String categoryName){
        categoryModel.clickCategoryName(categoryName);
    }



}
