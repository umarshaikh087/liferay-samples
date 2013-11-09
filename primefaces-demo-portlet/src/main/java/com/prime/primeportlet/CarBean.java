/*
 * Copyright 2009-2012 Prime Teknoloji.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.prime.primeportlet;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class CarBean implements Serializable {
    
    private final static String[] colors;
	
	private final static String[] manufacturers;
    
    static {
		colors = new String[10];
		colors[0] = "Black";
		colors[1] = "White";
		colors[2] = "Green";
		colors[3] = "Red";
		colors[4] = "Blue";
		colors[5] = "Orange";
		colors[6] = "Silver";
		colors[7] = "Yellow";
		colors[8] = "Brown";
		colors[9] = "Maroon";
		
		manufacturers = new String[10];
		manufacturers[0] = "Mercedes";
		manufacturers[1] = "BMW";
		manufacturers[2] = "Volvo";
		manufacturers[3] = "Audi";
		manufacturers[4] = "Renault";
		manufacturers[5] = "Opel";
		manufacturers[6] = "Volkswagen";
		manufacturers[7] = "Chrysler";
		manufacturers[8] = "Ferrari";
		manufacturers[9] = "Ford";
	}
    
    private List<Car> cars = new ArrayList<Car>();
    
    public CarBean() {
        populateRandomCars(cars, 10);
    }

    public List<Car> getCars() {
        return cars;
    }
    
    private int getRandomYear() {
		return (int) (Math.random() * 50 + 1960);
	}
	
	private String getRandomColor() {
		return colors[(int) (Math.random() * 10)];
	}
	
	private String getRandomManufacturer() {
		return manufacturers[(int) (Math.random() * 10)];
	}
    
    public int getRandomPrice() {
		return (int) (Math.random() * 100000);
	}
    
    private String getRandomModel() {
		return UUID.randomUUID().toString().substring(0, 8);
	}
    
    private void populateRandomCars(List<Car> list, int size) {
		for(int i = 0 ; i < size ; i++) {
			list.add(new Car(getRandomModel(), getRandomYear(), getRandomManufacturer(), getRandomColor()));
        }
	}
}
