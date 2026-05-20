package models;

import java.util.Arrays;

public class Brand {
private String brandName;
private  CarModel []models;



public Brand(String brandName, CarModel[] models) {
  this.brandName = brandName;
  this.models = models;
}


public int getTotalValidYears() {
  int totalValidYears = 0;
  for(CarModel c : models){
    for(CarYear y: c.getYears()){
      if(y.isValid()==true){
        totalValidYears++;
      }
    }
  }
    return totalValidYears;    
    }



public String getBrandName() {
  return brandName;
}



public void setBrandName(String brandName) {
  this.brandName = brandName;
}



public CarModel[] getModels() {
  return models;
}



public void setModels(CarModel[] models) {
  this.models = models;
}


@Override
public String toString() {
  return "Brand [brandName=" + brandName + ", models=" + Arrays.toString(models) + "]";
}


}
