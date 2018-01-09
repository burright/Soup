package com.burright.soup.ingredients;

public abstract class Ingredient
{
    private String _name;
    private int _itemNum;

    public Ingredient(String name, int itemNum)
    {
        _name = name;
        _itemNum = itemNum;
    }

    public String getName()
    {
        return _name;
    }

    public int getItemNum()
    {
        return _itemNum;
    }
}
