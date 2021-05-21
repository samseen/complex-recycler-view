package com.example.foodordering;

import java.util.ArrayList;

public interface UpdateSelectedItems {
    void addItems(String name, int price);

    ArrayList<OrderListModel> getItems();
}
