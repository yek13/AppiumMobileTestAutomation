package Models;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class CategoryModel extends BaseModel {
    public By tvTitle = By.id("com.getir.casestudy.dev:id/tvTitle");
    public  By textCategory = By.className("android.widget.TextView");

    public By ViewGroup = By.id("android.view.ViewGroup");
    ArrayList<String> categoryMap = new ArrayList<>();


    public CategoryModel(){
        categoryMap.add("Meyve ve Sebze");
        categoryMap.add("Atıştırmalık");
        categoryMap.add("Dondurma");
        categoryMap.add("Yiyecek");
        categoryMap.add("İçecek");
        categoryMap.add("Fit & Form");
        categoryMap.add("Süt & Kahvaltı");
        categoryMap.add("Temel Gıda");
        categoryMap.add("Kişisel Bakım");
        categoryMap.add("Ev & Yaşam");
        categoryMap.add("Ev Bakım");
        categoryMap.add("Teknoloji");
        categoryMap.add("Bebek");
    }


    public void clickCategoryName(String categoryName){

        for (int i=0;i<categoryMap.size();i++){

            if (categoryMap.get(i).equals(categoryName) && i<10){


                findElements(tvTitle).get(i).click();
                break;

            }


        }



    }

}
