package com.cybertek.step_defs;

import com.cybertek.pages.Case8Page;
import com.cybertek.utils.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import jdk.internal.org.objectweb.asm.util.ASMifiable;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;

public class case8StepDefs {

    Case8Page case8Page = new Case8Page();

    @Given("User clicks on Products button")
    public void user_clicks_on_products_button() {
        case8Page.productsBtn.click();
    }

    @Then("Verify user has navigated to {string} page successfully")
    public void verify_user_has_navigated_to_page_successfully(String string) {
        assertEquals(string, Driver.getDriver().getTitle());
    }

    @Then("Verify products list is visible")
    public void verify_products_list_is_visible(List<String> brands) {
        assertTrue(brands.get(0), case8Page.poloBrand.getText().contains("POLO"));
        assertTrue(brands.get(1), case8Page.hNMBrand.getText().contains("H&M"));
        assertTrue(brands.get(2), case8Page.madameBrand.getText().contains("MADAME"));
        assertTrue(brands.get(3), case8Page.mastNHarbourBrand.getText().contains("MAST & HARBOUR"));
        assertTrue(brands.get(4), case8Page.babyHugBrand.getText().contains("BABYHUG"));
        assertTrue(brands.get(5), case8Page.allenSollyJuniorBrand.getText().contains("ALLEN SOLLY JUNIOR"));
        assertTrue(brands.get(6), case8Page.kookieKidsBrand.getText().contains("KOOKIE KIDS"));
        assertTrue(brands.get(7), case8Page.bibaBrand.getText().contains("BIBA"));
    }

    @Then("User clicks on view product of first product")
    public void user_clicks_on_view_product_of_first_product() {
        case8Page.viewProduct1.click();
    }

    @And("Verify that user landed on {string} detail page")
    public void verifyThatUserLandedOnDetailPage(String title) {
        assertEquals(title, Driver.getDriver().getTitle());
    }

    @Then("Verify that detail are is visible  product name {string},category {string},price {string},availability {string}, condition {string}, Brand {string}")
    public void verify_that_detail_are_is_visible_product_name_category_price_availability_condition_brand(String productName, String category
            , String price, String availability, String condition
            , String brand) {

        assertEquals(productName, case8Page.productName.getText());
        assertEquals(category, case8Page.category.getText());
        assertEquals(price, case8Page.price.getText());
        assertTrue(availability,case8Page.availability.getText().contains("In Stock"));
        assertTrue(condition, case8Page.condition.getText().contains("New"));
        assertTrue(brand,case8Page.brand.getText().contains("Polo"));
    }


}
