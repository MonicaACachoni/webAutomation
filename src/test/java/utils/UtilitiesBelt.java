package utils;

import com.github.javafaker.Faker;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebElement;

public class UtilitiesBelt
{

    Faker faker = new Faker();

    public void clearSendKeysField(WebElement field, String content){
        field.clear();
        field.sendKeys(content);
    }

    public String firstNameGenerator(){

        String firstName = faker.name().firstName();

        return firstName;
    }

    public String lastNameGenerator(){

        String lastName = faker.name().lastName();

        return lastName;
    }

    public String passwordGenerator(int length) {
        return RandomStringUtils.random(length);
    }

    public String phoneGenerator(int length) {
        return RandomStringUtils.randomNumeric(length);
    }

    public String address1Generator(){

        String address = faker.address().streetAddress();

        return address;
    }

    public String address2Generator(){

        String address = faker.address().city() + " / " + faker.address().state();

        return address;
    }
}