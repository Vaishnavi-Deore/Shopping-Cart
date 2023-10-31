package com.example.grocerylist.UI

import com.example.grocerylist.Database.Entity.GroceryItems

interface DialogListener {

    // Create a function to add items
    // in GroceryItems on clicking
    fun onAddButtonClicked(item:GroceryItems)
}
