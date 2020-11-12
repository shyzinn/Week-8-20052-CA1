package com.gustavo.shoppingcart.repositories;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.gustavo.shoppingcart.models.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ShopRepo {

    private MutableLiveData<List<Product>> mutableProductList;

    public LiveData<List<Product>> getProducts() {
        if (mutableProductList == null) {
            mutableProductList = new MutableLiveData<>();
            loadProducts();
        }
        return mutableProductList;
    }

    private void loadProducts() {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(UUID.randomUUID().toString(), "Darjelling Tea", 8.50, true, "https://images-na.ssl-images-amazon.com/images/I/61R0wi23SbL._SL1000_.jpg"));
        productList.add(new Product(UUID.randomUUID().toString(), "Assam Tea", 7.50, true, "https://images-na.ssl-images-amazon.com/images/I/71jxfRLMwbL._SX569_.jpg"));
        productList.add(new Product(UUID.randomUUID().toString(), "Lapsang : Sous", 9.50, true, "https://s3.images-iherb.com/twn/twn15410/l/1.jpg"));
        productList.add(new Product(UUID.randomUUID().toString(), "Earl Grey", 3.50, true, "https://target.scene7.com/is/image/Target/GUEST_a12e5940-6ca0-4921-8fab-96fec98a77b3?wid=488&hei=488&fmt=pjpeg"));
        productList.add(new Product(UUID.randomUUID().toString(), "Irish Break Fast", 2.50, true, "https://ratetea.com/images/u/24d663b7e7c202a9714ef56c8ea93ad3-1280.jpg"));
//        productList.add(new Product(UUID.randomUUID().toString(), "iPhone 11 Pro Max", 1099, true, "https://firebasestorage.googleapis.com/v0/b/notes-16738.appspot.com/o/products%2Fiphone11promax.png?alt=media&token=109a89bd-e52b-4b76-91d4-5175aa516a23"));
//        productList.add(new Product(UUID.randomUUID().toString(), "iPhone SE", 399, true, "https://firebasestorage.googleapis.com/v0/b/notes-16738.appspot.com/o/products%2Fiphonese.jpeg?alt=media&token=8a3a144d-0cd8-4f6d-94cb-0d81634ea5d0"));
//        productList.add(new Product(UUID.randomUUID().toString(), "MacBook Air", 999, true, "https://firebasestorage.googleapis.com/v0/b/notes-16738.appspot.com/o/products%2Fmacbookair.jpeg?alt=media&token=aae96a4a-e86a-4a15-825a-3da9851330c8"));
//        productList.add(new Product(UUID.randomUUID().toString(), "MacBook Pro 13", 1299, true, "https://firebasestorage.googleapis.com/v0/b/notes-16738.appspot.com/o/products%2Fmbp13touch.jpeg?alt=media&token=88c2bf8e-e72d-4243-a9ab-4cc32e3aff18"));
//        productList.add(new Product(UUID.randomUUID().toString(), "MacBook Pro 16", 2399, true, "https://firebasestorage.googleapis.com/v0/b/notes-16738.appspot.com/o/products%2Fmbp16touch.jpeg?alt=media&token=24498b7f-09b8-42ea-9edb-1bad649902d4"));
        mutableProductList.setValue(productList);
    }
}
